package gr.di.uoa.jenaspatial.operations;

import org.apache.jena.graph.Node;
import org.apache.jena.sparql.expr.NodeValue;
import org.apache.jena.sparql.function.FunctionBase3;
import com.esri.core.geometry.ogc.OGCGeometry;

import gr.di.uoa.jenaspatial.utils.PrepareWKT;

/* uses distance from com.esri.core.geometry.ogc.OGCGeometry; */
public class Relate extends FunctionBase3{
	
public Relate() { super() ; }
	
	
	private OGCGeometry obj1;
	private OGCGeometry obj2;
	String relation;
	
	@Override
	public NodeValue exec(NodeValue v1, NodeValue v2, NodeValue v3) {
		Node n1 = v1.asNode();
		Node n2 = v2.asNode();		
		Node n3 = v3.asNode();
		obj1 = OGCGeometry.fromText(PrepareWKT.prepare(n1.toString()));
		obj2 = OGCGeometry.fromText(PrepareWKT.prepare(n2.toString()));
		relation = n3.toString();
		relation = relation.substring(relation.lastIndexOf("#") + 1);
		
		boolean result;
		if(relation.compareToIgnoreCase("intersects") == 0)
			result = obj1.intersects(obj2);
		else if(relation.compareToIgnoreCase("equals") == 0)
			result = obj1.equals(obj2);
		else if(relation.compareToIgnoreCase("contains") == 0)
			result = obj1.contains(obj2);
		else if(relation.compareToIgnoreCase("crosses") == 0)
			result = obj1.crosses(obj2);
		else if(relation.compareToIgnoreCase("disjoint") == 0)
			result = obj1.disjoint(obj2);
		else if(relation.compareToIgnoreCase("overlaps") == 0)
			result = obj1.overlaps(obj2);
		else if(relation.compareToIgnoreCase("touches") == 0)
			result = obj1.touches(obj2);
		else if(relation.compareToIgnoreCase("within") == 0)
			result = obj1.within(obj2);
		else
			throw new IllegalArgumentException("Relation must be: intersects, equals, touches, within, contains, crosses, disjoint, overlaps");
		
		if(result)
			return NodeValue.parse("true");
		else
			return NodeValue.parse("false");
		
	}

}

package gr.di.uoa.jenaspatial.operations;

import org.apache.jena.graph.Node;
import org.apache.jena.sparql.expr.NodeValue;
import org.apache.jena.sparql.function.FunctionBase2;
import com.esri.core.geometry.ogc.OGCGeometry;

import gr.di.uoa.jenaspatial.utils.PrepareWKT;

/* uses within from com.esri.core.geometry.ogc.OGCGeometry; */
public class Within extends FunctionBase2{
	
public Within() { super() ; }
	
	
	private OGCGeometry obj1;
	private OGCGeometry obj2;
	
	@Override
	public NodeValue exec(NodeValue v1, NodeValue v2) {
		Node n1 = v1.asNode();
		Node n2 = v2.asNode();			
		obj1 = OGCGeometry.fromText(PrepareWKT.prepare(n1.toString()));
		obj2 = OGCGeometry.fromText(PrepareWKT.prepare(n2.toString()));
		
		boolean result = obj1.within(obj2);
		return NodeValue.booleanReturn(result);
		
		
	}

}

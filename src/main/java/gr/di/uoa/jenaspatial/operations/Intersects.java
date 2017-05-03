package gr.di.uoa.jenaspatial.operations;

import org.apache.jena.graph.Node;
import org.apache.jena.sparql.expr.NodeValue;
import org.apache.jena.sparql.function.FunctionBase2;
import com.esri.core.geometry.ogc.OGCGeometry;

/* uses intersects from com.esri.core.geometry.ogc.OGCGeometry; */
public class Intersects extends FunctionBase2{
	
public Intersects() { super() ; }
	
	
	private OGCGeometry obj;
	private OGCGeometry obj2;
	
	@Override
	public NodeValue exec(NodeValue v1, NodeValue v2) {
		Node n1 = v1.asNode();
		Node n2 = v2.asNode();			
		obj = OGCGeometry.fromText(n1.toString().replace("\"", ""));
		obj2 = OGCGeometry.fromText(n2.toString().replace("\"", ""));
		
		boolean result = obj.intersects(obj2);
		if(result)
			return NodeValue.parse("true");
		else
			return NodeValue.parse("false");
		
		
	}

}

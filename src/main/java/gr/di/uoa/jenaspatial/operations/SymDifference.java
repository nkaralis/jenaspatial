package gr.di.uoa.jenaspatial.operations;

import org.apache.jena.graph.Node;
import org.apache.jena.sparql.expr.NodeValue;
import org.apache.jena.sparql.function.FunctionBase2;
import com.esri.core.geometry.ogc.OGCGeometry;

/* uses symDifference from com.esri.core.geometry.ogc.OGCGeometry; */
public class SymDifference extends FunctionBase2{
	
public SymDifference() { super() ; }
	
	private OGCGeometry obj;
	private OGCGeometry obj2;
	
	@Override
	public NodeValue exec(NodeValue v1, NodeValue v2) {
		Node n1 = v1.asNode();
		Node n2 = v2.asNode();
		obj = OGCGeometry.fromText(n1.toString().replace("\"", ""));
		obj2 = OGCGeometry.fromText(n2.toString().replace("\"", ""));
		
		OGCGeometry result = obj.symDifference(obj2);
		
		/* we have to add the quotes in order for the parser to accept the string */
		return NodeValue.parse("\"" + result.asText().toString() + "\"");
		
	}

}

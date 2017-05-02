package gr.di.uoa.jenaspatial.operations;

import org.apache.jena.graph.Node;
import org.apache.jena.sparql.expr.NodeValue;
import org.apache.jena.sparql.function.FunctionBase2;
import com.esri.core.geometry.ogc.OGCGeometry;

/* uses distance from com.esri.core.geometry.ogc.OGCGeometry; */
public class Buffer extends FunctionBase2{
	
public Buffer() { super() ; }
	
	
	private OGCGeometry obj;
	Double distance;
	
	@Override
	public NodeValue exec(NodeValue v1, NodeValue v2) {
		Node n = v1.asNode();
		distance = v2.getDouble();	
		obj = OGCGeometry.fromText(n.toString().replace("\"", ""));
		
		OGCGeometry result = obj.buffer(distance);
		
		/* we have to add the quotes in order for the parser to accept the string */
		return NodeValue.parse("\"" + result.asText().toString() + "\"");
		
	}

}


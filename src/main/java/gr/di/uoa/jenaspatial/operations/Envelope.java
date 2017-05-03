package gr.di.uoa.jenaspatial.operations;

import org.apache.jena.graph.Node;
import org.apache.jena.sparql.expr.NodeValue;
import org.apache.jena.sparql.function.FunctionBase1;

import com.esri.core.geometry.ogc.OGCGeometry;

/* uses envelope from com.esri.core.geometry.ogc.OGCGeometry; */
public class Envelope extends FunctionBase1{
	
public Envelope() { super() ; }
	
	private OGCGeometry obj;
	
	@Override
	public NodeValue exec(NodeValue v) {
		Node n = v.asNode();
		obj = OGCGeometry.fromText(n.toString().replace("\"", ""));
		
		OGCGeometry result = obj.envelope();
		
		/* we have to add the quotes in order for the parser to accept the string */
		return NodeValue.parse("\"" + result.asText().toString() + "\"");
		
	}

}


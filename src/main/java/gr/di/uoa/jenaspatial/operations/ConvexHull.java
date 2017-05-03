package gr.di.uoa.jenaspatial.operations;

import org.apache.jena.graph.Node;
import org.apache.jena.sparql.expr.NodeValue;
import org.apache.jena.sparql.function.FunctionBase1;

import com.esri.core.geometry.ogc.OGCGeometry;

import gr.di.uoa.jenaspatial.utils.PrepareWKT;

/* uses convexHull from com.esri.core.geometry.ogc.OGCGeometry; */
public class ConvexHull extends FunctionBase1{
	
public ConvexHull() { super() ; }
	
	private OGCGeometry obj;
	
	@Override
	public NodeValue exec(NodeValue v) {
		Node n = v.asNode();
		obj = OGCGeometry.fromText(PrepareWKT.prepare(n.toString()));
		
		OGCGeometry result = obj.convexHull();
		
		/* we have to add the quotes in order for the parser to accept the string */
		return NodeValue.parse("\"" + result.asText().toString() + "\"");
		
	}

}

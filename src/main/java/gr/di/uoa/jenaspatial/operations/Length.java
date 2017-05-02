package gr.di.uoa.jenaspatial.operations;

import org.apache.jena.graph.Node;
import org.apache.jena.sparql.expr.NodeValue;
import org.apache.jena.sparql.function.FunctionBase1;
import com.esri.core.geometry.ogc.OGCGeometry;

/* uses com.esri.hadoop.hive.ST_Length */
public class Length extends FunctionBase1{
	
public Length() { super() ; }
	
	private static OGCGeometry obj;
	private static Double length;
	
	@Override
	public NodeValue exec(NodeValue v) {
		Node n = v.asNode();
		obj = OGCGeometry.fromText(n.toString().replace("\"", "")); // remove quotes so that op can parse wkt
		length = obj.getEsriGeometry().calculateLength2D();
		return NodeValue.parse(length.toString());
	}

}

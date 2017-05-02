package gr.di.uoa.jenaspatial.operations;

import org.apache.jena.graph.Node;
import org.apache.jena.sparql.expr.NodeValue;
import org.apache.jena.sparql.function.FunctionBase1;
import com.esri.core.geometry.ogc.OGCGeometry;
import com.esri.core.geometry.ogc.OGCPolygon;
import com.esri.core.geometry.ogc.OGCMultiPolygon;


/* uses ST_Area from com.esri.hadoop.hive.ST_Area */
public class Area extends FunctionBase1{
	
public Area() { super() ; }
	
	private static OGCGeometry obj;
	private static Double area;
	
	@Override
	public NodeValue exec(NodeValue v) {
		Node n = v.asNode();
		obj = OGCGeometry.fromText(n.toString().replace("\"", ""));
		if(obj instanceof OGCMultiPolygon){
			area = ((OGCMultiPolygon) obj).area();
		}
		else if(obj instanceof OGCPolygon){
			area = ((OGCPolygon) obj).area();
		}
		else{
			throw new IllegalArgumentException("Geometry is not a polygon/multipolygon");
		}
		
		return NodeValue.parse(area.toString());
	}

}

package gr.di.uoa.jenaspatial.utils;

import org.apache.jena.sparql.function.FunctionRegistry;

import gr.di.uoa.jenaspatial.operations.Area;
import gr.di.uoa.jenaspatial.operations.Boundary;
import gr.di.uoa.jenaspatial.operations.Buffer;
import gr.di.uoa.jenaspatial.operations.Contains;
import gr.di.uoa.jenaspatial.operations.ConvexHull;
import gr.di.uoa.jenaspatial.operations.Crosses;
import gr.di.uoa.jenaspatial.operations.Difference;
import gr.di.uoa.jenaspatial.operations.Disjoint;
import gr.di.uoa.jenaspatial.operations.Distance;
import gr.di.uoa.jenaspatial.operations.Envelope;
import gr.di.uoa.jenaspatial.operations.Equals;
import gr.di.uoa.jenaspatial.operations.Intersection;
import gr.di.uoa.jenaspatial.operations.Intersects;
import gr.di.uoa.jenaspatial.operations.Length;
import gr.di.uoa.jenaspatial.operations.Overlaps;
import gr.di.uoa.jenaspatial.operations.Relate;
import gr.di.uoa.jenaspatial.operations.SymDifference;
import gr.di.uoa.jenaspatial.operations.Touches;
import gr.di.uoa.jenaspatial.operations.Union;
import gr.di.uoa.jenaspatial.operations.Within;

public class JenaSpatial {

	public static void load (){
		
		/* load spatial operation: Area */
		FunctionRegistry.get().put("http://example.org/function#sfArea", Area.class);
		/* load spatial operation: Contains */
		FunctionRegistry.get().put("http://example.org/function#sfContains", Contains.class);
		/* load spatial operation: Within */
		FunctionRegistry.get().put("http://example.org/function#sfWithin", Within.class);
		/* load spatial operation: Length */
		FunctionRegistry.get().put("http://example.org/function#sfLength", Length.class);
		/* load spatial operation: Distance */
		FunctionRegistry.get().put("http://example.org/function#sfDistance", Distance.class);
		/* load spatial operation: Buffer */
		FunctionRegistry.get().put("http://example.org/function#sfBuffer", Buffer.class);
		/* load spatial operation: Overlaps */
		FunctionRegistry.get().put("http://example.org/function#sfOverlaps", Overlaps.class);
		/* load spatial operation: Intersection */
		FunctionRegistry.get().put("http://example.org/function#sfIntersects", Intersects.class);
		/* load spatial operation: Equals */
		FunctionRegistry.get().put("http://example.org/function#sfEquals", Equals.class);
		/* load spatial operation: Disjoint */
		FunctionRegistry.get().put("http://example.org/function#sfDisjoint", Disjoint.class);
		/* load spatial operation: Touches */
		FunctionRegistry.get().put("http://example.org/function#sfTouches", Touches.class);
		/* load spatial operation: Crosses */
		FunctionRegistry.get().put("http://example.org/function#sfCrosses", Crosses.class);
		/* load spatial operation: Intersection */
		FunctionRegistry.get().put("http://example.org/function#sfIntersection", Intersection.class);
		/* load spatial operation: Union */
		FunctionRegistry.get().put("http://example.org/function#sfUnion", Union.class);
		/* load spatial operation: Difference */
		FunctionRegistry.get().put("http://example.org/function#sfDifference", Difference.class);
		/* load spatial operation: SymDifference */
		FunctionRegistry.get().put("http://example.org/function#sfSymDifference", SymDifference.class);
		/* load spatial operation: Envelope */
		FunctionRegistry.get().put("http://example.org/function#sfEnvelope", Envelope.class);
		/* load spatial operation: Boundary */
		FunctionRegistry.get().put("http://example.org/function#sfBoundary", Boundary.class);
		/* load spatial operation: ConvexHull */
		FunctionRegistry.get().put("http://example.org/function#sfConvexHull", ConvexHull.class);
		/* load spatial operation: Relate */
		FunctionRegistry.get().put("http://example.org/function#sfRelate", Relate.class);
		
	}
		
}

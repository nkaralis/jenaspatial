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
		FunctionRegistry.get().put("http://example.org/function#area", Area.class);
		/* load spatial operation: Contains */
		FunctionRegistry.get().put("http://example.org/function#contains", Contains.class);
		/* load spatial operation: Within */
		FunctionRegistry.get().put("http://example.org/function#within", Within.class);
		/* load spatial operation: Length */
		FunctionRegistry.get().put("http://example.org/function#length", Length.class);
		/* load spatial operation: Distance */
		FunctionRegistry.get().put("http://example.org/function#distance", Distance.class);
		/* load spatial operation: Buffer */
		FunctionRegistry.get().put("http://example.org/function#buffer", Buffer.class);
		/* load spatial operation: Overlaps */
		FunctionRegistry.get().put("http://example.org/function#overlaps", Overlaps.class);
		/* load spatial operation: Intersection */
		FunctionRegistry.get().put("http://example.org/function#intersects", Intersects.class);
		/* load spatial operation: Equals */
		FunctionRegistry.get().put("http://example.org/function#equals", Equals.class);
		/* load spatial operation: Disjoint */
		FunctionRegistry.get().put("http://example.org/function#disjoint", Disjoint.class);
		/* load spatial operation: Touches */
		FunctionRegistry.get().put("http://example.org/function#touches", Touches.class);
		/* load spatial operation: Crosses */
		FunctionRegistry.get().put("http://example.org/function#crosses", Crosses.class);
		/* load spatial operation: Intersection */
		FunctionRegistry.get().put("http://example.org/function#intersection", Intersection.class);
		/* load spatial operation: Union */
		FunctionRegistry.get().put("http://example.org/function#union", Union.class);
		/* load spatial operation: Difference */
		FunctionRegistry.get().put("http://example.org/function#difference", Difference.class);
		/* load spatial operation: SymDifference */
		FunctionRegistry.get().put("http://example.org/function#symDifference", SymDifference.class);
		/* load spatial operation: Envelope */
		FunctionRegistry.get().put("http://example.org/function#envelope", Envelope.class);
		/* load spatial operation: Boundary */
		FunctionRegistry.get().put("http://example.org/function#boundary", Boundary.class);
		/* load spatial operation: ConvexHull */
		FunctionRegistry.get().put("http://example.org/function#convexHull", ConvexHull.class);
		/* load spatial operation: Relate */
		FunctionRegistry.get().put("http://example.org/function#relate", Relate.class);
		
	}
		
}

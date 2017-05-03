package gr.di.uoa.jenaspatial.utils;

public class PrepareWKT {

	/* remove double quotes because jena adds single quotes as well */
	public static String prepare(String str){
		return str.replace("\"", "");
	}
	
}

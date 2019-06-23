package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double numer, double denom) throws Exception{
		double quot;
		if (denom == 0.0) {
			throw new Exception();
		}
		else {
			quot = numer/denom;
		}
		return quot;
	}
	
	public static String reverseString (String s) {
		String news = "";
		if (s.equals("")) {
			throw new IllegalStateException();
		}
		else {
			for (int i=s.length()-1; i>=0; i--) {
				news += s.substring(i, i+1);
			}
		}
		return news;
	}
}

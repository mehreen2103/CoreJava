package in.com.rays.basic;

public class StringHandling {
	
	public static void main (String [] args) {
		
		String  s1 = "SUNRAYS";
		String s2 = "SUNRAYS";
		String s3 = new String ("welcome");
		String s4 = new String ("welcome");
		
		System.out.println(s3 == s4);
		System.out.println(s1==s2);
		
		System.out.println(s3.equals(s4));
		
	}

}

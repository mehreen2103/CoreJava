package in.com.rays.basic;

public class ReverseAtSamePlace {
	
	public static void main(String[] args) {
		
		String str = "Mehreen Ansari";
		
		
		for (int i = str.length() - 1; i>=0; i--) {
			
			System.out.println(str.charAt(i));
		}
	}

}

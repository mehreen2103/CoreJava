package in.com.rays.basic;

public class Vowels {
	
	public static void main(String[]args) {
		
		String str = "google";
		int count = 0;
		
		for (int i = 0 ; i<str.length(); i++) {
			if ('a' == str.charAt(i)|| 'e' == str.charAt(i)||'i' == str.charAt(i)
					||'o' == str.charAt(i)||'u' == str.charAt(i)) {
				count++;
			}
		}
		System.out.println("Total vowels :" + count);
		
	}
	
}

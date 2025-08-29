package in.com.rays.basic;

public class TestString {

	public static void main(String[] args) {
		
		String name = "Mehreen Ansari";
		System.out.println("Name length is :" +name.length());
		System.out.println("3rd cgharacter is :" +name.charAt(3));
		System.out.println("hr index is :"+name.indexOf("hr"));
		System.out.println("First n position :" +name.indexOf("n"));
		System.out.println("Last n position :"+ name.indexOf("n"));
		System.out.println("h is replaced by e:" +name.replace("e", "i"));
		System.out.println("lowercase: " +name.toLowerCase());
		System.out.println("uppercase :"+ name.toUpperCase());
		System.out.println("Starts with Mehreen :"+ name.startsWith("Mehreen"));
		System.out.println("Ends with ari :"+name.endsWith("ari"));
		System.out.println("Substring :"+name.substring(7));
	}
}

package in.com.rays.basic;

public class StringAndStringBuffer {
	
	public static void main(String[]args) {
		
		String s = "Rays";
		System.out.println(s);
		System.out.println(s.toUpperCase());
		
		System.out.println("-----*-----");
		
		
		StringBuffer sb = new StringBuffer("Sun");
		
		System.out.println(sb);
		
		sb.append("Rays");
		
		//sb.reverse();
		
		System.out.println(sb);
	}

}

package in.com.rays.basic;

public class TestArray {

	public static void main(String[] args) {
		
		int [] a = {5, 10, 15, 20, 25, 30};
		
		System.out.println( a[0] + " " + a[1]+ " "+ a[2]);
		
		System.out.println(a[0] + a[1] + a[2]);
		
		System.out.println("------------");
		
		System.out.println("length: " + a.length);
		
		
		System.out.println("------------");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print( i + " = " + a [ i ] + ",");
			
			System.out.println(a[1]);		
			}
}
}
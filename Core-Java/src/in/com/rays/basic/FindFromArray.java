package in.com.rays.basic;

public class FindFromArray {
	
	public static void main(String[] args) {
		
		int[] a = {5,10, 15, 20, 25, 30};
		int n = 20;
		for (int i =0; i < a.length; i++) {
			if (n == a[i]) {
				
				System.out.println("Position of 20 is :" +i);
			}
		}
	}
}

package in.com.rays.basic;

public class MaxInArray {
	
	public static void  main(String [] args) {
		
		int [] a = {5, 10, 15, 20, 25, 30};
		
		int max = a[0];
		
		for (int i = 1; i < a.length;i++) {
			
			if (a[i] < max) {
				
				max = a[i];
			}
		}
		System.out.println("The Highest Number in the Array is :" +max);
	}

}

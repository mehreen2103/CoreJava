package in.com.rays.basic;

public class ReverseNo {
	
	public static void main ( String[] args ) {
		
		int num = 869;
		int sum = 0;
		int n = num;
		int r = 0;
		
		while ( n!= 0) {
			
			r = n%10;
			
			sum = sum*10+r;
			
			n = n/10;
		}
		
		System.out.println(sum);
	}

}

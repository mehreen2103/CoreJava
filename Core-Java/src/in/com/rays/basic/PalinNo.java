package in.com.rays.basic;

public class PalinNo {
	public static void main( String [] args) {
		int num = 131;
		int r = 0;
		int sum = 0;
		int n= num;
		
		while ( n!=0) {
			
			r = n % 10;
			sum = (sum*10)+r;
			n = n/10;
		}
		if ( sum == num) {
			System.out.println("This is pelindrome number");
		}
		else {
			System.out.println("This is not pelindrome number");
		}
	}

}

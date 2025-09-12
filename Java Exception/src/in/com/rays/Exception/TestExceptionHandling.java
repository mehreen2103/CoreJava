package in.com.rays.Exception;

public class TestExceptionHandling {
	
	public static void main(String[] args) {
		
		try {
			
			int i = 0;
		    int j = 5;
		    int a = j/i;
		    System.out.println(a);	
		}
		catch(ArithmeticException e) {
			System.out.println("exception: "+ e.getMessage());
		}
		
		System.out.println("Programme is finished");
	}

}

package in.com.rays.basic;

public class PrintRandNo {
	public static void main (String[] args) {
		
		for (int i = 1 ; i<=10; i++) {
			
			int r = (int)(Math.random()*100);
			
			System.out.println(r);
		}
	}

}

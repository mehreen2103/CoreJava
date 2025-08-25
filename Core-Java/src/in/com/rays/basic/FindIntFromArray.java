package in.com.rays.basic;

public class FindIntFromArray {
	
	public static void main(String[] args) {
		
		int [] a = {5 , 10 , 15, 20, 25, 30};
		
		int n = 50;
		
		int position = -1;
		
		for (int i = 0; i<a.length; i++) {
			if ( n == a[i]) {
				
				position = i;
				
				System.out.println("position of 20 : "+position);
			}
		}
	
		if (position == -1) {
			
			System.out.println(position);
		}
	}

}

package in.com.rays.Exception;

public class TestMultiCatchBlock {
	public static void main(String[] args) {
		
		String str = "Google";
		
		try {
			
			System.out.println(str.length());
			System.out.println(str.charAt(6));
		}
		catch(NullPointerException e){
			System.out.println("exception 1 : " + e.getMessage());
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("exception 2 : "+ e.getMessage());
		}
		finally {
			System.out.println("Always execute finally block.");
		}
	}

}

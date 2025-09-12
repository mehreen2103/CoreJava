package in.com.rays.Exception;

public class TestParentCatchBlock {
	
	public static void main(String[] args) {
		
		String str = null;
		
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(6));
		}
		catch(Exception e){
			
			System.out.println("Exception: "+ e.getMessage());
			
//			e.printStackTrace();
		}
	}

}

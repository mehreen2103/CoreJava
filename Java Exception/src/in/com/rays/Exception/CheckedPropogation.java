package in.com.rays.Exception;

public class CheckedPropogation {
	//Compile time 	Exception
	public static void main(String[] args) {
		
	   dad();
		}
	
	      public static void dad() {
	    	  
	      try {
		    	  mom();

			} 
	      catch (Exception e) {
	    	  
	    	  
		    	  System.out.println(e.getMessage());
		    	  e.printStackTrace();
			}  
	      }
	
	public static void mom() throws Exception {
		son();
	}
	
	public static void son() throws Exception {
		
		throw new Exception("Child ask too much money");
	}


}

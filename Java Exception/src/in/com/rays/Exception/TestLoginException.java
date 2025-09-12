package in.com.rays.Exception;

public class TestLoginException {
	
	public static void main(String[] args) throws LoginException {
		
		String loginId = "admin@gmail.com";
		
		if (loginId != null&& loginId == "admin@gmail.com") {
			
			System.out.println("User Login Successfully");
			
		}else {
			throw new LoginException("invalid loginId");
		}
		
		System.out.println("Entered in application");
	}

}

package in.com.rays.Exception;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account(200);
		
		try {
			System.out.println(" Withdrawal 4000");
			a.withdrawal(2000);
			
//			System.out.println(" Withdrawal 4000");
//			a.withdrawal(4000);
			}
		
		catch(InsufficientBalanceException e) {
			
			System.out.println("Exception: "+ e.getMessage());
		     }
		
		finally {
			System.out.println("Transaction finished");
		}
	}

}

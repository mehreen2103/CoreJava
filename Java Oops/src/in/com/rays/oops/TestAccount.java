package in.com.rays.oops;

public class TestAccount {
	
	public static void main(String[]args) {
		
		Account a1 =  new Account() ;
		
		a1.setNumber("125443212568462");
		a1.setAccountType("Current");
		a1.setBalance(20000);
		
		System.out.println("a1 Account Number :" + a1.getNumber());
		System.out.println("a1 Account Type : " + a1.getAccountType());
		System.out.println("a1 Account Balance :" + a1.getBalance());
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		Account a2 = new Account();
		
		a2.setNumber("829651352045");
		a2.setAccountType("Saving");
		a2.setBalance(12568);
		
		System.out.println("a2 Account Number :" + a2.getNumber());
		System.out.println("a2 Account Type : " + a2.getAccountType());
		System.out.println("a2 Account Balance :" + a2.getBalance());
		
	}

}

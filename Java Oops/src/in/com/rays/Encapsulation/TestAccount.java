package in.com.rays.oops.Encapsulation;

public class TestAccount {
	
	public static void main(String[]args) {
		
		Account a1 =  new Account() ;
		
		a1.setNumber("125443212568462");
		a1.setAccountType("Current");
		a1.setBalance(20000);
		
		System.out.println("a1 Account Number :" + a1.getNumber());
		System.out.println("a1 Account Type : " + a1.getAccountType());
		System.out.println("a1 Account Balance :" + a1.getBalance());
		a1.deposit(1000);
		a1.Withdrawal(500);
		
		System.out.println();
		System.out.println("-------------");
		System.out.println();
        Account a2 =  new Account() ;
		
		a2.setNumber("125443212568462");
		a2.setAccountType("Current");
		a2.setBalance(10000);
		
		System.out.println("a1 Account Number :" + a2.getNumber());
		System.out.println("a1 Account Type : " + a2.getAccountType());
		System.out.println("a1 Account Balance :" + a2.getBalance());
		
		a2.deposit(1000);
		a2.Withdrawal(2000);
		a1.fundTransfer(a2, 2000);
		
	}

}

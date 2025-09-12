package in.com.rays.Exception;

public class Account {
	
	private double balance;
	
	public Account (double balance) {
		this.balance = balance;
	}
	
	public void withdrawal(double amount) throws InsufficientBalanceException {
		
		if (amount > this.balance) {
			throw new InsufficientBalanceException("Withdrawal Failed! Balance is not sufficient");
			
		}else {
			
			balance = amount;
			System.out.println("Withdrawal Successful remaining Balance: "+ balance);
			
		}
	}

}

package in.com.rays.Thread;

public class Account {
	
	private int balance =0;
	
	public int getBalance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;	
	}
	public void setBalance(int balance) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = balance;
	}
	public synchronized void deposit(String name, int amount) {
        int total = balance + amount;
        setBalance(total);
        
        System.out.println(name + " new balance:- " + getBalance());
}
}
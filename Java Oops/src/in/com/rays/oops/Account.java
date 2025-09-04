package in.com.rays.oops.Encapsulation;

public class Account {
	
	private String number;
	private String accountType;
	private double balance;

	
	
	public String getNumber() {
		return this.number;	
	}
	
    public void setNumber(String number) {
    	this.number = number;
    }
   
    
    
    public String getAccountType() {
    	return this.accountType;
    }
    
    public void setAccountType( String accountType) {
    	this. accountType= accountType;
    }
	
    
    
   public double getBalance() {
	   return this.balance;
   }
   
   public void setBalance( double balance) {
	   
	   this.balance = balance;
   }
   
   //deposit method
   public void deposit (double amount) {
	   
	  this.balance = this.balance + amount;
	  System.out.println("Total balance after deposit : " +getBalance());
   }
   
   //Withdrawal method
   public void Withdrawal (double amount) {
	   
	   if (amount > this.balance) {
		System.out.println("Insufficient Amount Transfer");
	}
	   
	   else {
		   
		   this.balance = this.balance - amount;
		   System.out.println("Total Balance After Withdrawal :" + getBalance());
	   }		   
	   }
	   //Method to transferfunds between account
	   public void fundTransfer(Account targetAccount ,double amount1) {
		   
		   if (amount1>this.balance) {
			System.out.println("insufficient found");
		}else {
//			withdraw from current account
			this.balance = this.balance-amount1;
			
			//deposit into target account
			
			targetAccount.balance = targetAccount.balance+amount1;
			System.out.println("transfer " +amount1+ "from"+this.number+"to"+targetAccount.number);
			System.out.println("Your nes balance: "+ this.balance);
			System.out.println("recievers new balance: "+targetAccount.getBalance());
		}
		   
	   }
   }


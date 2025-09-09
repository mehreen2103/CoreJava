package in.com.rays.polymorphism;

public class HomeLoan {

	public static void main(String[] args) {
		
		Bank[] banks = new Bank[3];
		
		
		banks[0] = new AxisBank();
		banks[1] = new HDFCBank();
		banks[2] = new ICICIBank();
		loanEnquery(banks);
	}
	static void loanEnquery(Bank [] banks) {
		for (Bank b : banks) {
			String name = b.getName();
			double rate = b.interestRate();
			System.out.println(name + " " + rate);
		}
	}
}

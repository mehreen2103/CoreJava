package in.com.rays.oops.Interface;

public class BussinessMan extends Person implements Richman, SocialWorker{

	@Override
	public void earnMoney() {
		System.out.println("Earn Money");
		
	}

	@Override
	public void donation() {
		System.out.println("Giving Donation");
		
	}

	@Override
	public void party() {
		System.out.println("Party");
		
	}
	@Override
	public void helpToOthers() {
		System.out.println("Help To Others");
		
	}

	
	@Override
	public void getname() {
	 System.out.println("Mehreen");
		
	}

}

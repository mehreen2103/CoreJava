package in.com.rays.oops.Interface;

public class TestBussinessMan {
	
	public static void main(String[] args) {
		
		Richman r = new BussinessMan();
		r.party();
		r.earnMoney();
		r.donation();
		
		SocialWorker s = new BussinessMan();
		s.helpToOthers();
		
		Person p = new BussinessMan();
		p.getname();
		
		
		
	}

}

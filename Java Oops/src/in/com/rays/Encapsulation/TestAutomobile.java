package in.com.rays.oops;

public class TestAutomobile {
	
	public static void main (String[]args) {
		
		Automobile a1 = new Automobile();
		
		a1.setcolor("Blue");
		a1.setSpeed(100);
		a1.setMake("Brand");
		
		System.out.println("Color : " +a1.getcolor());
		System.out.println("Speed : "+a1.getSpeed());
		System.out.println("Make : " +a1.getMake());
	}

}

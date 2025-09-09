package in.com.rays.oops.constructor;

public class TestAutomobile {
	
	public static void main(String[] args) {
		
		Automobile car = new Automobile("black","BMW",60);
		
		System.out.println("car coor is: " + car.getColor());
		System.out.println("car make is: " + car.getMake());
		System.out.println("car speed is: "+ car.getSpeed());
		System.out.println("final speed: "+car.getSpeed()+"km/h");
		
	}

}

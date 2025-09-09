package in.com.rays.oops.constructor;

public class Automobile {
	
	private String color;
	private String make;
	private int speed;
	
	public Automobile(String color,String make, int speed) {
		this.color= color;
		this.make= make;
		this.speed= speed;
	}
	
	public String getColor() {
		return this.color;
	}
	public String getMake() {
		return this.make;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void accelerator () {
		 speed = speed +10;
		 System.out.println("Accelerayed  current gear"+this.speed+"km/h");
	 }
	 public void brake() {
		 speed = speed -10;
		 if(speed<0)
		    speed = 0;
		 System.out.println("Braked current speed"+this.speed+"km/h");
	 }
}

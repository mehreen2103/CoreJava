package in.com.rays.oops.abstraction;

public class Circle extends Shape {
	
	private int radius;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int Radius) {
		this.radius = radius;
	}
	
	
	@Override
	public double area() {
		
		double area = Math.PI * radius * radius;
		
		return 0;
	}
	

}

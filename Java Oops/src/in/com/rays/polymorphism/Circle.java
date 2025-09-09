package in.com.rays.polymorphism;

public class Circle extends Shape{

	protected int radius;
	
	public int getradius () {
		return this.radius;
		
	}
	public void setradius(int radius ) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		
		double area = Math.PI * radius * radius;
		
		return area;
	}
	public double area1() {
			return 2.0;
		}
	


}

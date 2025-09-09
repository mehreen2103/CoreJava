package in.com.rays.oops.Inheritance;

public class Triangle extends Shape {
	
	private int base;
	
	private int height;
	
	public int getBase() {
		
		return this.base;
	}
	public void setBase(int Base) {
		
		this.base = base;
	}
	
	public int getHeight() {
		
		return this.base;
	}
	public void setHeight(int Height) {
		
		this.height = height;
	}
	
	public double area() {
		double area = base * height;
		
		return area;
	}

}

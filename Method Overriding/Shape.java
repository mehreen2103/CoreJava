package in.com.rays.oops.Inheritance.Override;

public class Shape {
	
	protected String color;
	protected int borderWidth;
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getBorderWidth() {
		return this.borderWidth;
	}
	public void setBorderWidth(int borderwidth) {
		this.borderWidth = borderwidth;
	}
	
	public double area() {
		return 2.0;
	}
	
	

}

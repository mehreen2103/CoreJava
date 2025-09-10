package in.com.rays.oops.abstraction;

import in.com.rays.oops.Inheritance.Circle;

public class TestShape {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("*****Circle******");
		System.out.println();
		
		Circle s = new Circle();
		////Typecasting
		Circle c = (Circle) s;
		
		c.setradius(2);
		
		System.out.println("Radius: "+c.getRadius());
		
		System.out.println("Area: "+ c.area());
		
		
		System.out.println();
		System.out.println("******Rectangle******");
		System.out.println();
		
		Rectangle s1 = new Rectangle ();
		///Typecasting
		Rectangle r = (Rectangle) s1;
		
		r.setLength(8);
		r.setWidth(4);
		
	    System.out.println("Length: " + r.getLength());
	    System.out.println("Width: " + r.getWidth());
	    System.out.println("Area: " +r.area());
	    
	    
	    System.out.println();
	    System.out.println("******Triangle*******");
	    System.out.println();
	    
	    Triangle s3 = new Triangle();
	    Triangle t = (Triangle) s3;
	    
	    t.setBase(4);
	    t.setHeight(6);
	    
	    
	    System.out.println("Base: " + t.getBase());
	    System.out.println("Height: " + t.getHeight());
	    System.out.println("Area: " + t.area());
	    
	    
	}
}

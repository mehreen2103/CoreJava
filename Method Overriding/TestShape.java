package in.com.rays.oops.Inheritance.Override;

public class TestShape {
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("----Circle----");
		System.out.println();
		
		Shape s1 = new Circle();
		///typcasting parent class to child class;
		Circle c = (Circle) s1;
		
		c.setradius(2);
		c.setColor("Black");
		c.setBorderWidth(5);
		
		System.out.println("Radius: "+c.getradius());
		System.out.println("Color: "+ c.getColor());
		System.out.println("BorderWidth:"+ c.getBorderWidth());
		System.out.println("Area: "+ c.area());
		
		System.out.println();
		System.out.println("------Triangle------");
		System.out.println();
		
		Shape s2 = new Triangle();
		Triangle t = (Triangle) s2;
		
		t.setBase(8);
		t.setHeight(10);
		t.setColor("Black");
		t.setBorderWidth(6);
		
		System.out.println("Base: "+ t.getBase());
		System.out.println("Height: "+ t.getHeight());
		System.out.println("Color: "+ t.getColor());
		System.out.println("BorderWidth: "+ t.getBorderWidth());
		System.out.println("Area: "+ t.area());
		
		System.out.println();
		System.out.println("------Rectangle------");
		System.out.println();
		
		Shape s3 = new Rectangle();
		Rectangle r = (Rectangle)s3;
		
		
		r.setLength(2);
		r.setWidth(4);
		r.setColor("White");
		r.setBorderWidth(4);
				
		System.out.println("Length: "+r.getLength());
		System.out.println("Width: "+r.getWidth());
		System.out.println("Color: "+ r.getColor());
		System.out.println("BorderWidth:"+ r.getBorderWidth());
		System.out.println("Area: "+ r.area());
		
	}

}

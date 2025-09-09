package in.com.rays.oops.Inheritance;

public class TestShape {
	public static void main(String[] args) {
		
		System.out.println("***-----CIRCLE-----***");
		System.out.println();
		
		Circle c = new Circle();
		c.setradius(5);
		c.setcolor("Black");
		c.setBorderWidth(2);
		
		
		System.out.println("radius : "+ c.getRadius());
		System.out.println("Color : "+ c.getcolor());
		System.out.println("BorderWidth: "+ c.getBorderWidth());
		System.out.println("Area Of Circle: "+ c.area());
		
		System.out.println();
		
		
		System.out.println("***-----TRIANGLE-----***");
		
		System.out.println();
		
		Triangle t = new Triangle();
		t.setBase(4);
		t.setHeight(8);
		t.setcolor("Maroon");
		t.setBorderWidth(5);
		
		System.out.println("Base: "+ t.getBase());
		System.out.println("Height: " + t.getHeight());
		System.out.println("Color: " + t.getcolor());
		System.out.println("BorderWidth: "+ t.getBorderWidth());
		System.out.println("Area: "+ t.area());
		
		System.out.println();
		
		
		System.out.println("***-----RECTANGLE-----***");
		
		System.out.println();
		
		Rectangle r = new Rectangle();
		r.setLength(5);
		r.setWidth(4);
		r.setcolor("White");
		r.setBorderWidth(8);
		
		System.out.println("Length: "+ r.getLength());
		System.out.println("Width: " + r.getBorderWidth());
		System.out.println("Color: "+ r.getcolor());
		System.out.println("BorderWidth: "+ r.getBorderWidth());
		System.out.println("Area:"+ r.area());
		
	}
	
}

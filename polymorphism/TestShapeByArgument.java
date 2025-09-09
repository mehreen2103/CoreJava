package in.com.rays.polymorphism;

public class TestShapeByArgument {
	
	

	public static double calcArea(Shape[]s) {
		
		double totalArea = 0.0;
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("Area: "+s[i].area());
			totalArea = totalArea + s[i].area();
		}
		
		return totalArea;
	}

	public static void main(String[] args) {
		
		Shape [] s = new Shape[3];
		
		s[0] = new Circle ();
		s[1] = new Triangle();
		s[2] = new Rectangle();
		
		Circle c = (Circle)s[0];
		c.setradius(3);
		
		Triangle t = (Triangle) s[1];
		t.setBase(4);
		t.setHeight(8);
		
		Rectangle r = (Rectangle) s[2];
		r.setLength(6);
		r.setWidth(3);
		
		double totalArea = calcArea(s);
		System.out.println("total Area: " + totalArea);
		
	}
}

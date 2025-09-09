package in.com.rays.polymorphism;

public class TestShapeByArray {
	public static void main(String[] args) {

		Shape [] s = new Shape [3];
		
		s[0] = new Circle ();
		s[1] = new Rectangle ();
		s[2] = new Triangle ();
		
		Circle c = (Circle) s[0];
		c.setradius(2);
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(6);
		r.setWidth(3);
		
		Triangle t = (Triangle) s[2];
		t.setBase(2);
		t.setHeight(8);
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.println("Area: " +s[0].area());
			
		}
	
	}

}

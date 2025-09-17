package in.com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("Neha");
		v.add("Amal ");
		v.add("Shivani");
		v.add("Megha");
		v.add("Naba");
		
		Enumeration e = v.elements();
				
		v.add("Hani");
		
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
	}

}

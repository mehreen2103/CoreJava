package in.com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAll {
	
	public static void main(String[] args) {
		

		Collection c = new ArrayList();
		
		c.add("KGF");
		c.add(7);
		c.add(6.2);
		c.add('a');
		c.add(true);
		
		
        Collection c1 = new ArrayList();
		
		c1.add("KGF");
		c1.add(7);
		c1.add(6.2);
		c1.add('a');
		c1.add(true);
		c1.add(8);
		c1.add(null);
		c1.add("Hello");
		
		c.retainAll(c1);
		
		System.out.println(c);
	}

}

package in.com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;


public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("KGF");
		c.add(7);
		c.add(6.2);
		c.add('a');
		c.add(true);
		
		System.out.println("c : " + c);
		
		System.out.println("----------");
		
		for (Object o : c) {
			
			System.out.println(o);
			
		}
	}

}

package in.com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection1 {

	public static void main(String[] args) {
		 
		Collection c = new ArrayList();
		
		c.add(11);
		c.add(true);
		c.add(3.65);
		c.add("Mariya");
		c.add('s');
		
		System.out.println(c);
		System.out.println("_____________");
		
		
		for(Object o: c) {//take out one by objects
			
			System.out.println(o);
			
			
		}
				
		
	}

}

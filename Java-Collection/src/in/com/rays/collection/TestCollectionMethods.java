package in.com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethods {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("KGF");
		c.add(7);
		c.add(6.2);
		c.add('a');
		c.add(true);
		
		System.out.println("c : "+ c);//Print all elements
		System.out.println("c size:" +c.size());//Using Size Method
		System.out.println(c.contains(7));//Using Contains Method
		c.remove('a');//Using Remove Method
		System.out.println("c : "+ c);
		System.out.println("c size:" +c.size());
		
		
		System.out.println();
		System.out.println("------*-#-*------");
		System.out.println();
		
        Collection c1 = new ArrayList();
		
		c1.add("KGF");
		c1.add(7);
		c1.add(6.2);
		c1.add('a');
		c1.add(true);
		c1.add(8);
		c1.add(null);
		c1.add("Hello");
		
		System.out.println("c1 : " + c1);
		System.out.println("c1 size:" +c1.size());
		
		System.out.println("Before Add all c1: " + c.containsAll(c1));
		c.addAll(c1);
		
		System.out.println("c After add all c1: " + c);
		System.out.println("After add all c1: " + c.containsAll(c1));
		
		c.removeAll(c1);
		System.out.println("c after remove all c1: " + c);
		
		System.out.println(c1.isEmpty());
		c1.clear();
		System.out.println(c1.isEmpty());
	}

}

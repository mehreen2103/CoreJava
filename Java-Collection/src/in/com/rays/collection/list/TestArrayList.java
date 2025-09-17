package in.com.rays.collection.list;

import java.util.ArrayList;

public class TestArrayList {
	
	public static void main(String[] args) {
	
		ArrayList a = new ArrayList();
		
		a.add("Apple");
		a.add("Mango");
		a.add("Banana");
		a.add("Orange");
		a.add("Banana");
		
		//Print Array List
		System.out.println("Fruits name: "+ a);
		System.out.println("size:" +a.size());
		
		//remove element
		a.remove("Mango");
		System.out.println("After Removing: "+ a);
		
		//Size of element
		System.out.println("size:" +a.size());
		
		System.out.println("-----Iterating-----");
		
		for(Object o: a) {
			
			System.out.println("Fruites: "+a);
		}
		
	}

}

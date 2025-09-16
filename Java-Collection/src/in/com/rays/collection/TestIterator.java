package in.com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("Shivani");
		list.add("Naba");
		list.add("Hani");
		list.add("Jatin");
		list.add("Rohan");
		list.add("Neha");
		
		System.out.println("list: " + list);
		
		System.out.println();
		System.out.println("----For Each Loop---");
		System.out.println();
		
		for (Object o : list) {
			
			System.out.println(o);
			
		}
		System.out.println();
		System.out.println("-----Iterator-----");
		System.out.println();
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println();
		System.out.println("-----For Each Method-----");
		System.out.println();
		
		list.forEach(System.out::println);
	}

}

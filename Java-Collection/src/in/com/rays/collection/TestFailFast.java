package in.com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFailFast {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("Neha");
		list.add("Amal ");
		list.add("Shivani");
		list.add("Megha");
		list.add("Naba");
		
		Iterator it = list.iterator();
		
		//Fail Fast.
		
		while (it.hasNext()) {
			
			Object o = it.next();
			System.out.println(o);
			it.remove();
		}
		
		System.out.println("list: "+ list);	
				
	}
}

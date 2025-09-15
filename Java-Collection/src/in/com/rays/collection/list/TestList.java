package in.com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("Alizeh");
		list.add(21);
		list.add('s');
		list.add("Alizeh");
		list.add(null);
		list.add('m');
		list.add(11);
		
		System.out.println("list: " + list);
		System.out.println(list.get(6));//get the i-th element
		System.out.println(list.set(0, "Mehreen"));//Replace the i-th element
		System.out.println("list: " + list);
		System.out.println(list.indexOf('m'));//Searches object from beginning
		System.out.println(list.lastIndexOf("Alizeh"));//Searches object from end
		System.out.println(list.subList(0, 6));
		
	}
}

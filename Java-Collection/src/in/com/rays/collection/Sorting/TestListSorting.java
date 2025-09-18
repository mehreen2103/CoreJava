package in.com.rays.collection.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListSorting {

	public static void main(String[] args) {
		
		List<Integer> list =  new ArrayList<Integer>();
		
		list.add(8);
		list.add(7);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		
		list.forEach(System.out::println);
		System.out.println("----------");
		
		Collections.sort(list);
		list.forEach(System.out::println);
		
		System.out.println("----------");
		
		Collections.shuffle(list);
		list.forEach(System.out::println);
	}
}

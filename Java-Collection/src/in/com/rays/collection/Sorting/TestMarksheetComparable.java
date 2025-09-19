package in.com.rays.collection.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheetComparable {
	
	public static void main(String[] args) {
		
		List<Marksheet> list = new ArrayList<Marksheet>();
		
		list.add(new Marksheet ("106","Aman", 56));
		list.add(new Marksheet ("108","Rohan", 86));
		list.add(new Marksheet ("107","jatin", 58));
		list.add(new Marksheet ("104","Neha", 53));
		list.add(new Marksheet ("105","Ashi", 59));
		list.add(new Marksheet ("102","kanak", 85));
		list.add(new Marksheet ("103","Nehal", 92));
		list.add(new Marksheet ("101","Avni", 78));
		
		list.forEach(System.out::println);
		
		
		System.out.println("----------------------");
		
		Collections.sort(list);
		list.forEach(System.out::println);
	}

}

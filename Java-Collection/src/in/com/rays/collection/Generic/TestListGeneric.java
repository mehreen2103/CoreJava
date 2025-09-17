package in.com.rays.collection.Generic;

import java.util.ArrayList;
import java.util.List;

public class TestListGeneric {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(8);
		list.add(21);
//		list.add("");
		
		System.out.println("list: "+ list);
	}

}

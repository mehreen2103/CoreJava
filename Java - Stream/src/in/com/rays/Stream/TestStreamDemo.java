package in.com.rays.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStreamDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
	    list.add(7);
	    list.add(6);
	    list.add(2);
	    list.add(1);
	    list.add(5);
	    list.add(4);
	    list.add(7);
	    list.add(3);
	    list.add(7);
	    list.add(8);
	    
	    list.stream().filter(e -> e % 2!= 0 ).forEach(System.out::println);
	    
	    System.out.println("------");
	    list.stream().filter(e -> e % 2!= 0 ).distinct().forEach(System.out::println);
	    
	    System.out.println("------");
	    list.stream().filter(e -> e % 2== 0 ).distinct().forEach(System.out::println);
	    
	    System.out.println("------");
	    list.stream().filter(e -> e % 2== 0 ).distinct().sorted().forEach(System.out::println);
	    
	    System.out.println("------");
	    list.stream().filter(e -> e % 2== 0 ).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	    
	    
	    
	    
	}

}

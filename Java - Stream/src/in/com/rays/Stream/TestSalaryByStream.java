package in.com.rays.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestSalaryByStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(75000);
		list.add(56000);
		list.add(78000);
		list.add(75000);
		list.add(80000);
		list.add(88000);
		list.add(92000);
		list.add(75000);
		
		System.out.println("---------Asc Order-----");
	    list.stream().sorted().forEach(System.out::println);
	    System.out.println("---------Asc Order and remove duplicate-----");
	    list.stream().sorted().distinct().forEach(System.out::println);
	    System.out.println("--------Desc Order And Remove-------");
	    list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
	    System.out.println("--------1st Highest Salary--------");
	    list.stream().sorted(Comparator.reverseOrder()).limit(1).distinct().forEach(System.out::println);
	    System.out.println("--------2nd Highest Salary----------");
	    list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).forEach(System.out::println);
	}

}

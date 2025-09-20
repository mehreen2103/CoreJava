package in.com.rays.Stream;

import java.util.ArrayList;
import java.util.List;

public class TestStream {
	
	public static void main(String[] args) {
		
		 List<String> list = new ArrayList<String>();
		 
		 list.add("Tokyo");
		 list.add("Tokyo");
		 list.add("Gandhiya");
		 list.add("Berlin");
		 list.add("Rio");
		 list.add("Nairobi");
		 list.add("Tushar");
		 list.add("Tushar");
		 list.add("Helsenki");
		 list.add("Rachel");
		 
		 list.stream().sorted().forEach(System.out::println);
		 System.out.println("----------");
		 list.stream().sorted().distinct().forEach(System.out::println);
		 System.out.println("----------");
		 list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		 System.out.println("-----------");
		 list.stream().map(e  -> e.toLowerCase()).distinct().sorted().forEach(System.out::println);
		 System.out.println("-----------");
		 list.stream().map(e  -> e.toLowerCase()).distinct().filter(e -> e.startsWith("t")).forEach(System.out::println);
		 
		
	}
	 
     

}

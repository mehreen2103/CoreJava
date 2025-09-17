package in.com.rays.collection.Generic;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeGeneric {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee ("Neha ", 65000," TCS"));
		list.add(new Employee ("Maha ", 56000," Infosys"));
		list.add(new Employee ("Naba ", 55000," Iris"));
		list.add(new Employee ("Neena ", 75000," Accenture"));
		list.add(new Employee ("Shivani ", 95000," Cognizent"));
		list.add(new Employee ("Kanika ", 85000," Capgemini"));
		list.add(new Employee ("Mehar ", 84000," Amazon"));
		list.add(new Employee ("Avni ", 65000," NCS"));
		
		System.out.println(list.toString());
		
		System.out.println();
		
		list.forEach(System.out::println);
	}
}

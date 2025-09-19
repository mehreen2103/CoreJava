package in.com.rays.collection.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
	
	public static void main(String[] args) {
		
			List<Employee> list = new ArrayList<Employee>();
			
			list.add(new Employee("Aman", 65000, "TCS"));
			list.add(new Employee("Neha", 60000, "NCS"));
			list.add(new Employee("Anam", 75000, "Infosys"));
			list.add(new Employee("Ashi", 72000, "Cognizent"));
			list.add(new Employee("Kanak",95000, "Accenture"));
			list.add(new Employee("Avni", 85000, "Capgemini"));
			list.add(new Employee("Nehal", 76000, "Iris"));
			list.add(new Employee("Rohan", 88000, "Amazon"));
			
			System.out.println("-----------*-Order By Salary-*--------------");
            System.out.println();			
			OrderBySalary bySalary = new OrderBySalary();
			
			Collections.sort(list, bySalary);
			
			list.forEach(System.out::println);
			
			 System.out.println();	
			System.out.println("-----------*-OrderBy Name-*--------------");
			 System.out.println();	
			 
			OrderByName byName = new OrderByName();
			
			Collections.sort(list, byName);
			
			list.forEach(System.out::println);
			
			 System.out.println();	
			System.out.println("------------*-Orde By Company-*-----------");
			 System.out.println();	
			 
			OrderByCompany byCompany = new OrderByCompany();
			
			Collections.sort(list, byCompany);
			
			list.forEach(System.out::println);
			
	}

}

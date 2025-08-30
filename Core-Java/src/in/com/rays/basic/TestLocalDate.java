package in.com.rays.basic;


import java.time.LocalDate;

public class TestLocalDate {
	
	public static void main (String[] args) {
		
		LocalDate date  = LocalDate.now();
//		
				
		System.out.println("date:" +date);
		System.out.println("day of month :" + date.getDayOfMonth());
		System.out.println("day of week :" + date.getDayOfWeek());
		System.out.println("day of year :" + date.getDayOfYear());
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		LocalDate dob = LocalDate.of(2004, 11, 03);
		System.out.println("dob:" + dob);
		System.out.println("day of month :" + dob.getDayOfMonth());
		System.out.println("day of week :" + dob.getDayOfWeek());
		System.out.println("day of year :" + dob.getDayOfYear());
		System.out.println("age:  " + (date.getYear()- dob.getYear()));
		
	}

}

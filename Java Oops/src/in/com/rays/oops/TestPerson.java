package in.com.rays.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	
	public static void main (String []args) throws ParseException {
		
//		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dob = sdf.parse("03/11/2004");
		Person a1 = new Person();
		
		
		a1.setName("Mehreen");
		a1.setAddress("Indore");
		a1.setDob(dob);
		
		System.out.println( " Name : "+a1.getName());
		System.out.println();
		System.out.println( " New Address : "+a1.getAddress());
		System.out.println();
		System.out.println(" Dob : "+sdf.format(a1.getDob()));
	}

}

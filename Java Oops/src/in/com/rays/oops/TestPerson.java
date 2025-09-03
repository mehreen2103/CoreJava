package in.com.rays.oops.Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		System.out.println("");
		System.out.println("****-----BUSSINESSMAN-----****");
		System.out.println("");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Bussinessman b = new Bussinessman();
		
		b.setIncome(50000);
		b.setName("Jihan");
		b.setAddress("Turkey");
		b.setDob(sdf.parse("04/11/1991"));
	
		System.out.println("INCOME: " +b.getIncome());
		System.out.println("NAME: " +b.getName());
		System.out.println("ADDRESS: " +b.getAddress());
		System.out.println("DATE OF BIRTH: "+ sdf.format(b.getDob()));
		
		System.out.println();
		System.out.println("***-------DOCTOR--------***");
		System.out.println();
		
		Doctor d = new Doctor();
		
		d.setName("Haya");
		d.setAddress("Turkey");
		d.setDob(sdf.parse("21/11/1998"));
	    d.setRegistrationNo("21021");
	    
	    System.out.println("NAME: "+ d.getName());
	    System.out.println("ADDRESS: "+d.getAddress());
	    System.out.println("DATE OF BIRTH: " + sdf.format(d.getDob()));
	    System.out.println("REGISTRATION NUMBER: "+ d.getRegistrationNo());
	    
	    System.out.println();
	    System.out.println("***-----STUDENT-----***");
	    System.out.println();
	    
	    Student s = new Student();
	    
	    
	    s.setName("Imama");
	    s.setRollno("210");
	    s.setMarks(10);
	    s.setDob(sdf.parse("04/11/1990"));
	    s.setAddress("US");
	    
	    System.out.println("NAME: "+s.getName());
	    System.out.println("ROLL NUMBER:" +s.getRollno());
	    System.out.println("MARKS: "+s.getMarks());
	    System.out.println("DATE OF BIRTH: "+sdf.format(s.getDob()));
	    System.out.println("ADDRESS: " + s.getAddress());
	    
	    
		
		
	}
	

}

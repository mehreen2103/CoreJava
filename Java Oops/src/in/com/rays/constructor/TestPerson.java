package in.com.rays.oops.constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
			Person P = new Person("Mehreen Ansari","Indore",(sdf.parse("04-11-2004")));
			
			System.out.println("p name is: " +P.getName());
			System.out.println("P address is: " +P.getAddress());
			System.out.println("Pdob is: " +(sdf.format(P.getDob())));
	}
}

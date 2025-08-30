package in.com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DobFromatt {
	
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("K:mm a,z ");
		
		String str = sdf.format(d);
		System.out.println(str);
		
		System.out.println();
		
		String dob = "2004/11/03";
		System.out.println("dob "+ dob);
		
		System.out.println();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf1.parse(dob);
		System.out.println("dob :" +date);
		
	}

}

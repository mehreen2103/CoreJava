package in.com.rays.basic;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		System.out.println("----*---before formating----*---");
		System.out.println("date: " +d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String str = sdf.format(d);//format method convert date to string
		System.out.println("---After Formattinhg---");
		System.out.println("date: " +str);
		System.out.println();
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("h:mm a");
		String str1 = sdf1.format(d);
		System.out.println(str1);
		
		
		System.out.println("-----******------");
		System.out.println();
		String dob ="2003/11/21";
		System.out.println("dob :"+dob);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf2.parse(dob);
		System.out.println("dob :" +date);
}
}
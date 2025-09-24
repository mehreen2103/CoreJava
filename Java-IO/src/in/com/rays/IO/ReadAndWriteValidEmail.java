package in.com.rays.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteValidEmail {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("D://IO//Email.txt"));
     	BufferedWriter bw = new BufferedWriter(new FileWriter("D://IO//Email"));
		
		String emailRegex= "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
		
		String email = br.readLine();
		
		while (email != null) {
			if (email.matches(emailRegex));{
			System.out.println(email);
			bw.write(email);
//			br.readLine();
			
		}
		email = br.readLine();
		
	}
	br.close();
	bw.close();
	System.out.println("Valid Email Copy successfully");

}
}
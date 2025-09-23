package in.com.rays.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter f = new FileWriter("D://IO//Rays.txt");
		
		f.write("Hello \nThis is my First Programme In File Handling ");
		
		f.close();
		
		System.out.println("Data inserted Successfully");
		
	}

}

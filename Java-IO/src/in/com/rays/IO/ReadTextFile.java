package in.com.rays.IO;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	
	public static void main(String[] args) throws Exception {
		
		FileReader  file = new FileReader("D://IO//Hello.txt");
		
		int i =  file.read();
		
		while(i != -1) {
			
			System.out.print((char)i);
			i = file.read();
		}
		file.close();
		
	}

}

package in.com.rays.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextFileByBufferedReader {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("D://IO//Hello.txt"));
		
		String line = br.readLine();
		
		while (line != null) {
			
			System.out.println(line);
			line = br.readLine();
		}
		
		br.close();
	}

}

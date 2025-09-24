package in.com.rays.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadDataFromKeyboard {
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter Out = new PrintWriter(new FileWriter("D://IO//temp.txt"));
		InputStreamReader kb = new 	InputStreamReader(System.in);
		
		BufferedReader in = new BufferedReader(kb);
		String line = in.readLine();
				
				while(!line.equals("Quit")) {
					
					Out.println(line);
					line =  in.readLine();
				}
				
				in.close();
				Out.close();
				kb.close();
				
	}
}
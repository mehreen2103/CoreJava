package in.com.rays.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WrietTextFileByBufferedWriter {
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("D://IO//Rays.txt"));
		bw.write("Hello Sunil OS");
		bw.newLine();
		bw.write("Welcome to Rays Technologies");
		
		bw.close();
		System.out.println("Successfully");
	}

}

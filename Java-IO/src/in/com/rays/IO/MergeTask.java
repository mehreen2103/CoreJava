package in.com.rays.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeTask {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("D://IO//Helloworld.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("D://IO//Java.txt"));
		
		//Write File
		BufferedWriter bw = new BufferedWriter(new FileWriter("D://IO//mergefile.txt"));
		
		
		
		
		String s = br.readLine();
		String s1 = br1.readLine();
		
		while (s!=null) {
			System.out.println(s);
			bw.write(s);
			bw.newLine();
			s = br.readLine();
			
		}
		
		
		while (s1!=null) {
			System.out.println(s1);
			bw.write(s1);
			bw.newLine();
			s1 = br1.readLine();
			
		}
		br.close();
		br1.close();
		bw.close();
		}
		
	}

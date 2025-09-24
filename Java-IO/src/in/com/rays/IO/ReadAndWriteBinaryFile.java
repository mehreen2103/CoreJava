package in.com.rays.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {
	public static void main(String[] args) throws IOException {
		

		    String source = "D://IO//Nature.jpg";
		    String target = "D://IO//Road.jpg";
		
			FileInputStream in = new FileInputStream(source);
			FileOutputStream out = new FileOutputStream(target);
			
			int i = in.read();
			while (i != -1) {
				out.write(i);
				i = in.read();
			}
			out.close();
			in.close();
			System.out.println("Image Read Successfully");
	}

		
}

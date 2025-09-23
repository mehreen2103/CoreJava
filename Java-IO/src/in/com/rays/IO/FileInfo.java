package in.com.rays.IO;

import java.io.File;
import java.util.Date;

public class FileInfo {
	
	public static void main(String[] args) {
		
		File f = new File("D://IO//Hellvo.txt");
		
		if (f.exists()) {
			
			System.out.println("File Name: "+ f.getName());
			System.out.println("Absolute Path: "+ f.getAbsolutePath());
			System.out.println("Writeable" + f.canWrite());
			System.out.println("Readable: "+ f.canRead());
			System.out.println("File: " +f.isFile());
			System.out.println("Directory: "+f.isDirectory());
			System.out.println("Size: "+ f.length());
			
			Date d = new Date(f.lastModified());
			System.out.println("Last Modified: "+ d);
		}
		else {
			System.out.println("File not found");
		}
	}

}

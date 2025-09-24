package in.com.rays.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWritePrimitiveData {
	
	public static void main(String[] args) throws IOException {
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream("D://IO//Binary.txt"));
		
		out.writeInt(1);
		out.writeBoolean(true);
		out.writeChar('S');
		out.writeDouble(1.2);
		out.close();
		
		DataInputStream in = new DataInputStream(new FileInputStream("D://IO//Binary.txt"));
		
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		in.close();
	}
	

}

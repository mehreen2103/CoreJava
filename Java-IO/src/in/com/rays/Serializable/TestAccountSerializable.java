package in.com.rays.Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerializable {
	
	public static void main(String[] args) throws Exception {
		
		Account a = new Account(50000.00, 2513);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Account.xls"));
		
		//Convert Account class object into byte stream-----> Serealization
		out.writeObject(a);
		
		out.close();
		System.out.println("Object Converted Into byte stream");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Account.xls"));
		
		//Convert byte stream into Account class object -------> Deserealization
		
		
		a = (Account) in.readObject();
		System.out.println(a);
		
		in.close();
	}

}

package in.com.rays.Externalizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalizable {
	
	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee (1, 45000);
		
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Employee.xls"));
		
		//Convert Employee class object into byte stream-----> Serealization
        
		out.writeObject(e);
		
		out.close();
		
		System.out.println("Object Converted Into byte stream");
		
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Employee.xls"));
		
		//Convert byte stream into Account class object -------> Deserealization
		
		
		e = (Employee) in.readObject();
		
		System.out.println(e);
		
		in.close();
		
	 
	}

}

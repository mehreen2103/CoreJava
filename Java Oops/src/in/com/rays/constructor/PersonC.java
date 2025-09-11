package in.com.rays.oops.constructor;

public class PersonC {
	
	public PersonC() {
		
		System.out.println("Person: Default Constructor");
		
	}
	
	public PersonC(String name) {
		this();
		System.out.println("name:"+name);
	}
	
	public PersonC (String name, String Address) {
		this(name);
		System.out.println("Address: "+ Address);
	}
	
	public PersonC(String name, String Address,int age) {
		this( name, Address);
		System.out.println("Age: " + age);
	}

}

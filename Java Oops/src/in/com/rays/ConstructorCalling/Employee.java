package ConstructorCalling;

public class Employee {

	public Employee(){
		System.out.println("Default Constructor ");
	}
	public Employee(String name) {
		
		this();
		System.out.println("Employee Name: "+name);
	}
	
	public Employee(String name, String id ) {
		
		this( name);
		System.out.println("ID: "+ id);
	}
	
	public Employee(String name, String Address,int age) {
		
		this(name,Address);
		System.out.println("Age: "+ age);
	}
	
}

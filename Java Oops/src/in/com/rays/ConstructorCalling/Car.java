package ConstructorCalling;

public class Car {
	
	public Car() {
		
		System.out.println("Default Constructor");
	}
	
	public Car(String Brand) {
		
		this();
		System.out.println("Car Brand: "+ Brand);
	}
	
	public Car (String Brand, String Model) {
		
		this(Brand);
		System.out.println( "Model: "+ Model);
	}
	
	public Car(String Brand, String Model,int year) {
		
		this(Brand, Model);
		System.out.println(   "Year: " +year);
	
	}
}

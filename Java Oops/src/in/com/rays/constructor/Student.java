package in.com.rays.oops.constructor;

public class Student extends PersonC {
	
	public Student() {
		
		System.out.println("Student: Default Constructor");	
	}
	
	public Student(String name, String address, int age, int rollNo) {
		
		super(name,address,age);
		System.out.println("Roll number: "+rollNo);
	}
	
	public static void main(String[] args) {
		
		Student s = new Student("Inaya", "Indore",17,8);
	}

}

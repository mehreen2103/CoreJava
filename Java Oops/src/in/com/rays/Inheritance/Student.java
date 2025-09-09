package in.com.rays.oops.Inheritance;

public class Student extends Person{
	
	private String rollno;
	private int marks;
	
	
	
	public String getRollno() {
		return this.rollno;
	}
	public void setRollno( String rollno) {
		this.rollno = rollno;
	}
	
	
	
	
	public int getMarks() {
		return this.marks;
	}
	
	public void  setMarks( int marks) {
		this.marks = marks;
	}

}

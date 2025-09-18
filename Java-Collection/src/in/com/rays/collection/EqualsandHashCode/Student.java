package in.com.rays.collection.EqualsandHashCode;

public class Student {
	
	private String name;
	private int rollNo ;
	
	public Student(String Name, int rollNo) {
	this.rollNo = rollNo;
	this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			System.out.println("Object null hai");
		return false;
	}
		if (!(obj instanceof Student)) {
			return false;
		}
		
		Student s = (Student) obj;
		
		if (this.rollNo == s.rollNo && this.name == s.name) {
			
			System.out.println("Value bhi same hai");
			return true;
		}
		else {
			System.out.println("Value same nahi hai");
			return false;
		}
	}	
	
	@Override
	public int hashCode() {
		String value = name + rollNo;
		return super.hashCode();
	}
}
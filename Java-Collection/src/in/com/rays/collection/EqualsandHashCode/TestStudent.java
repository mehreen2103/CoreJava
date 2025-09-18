package in.com.rays.collection.EqualsandHashCode;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student ("Neha", 101);
		Student s2 = new Student ("Neha", 201);
		
		System.out.println(s1.equals(s2));
		System.out.println("s1: "+ s1.hashCode());
		System.out.println("s2: "+ s2.hashCode());
	}

}

package in.com.rays.java8;

public class TestAnonymous {
public static void main(String[] args) {
	

	HelloFunctionalInt t = new HelloFunctionalInt() {
		
		@Override
		public void greeting() {
			System.out.println("Hello Anonymous Function");
			
		}
	};
	
	t.greeting();
}
}

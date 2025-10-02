package in.com.rays.java8;

public class TestLambdaExpression {

	public static void main(String[] args) {
		
		HelloFunctionalInt f = () -> {
			System.out.println("Hello Lambda expression");
	};
	f.greeting();
	
}
}
package in.com.rays.java8;

public class TestHelloSumFunctionalInt {

	public static void main(String[] args) {
		HelloSumFunctionalInt f = (i, j) -> {
			return i + j;
		};
		
		int i = 10;
		int j = 20;
		System.out.println(f.sum(i, j));
	}
}

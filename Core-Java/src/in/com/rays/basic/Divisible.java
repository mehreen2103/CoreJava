package in.com.rays.basic;

public class Divisible {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 101; i < 200; i++) {

			if (i % 7 <= 0) {

				System.out.println(i);
				sum = sum + i;

			}
		}

		System.out.println(sum);

	}
}


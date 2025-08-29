package in.com.rays.basic;

import java.util.Scanner;

public class TestCalculator {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		
		System.out.println("enter opr like +,-,*,/,%");
		String opr = sc.next();
		
		switch (opr) {
		case "+":
			System.out.println("result: " +(a+b));
			break;
			
		case "-":
			System.out.println("result: " +(a-b));
			break;

		case "*":
			System.out.println("result: " +(a*b));
			break;

		case "%":
			System.out.println("result: " +(a%b));
			break;


		default:
			
			System.out.println("*****ERROR*****");
			
			break;
		}
	}

}

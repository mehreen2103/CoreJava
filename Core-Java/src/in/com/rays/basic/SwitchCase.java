package in.com.rays.basic;

public class SwitchCase {

	public static void main(String[]args) {
		String day = "SUNDAY";
			
			switch (day) {
			case "MONDAY":
				System.out.println("1st day of the week");
				break;
			case "TUESDAY":
				System.out.println("2ND day of the week");
				break;
			case "WEDNESDAY":
				System.out.println("3RD day of the week");
				break;
			case "THURSDAY":
				System.out.println("4TH day of the week");
				break;
			case "FRIDAY":
				System.out.println("5tH day of the week");
				break;

			default:
				System.out.println("TODAY IS HOLIDAY");
				break;
			}
	}
}

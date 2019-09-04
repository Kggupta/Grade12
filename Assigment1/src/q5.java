import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("What day of the week is it? (1 = Sunday, 1-7)");
		int dayOfWeek = input.nextInt();

		switch (dayOfWeek){
			case 1:
				System.out.println("Sunday");
			break;
			case 2:
				System.out.println("Monday");
			break;
			case 3:
				System.out.println("Tuesday");
			break;
			case 4:
				System.out.println("Wednesday");
			break;
			case 5:
				System.out.println("Thursday");
			break;
			case 6:
				System.out.println("Friday");
			break;
			case 7:
				System.out.println("Saturday");
			break;

		}
	}
}

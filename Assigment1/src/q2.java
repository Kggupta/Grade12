import java.util.Scanner;

class q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("What is your first name? ");
		String firstName = input.nextLine();
		System.out.print("What is your middle name? ");
		String middleName = input.nextLine();
		System.out.print("What is your last name? ");
		String lastName = input.nextLine();

		System.out.println("I can list you as:");
		System.out.println(lastName + ", " + firstName + " " + middleName);
		System.out.println(firstName + " " + middleName + " " + lastName);
		System.out.println(firstName + " " + middleName.charAt(0) + ". " + lastName);
	}
}

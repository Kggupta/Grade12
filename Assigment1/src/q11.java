import java.util.Scanner;
class q11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int intVal = input.nextInt();

		int intLength = String.valueOf(intVal).length();
		int sum = 0;
		while (intVal > 0) {
			sum += intVal % 10;
			intVal = intVal / 10;
		}
		System.out.format("%d digits and a sum of %d", intLength, sum);

	}
}

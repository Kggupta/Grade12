import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

class q12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Minimum Value: ");
		int minVal = input.nextInt();
		System.out.print("Maximum Value: ");
		int maxVal = input.nextInt();

		System.out.printf("Random number between %d and %d is %d", minVal, maxVal, ThreadLocalRandom.current().nextInt(minVal, maxVal + 1));
	}

}

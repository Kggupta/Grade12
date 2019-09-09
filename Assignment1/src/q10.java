import java.util.Scanner;

class q10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the starting value: ");
		int startingVal = input.nextInt();
		System.out.print("Enter the ending value: ");
		int endingVal = input.nextInt();
		System.out.print("Enter the increment: ");
		int incrementVal = input.nextInt();

		System.out.printf("%10s %10s\n","Value","Square");
		for (int i = startingVal; i <= endingVal; i+=incrementVal){
			System.out.printf("%8s %10s\n",i,i*i);
		}
	}
}

import java.util.Scanner;

class q14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of histogram: ");
		int count = input.nextInt();
		int[] numbers = new int[count];

		while (true){
			for(int i = 0;i < count;i++){
				System.out.print("Enter number: ");
				int inputNumber = input.nextInt();
				numbers[i] = inputNumber;
			}
			histogram(numbers);
			return;
		}
	}

	public static void histogram(int[] x){
		for (int i = 0; i < x.length; i++) {
			for (int t = 0;t < x[i]; t++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}

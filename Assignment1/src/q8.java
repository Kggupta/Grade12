import java.util.Scanner;

class q8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many rows do you want? ");
		int numOfRows = input.nextInt();

		for (int iteration = 1; iteration <= numOfRows; iteration++){
			for (int rowLength = 1; rowLength <= iteration; rowLength++){
				System.out.print(rowLength + " ");
			}
			System.out.println();
		}

	}
}

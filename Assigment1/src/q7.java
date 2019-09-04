import java.util.Scanner;

class q7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int wordcount = 0;

		while (true){
			System.out.print("Enter word: ");
			String word = input.nextLine();

			if (word.equals("exit") || word.equals("quit")){
				System.out.println("Total amount of words is: " + wordcount);
				return;
			}
			wordcount++;
		}
	}
}

import java.util.Scanner;

class q9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float gradeNum = 0;
		float gradeTotal = 0;

		while (true){
			System.out.print("Enter grade (-1 to exit): ");
			float grade = input.nextFloat();

			if (grade == -1){
				System.out.format("Your Average: %.2f%n" , gradeTotal/gradeNum);
				return;
			}
			gradeNum++;
			gradeTotal+= grade;
		}
	}
}

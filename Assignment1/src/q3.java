import java.util.Scanner;

class q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Value 1: ");
		float w = input.nextFloat();
		System.out.print("Value 2: ");
		float x = input.nextFloat();
		System.out.print("Value 3: ");
		float y = input.nextFloat();
		System.out.print("Value 4: ");
		float z = input.nextFloat();

		System.out.println("Greatest of the four values is: " + Math.max(Math.max(w, x), Math.max(y, z)));
	}

}

import java.util.Scanner;

class q15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.print("Enter an integer: ");
			String count = input.nextLine();
			try{
				int result = Integer.parseInt(count);
				break;
			}catch(Exception e){
				System.out.println("Thats not an integer");
			}
		}
		System.out.println("That is an integer");
	}
}

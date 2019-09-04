import java.util.Scanner;

class q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Price of your purchase: ");
		double purchase = input.nextFloat();

		if (purchase >= 25 && purchase < 50){
			purchase = purchase * 0.9;
		}else if(purchase >= 50 && purchase < 75){
			purchase = purchase * 0.8;
		}else if(purchase >= 75 && purchase < 100){
			purchase = purchase * 0.7;
		}else if(purchase >= 100){
			purchase = purchase * 0.6;
		}

	  System.out.format("Final price: %.2f%n", purchase);
	}
}


class q6 {
	public static void main(String[] args) {
		//DO LOOP
		//2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		int count = 1;
		do{
			count ++;
			System.out.print(count + " ");
		} while (count < 20);
		System.out.println();

		//FOR LOOP
		//2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		for (int count2 = 2; count2 <= 20; count2++){
			System.out.print(count2 + " ");
		}
		System.out.println();

		//WHILE LOOP 1
		//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		count = 0;//This line changed
		while (count < 20) {
			count ++;
			System.out.print(count + " ");
	  }
		System.out.println();

		//WHILE LOOP 2
		//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		count = 1;
		while (count <= 20) {//This line changes
			System.out.print(count + " ");
			count ++;
		}
	}

}

//2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

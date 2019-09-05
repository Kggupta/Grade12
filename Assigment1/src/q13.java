
class q13 {
	static int getBiggerNumber(int x, int y){
		return Math.max(x,y);
	}

	public static void main(String[] args) {
		System.out.println(getBiggerNumber(20, -10));
		System.out.println(getBiggerNumber(10, 10));
		System.out.println(getBiggerNumber(10, 20));
	}
}

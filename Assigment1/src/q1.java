import java.util.Scanner;

class q1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Radius of the circle: ");
    double radius = input.nextFloat();

    double area = Math.PI*radius*radius;
    double circumfrence = 2*Math.PI*radius;
    System.out.format("Area: %.1f%n", area);
    System.out.format("Circumfrence: %.1f%n", circumfrence);
  }
}
/*
 * Name: Keshav
 * Date: Sat Oct 19 2019
 * Teacher: Ms.Luce
 */
package volumessurfacearea;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author keshavgupta
 */
public class Prism {
    //All essential attributes
    double depth;
    double width;
    double height;
    double surfaceArea;
    double volume;
    String shapeName;
    
    //Prism constructor i want name of shape initialized as Prism
    public Prism(){
        shapeName = "Prism";
    }

    public double getSideLength(String prompt){
        System.out.print(prompt);
        Scanner input = new Scanner(System.in);
        double sideLength;
        while (true){
            try{
                sideLength = input.nextDouble();
                break;
            }
            catch (InputMismatchException err){
                input.next();
                System.out.print("Not a valid side length. " + prompt);
            }
        }
        return sideLength;
    }

    public static void main(String[] args) {
        Prism shape1 = new Prism();

    }

}

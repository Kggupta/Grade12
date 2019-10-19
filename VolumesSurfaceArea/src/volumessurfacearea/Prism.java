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

    public void assignSideLengths(){
       while(true){
            this.height = getSideLength("What is the height of the Prism? ");
            if (this.height > 0) break;
            else System.out.println("The Side Length cannot be less than 0.");
       }
       while(true){
            this.width = getSideLength("What is the width of the Prism? ");
            if (this.width > 0) break;
            else System.out.println("The Side Length cannot be less than 0.");
       }
       while(true){
            this.depth = getSideLength("What is the depth of the Prism? ");
            if (this.depth > 0) break;
            else System.out.println("The Side Length cannot be less than 0.");
       }
    }

    public double calcVolume(){
        return this.depth * this.width * this.height;
    }
    
    public double calcSurfaceArea(){
        return 2 * (this.depth * this.width + this.depth * this.height + this.width * this.height);
    }
    
    public void outputResults(){
        System.out.format("The %s's volume is %s units cubed\n The %s's surface area is %s units squared", this.shapeName,this.volume, this.shapeName, this.surfaceArea);
    }
    
    public static void main(String[] args) {
        Prism shape1 = new Prism();
        shape1.assignSideLengths();
        shape1.volume = shape1.calcVolume();
        shape1.surfaceArea = shape1.calcSurfaceArea();
        shape1.outputResults();
    }

}

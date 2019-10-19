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

//Superclass Prism
public class Shape {
    //All essential attributes
    double depth;
    double width;
    double height;
    double surfaceArea;
    double volume;
    String shapeName;

    //Prism constructor i want name of shape initialized as Prism
    public Shape(){
        shapeName = "Prism";
    }

    //Helper Method to get sideLengths
    public double getSideLength(String prompt){//Takes in a prompt to specify what is being asked for
        System.out.print(prompt);//Print prompt to console
        Scanner input = new Scanner(System.in);//scanner as alias input
        double sideLength;//variable to store the input
        while (true){//continue asking for input until valid
            try{//if sideLength can be casted to a double
                sideLength = input.nextDouble();//assign input to variable
                break;//stop loop
            }
            catch (InputMismatchException err){//if input was not a double
                input.next();
                System.out.print("Not a valid side length. " + prompt);//reprompt the user for a valid sidelength
            }
        }
        return sideLength;//return the value of sidelength for assignment to whatever variable I specify
    }

    public void assignSideLengths(){//fill in the unknown sideLengths
       while(true){//get height of prism
            this.height = getSideLength("What is the height of the Prism? ");//assign returned sideLength to the object height attribute
            if (this.height > 0) break;//if it is a valid side length (non negative value) end loop
            else System.out.println("The Side Length cannot be less than 0.");//if it is an invalid sideLength, go back to getSideLength method
       }
       while(true){//see line 49
            this.width = getSideLength("What is the width of the Prism? ");
            if (this.width > 0) break;
            else System.out.println("The Side Length cannot be less than 0.");
       }
       while(true){//see line 49
            this.depth = getSideLength("What is the depth of the Prism? ");
            if (this.depth > 0) break;
            else System.out.println("The Side Length cannot be less than 0.");
       }
    }

    public double calcVolume(){//method to calculate volume
        return this.depth * this.width * this.height;
    }

    public double calcSurfaceArea(){//method to calculate surface area
        return 2 * (this.depth * this.width + this.depth * this.height + this.width * this.height);
    }

    public void outputResults(){//Output the calculated results
        System.out.format("The %s's volume is %.2f units cubed\nThe %s's surface area is %.2f units squared\n\n", this.shapeName,this.volume, this.shapeName, this.surfaceArea);
    }

    public static void main(String[] args) {//Main code
        //test shapes
        Shape shape1 = new Shape();//New prism
        shape1.assignSideLengths();//assign the prism it's sides
        shape1.volume = shape1.calcVolume();//calculate prism volume based on lengths
        shape1.surfaceArea = shape1.calcSurfaceArea();//calculate surface area based on lengths
        shape1.outputResults();//output values to user
        
        Sphere shape2 = new Sphere();//New sphere
        shape2.assignSideLengths();
        shape2.volume = shape2.calcVolume();
        shape2.surfaceArea = shape2.calcSurfaceArea();
        shape2.outputResults();

        Cylinder shape3 = new Cylinder();//New cylinder
        shape3.assignSideLengths();
        shape3.volume = shape3.calcVolume();
        shape3.surfaceArea = shape3.calcSurfaceArea();
        shape3.outputResults();
        
        
                
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twoDimShapes;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author keshavgupta
 */
public class TwoDShape {
    protected double length;//Declare attributes
    protected double height;
    protected String twoDShapeName;
    protected double area;
    protected double perimeter;
    
    public TwoDShape(){//Rectangle constructor
        twoDShapeName = "Rectangle";
    }
    
    protected double getSideLength(String prompt){//Takes in a prompt to specify what is being asked for
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
    
    public void assignSideLengths(){
       while(true){//get length of rectangle
            this.length = getSideLength("What is the length of the Rectangle? ");//assign returned sideLength to the object height attribute
            if (this.length > 0) break;//if it is a valid side length (non negative value) end loop
            else System.out.println("The Side Length cannot be less than 0.");//if it is an invalid sideLength, go back to getSideLength method
       }
       while(true){//get height of rectangle
            this.height = getSideLength("What is the height of the Rectangle? ");//assign returned sideLength to the object height attribute
            if (this.height > 0) break;//if it is a valid side length (non negative value) end loop
            else System.out.println("The Side Length cannot be less than 0.");//if it is an invalid sideLength, go back to getSideLength method
       }
    }
    
    public void setArea(){//Calc area b * h
        this.area = this.length * this.height;
    }
    
    public void setPerimeter(){//get perimeter 2(b + h)
        this.perimeter = 2 * this.length + 2 * this.height;
    }
    
    public void displayResults(){//Send results
        System.out.format("The %s's area is: %.2f units squared\nThe perimeter of the %s is: %.2f units\n\n", this.twoDShapeName, this.area, this.twoDShapeName, this.perimeter);
    }
}

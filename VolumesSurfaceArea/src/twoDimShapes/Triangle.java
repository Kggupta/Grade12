/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twoDimShapes;

/**
 *
 * @author keshavgupta
 */
public class Triangle extends TwoDShape{
    protected double sideA;//declare the three sides
    protected double sideB;
    protected double sideC;
    
    public Triangle(){//Constructor
        twoDShapeName = "Triangle";
    }
    
    private boolean checkValidTriangle(double A, double B, double C){//Method for checking if the triangle is possible
        if(A + B < C){//Sum or 2 sides must be more than the sum of the third side (if not then return false)
            return false;
        }else if(A + C < B){
            return false;
        }else if(B + C < A){
            return false;
        }
        return true;//If none of the statements earlier triggered false then send true
    }
    @Override
    public void assignSideLengths(){
       while(true){
            while(true){//get length of rectangle
                 this.sideA = getSideLength("What is the length of side A of the Triangle? ");//assign returned sideLength to the object height attribute
                 if (this.sideA > 0) break;//if it is a valid side length (non negative value) end loop
                 else System.out.println("The Side Length cannot be less than 0.");//if it is an invalid sideLength, go back to getSideLength method
            }
            while(true){//get height of rectangle
                 this.sideB = getSideLength("What is the length of side B of the Triangle? ");//assign returned sideLength to the object sideb attribute
                 if (this.sideB > 0) break;//if it is a valid side length (non negative value) end loop
                 else System.out.println("The Side Length cannot be less than 0.");//if it is an invalid sideLength, go back to getSideLength method
            }
            while(true){//get height of rectangle
                 this.sideC = getSideLength("What is the length of side C of the Triangle? ");//assign returned sideLength to the object sidec attribute
                 if (this.sideC > 0) break;//if it is a valid side length (non negative value) end loop
                 else System.out.println("The Side Length cannot be less than 0.");//if it is an invalid sideLength, go back to getSideLength method
            }
            if (checkValidTriangle(this.sideA, this.sideB, this.sideC)){//if checkvalidtriangle returns true (triangle possible)
                break;//end loop
            }else{//say its not a balid triangle and get side lengths again
                System.out.println("That is not a valid Triangle");
            }
       }
    }
    
    @Override
    public void setPerimeter(){//Calculate perimeter
        this.perimeter = this.sideA + this.sideB + this.sideC;
    }
    
    @Override
    public void setArea(){//Calculate area
        this.area = Math.sqrt(this.perimeter/2 * (this.perimeter/2 - this.sideA) * (this.perimeter/2 - this.sideB) * (this.perimeter/2 - this.sideC));
    }
}

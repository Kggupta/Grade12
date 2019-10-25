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
public class Circle extends TwoDShape{
    public Circle(){//Circle constructor
        twoDShapeName = "Circle";
    }    
    
    @Override
    public void assignSideLengths(){//Set necessary sides
            while(true){//get radius
                 this.length = getSideLength("What is the radius of the circle? ");//assign returned sideLength to the object radius attribute
                 if (this.length > 0) break;//if it is a valid side length (non negative value) end loop
                 else System.out.println("The raidus cannot be less than 0.");//if it is an invalid sideLength, go back to getSideLength method
            }
    }
    
    @Override
    public void setArea(){//Calc area
        this.area = 2 * Math.PI * this.length * this.length;
    }
    
    @Override
    public void setPerimeter(){//Calc perimeter
        this.perimeter = 2 * Math.PI * this.length;
    }
}

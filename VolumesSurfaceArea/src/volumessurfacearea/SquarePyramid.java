/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumessurfacearea;

/**
 *
 * @author keshavgupta
 */
public class SquarePyramid extends Shape{
    
    public SquarePyramid(){//Square pyramid constructor
        shapeName = "Square Based Pyramid";
    }
    
    @Override//override annotation
    public void assignSideLengths(){
       while(true){//get radius of sphere see shape.java for indepth comments
            this.width = getSideLength("What is the width of the Square Base? ");
            if (this.width > 0) break;
            else System.out.println("The width cannot be less than 0.");
       }
       while(true){//get radius of sphere see shape.java for indepth comments
            this.height = getSideLength("What is the height of the pyramid? ");
            if (this.height > 0) break;
            else System.out.println("The width cannot be less than 0.");
       }
    }
    
    @Override
    public void setVolume(){//method to calculate volume
        this.volume = this.width * this.width * (this.height/3);
    }
    
    @Override
    public void setSurfaceArea(){//method to calculate surface area
        this.surfaceArea = this.width * this.width + 2 * this.width * Math.sqrt(((this.width * this.width)/4) + this.height * this.height);
    }
}

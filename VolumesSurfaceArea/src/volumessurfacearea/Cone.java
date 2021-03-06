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
public class Cone extends Shape{
    private double radius;//radius attribute
    
    public Cone(){//Cone constructor
        shapeName = "Cone";
    }
    
    @Override//override annotation
    public void assignSideLengths(){
       while(true){//get radius of cylinder see shape.java for indepth comments
            this.radius = getSideLength("What is the radius of the base of the Cone? ");
            if (this.radius > 0) break;
            else System.out.println("The radius cannot be less than 0.");
       }
        while(true){//get height of cylinder see shape.java for indepth comments
            this.height = getSideLength("What is the height of the Cone? ");
            if (this.height > 0) break;
            else System.out.println("The height cannot be less than 0.");
       }
    }
    
    @Override
    public void setVolume(){//method to calculate volume
        this.volume = Math.PI * this.radius * this.radius * (this.height / 3);
    }
    
    @Override
    public void setSurfaceArea(){//method to calculate surface area
        this.surfaceArea = Math.PI * this.radius * (this.radius + Math.sqrt(this.height * this.height + this.radius * this.radius));
    }
}

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
public class Sphere extends Shape{
    private double radius;
    
    public Sphere(){
        shapeName = "Sphere";
    }
    
    @Override//override annotation
    public void assignSideLengths(){
       while(true){//get radius of sphere see shape.java for indepth comments
            this.radius = getSideLength("What is the radius of the Sphere? ");
            if (this.radius > 0) break;
            else System.out.println("The radius cannot be less than 0.");
       }
    }
    
    @Override
    public void setVolume(){//method to calculate volume
        this.volume = 4.18879 * Math.pow(this.radius,3);
    }
    
    @Override
    public void setSurfaceArea(){//method to calculate surface area
        this.surfaceArea = 4 * Math.PI * (this.radius * this.radius);
    }
    
}

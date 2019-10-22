/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumessurfacearea;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author keshavgupta
 */
public class RunProgram{
    private static int chooseShape(){
        Scanner input = new Scanner(System.in);
        System.out.println("1 : Prism");
        System.out.println("2 : Sphere");
        System.out.println("3 : Cylinder");
        System.out.println("4 : Cone");
        System.out.println("5 : Square Based Pyramid");
        System.out.println("0 : Exit");

        int choice;
        while(true){
            System.out.print("What shape would you like to calculate? ");
            try{
                choice = input.nextInt();
                break;
            }catch(InputMismatchException err){
                System.out.println("Not a valid Choice.");
            }
        }
        return choice;
    }
    private static void run3dShapes(){
        Shape shape1 = new Shape();//New prism
        Sphere shape2 = new Sphere();//New sphere
        Cylinder shape3 = new Cylinder();//New cylinder
        Cone shape4 = new Cone();//New Cone
        SquarePyramid shape5 = new SquarePyramid();//New SquarePyramid

        while(true){//main code that is running for 3d shapes
            int option = chooseShape();//get user's choice of shape
            switch(option){//depending on option, run that shape code
                case 0://exit
                    System.exit(0);
                    break;
                case 1://prism
                    shape1.assignSideLengths();//assign the prism it's sides
                    shape1.volume = shape1.calcVolume();//calculate prism volume based on lengths
                    shape1.surfaceArea = shape1.calcSurfaceArea();//calculate surface area based on lengths
                    shape1.outputResults();//output values to user
                    break;
                case 2://sphere: see prism case for detailed comments
                    shape2.assignSideLengths();
                    shape2.volume = shape2.calcVolume();
                    shape2.surfaceArea = shape2.calcSurfaceArea();
                    shape2.outputResults();
                    break;
                case 3://cylinder: see prism case for detailed comments
                    shape3.assignSideLengths();
                    shape3.volume = shape3.calcVolume();
                    shape3.surfaceArea = shape3.calcSurfaceArea();
                    shape3.outputResults();
                    break;
                case 4://cone: see prism case for detailed comments
                    shape4.assignSideLengths();
                    shape4.volume = shape4.calcVolume();
                    shape4.surfaceArea = shape4.calcSurfaceArea();
                    shape4.outputResults();
                    break;
                case 5://square based pyramid: see prism case for detailed comments
                    shape5.assignSideLengths();
                    shape5.volume = shape5.calcVolume();
                    shape5.surfaceArea = shape5.calcSurfaceArea();
                    shape5.outputResults();
                    break;
                default://if not within 0-5
                    System.out.println("Please enter a number from 0-5");
                    break;
            }
        }
    }

    public static void main(String[] args) {//Main code
        run3dShapes();
    }
}

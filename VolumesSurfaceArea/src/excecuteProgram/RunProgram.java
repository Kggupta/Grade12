/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecuteProgram;

//Import 
import java.util.InputMismatchException;
import java.util.Scanner;
import volumessurfacearea.*;
import twoDimShapes.*;

/**
 *
 * @author keshavgupta
 */
public class RunProgram{
    static Scanner input = new Scanner(System.in);//new input scanner

    private static int choose3dShape(){//directory for choosing 3d shapes
        int choice;//where choice is stored
        while(true){//keep asking for input until within valid (no non-int values)
            System.out.println("1 : Prism");//Options
            System.out.println("2 : Sphere");
            System.out.println("3 : Cylinder");
            System.out.println("4 : Cone");
            System.out.println("5 : Square Based Pyramid");
            System.out.println("0 : To Directory");
            System.out.print("What shape would you like to calculate? ");
        
            try{
                choice = input.nextInt();//get choice using scanner
                break;
            }catch(InputMismatchException err){//if casting input as int gives an error ask for the input again
                input.next();
                System.out.println("Not a valid Choice.");
            }
        }
        return choice;//send userinput to switch case
    }
    
    private static void run3dShapes(){//runs the 3d shapes 
        Shape shape1 = new Shape();//New prism
        Sphere shape2 = new Sphere();//New sphere
        Cylinder shape3 = new Cylinder();//New cylinder
        Cone shape4 = new Cone();//New Cone
        SquarePyramid shape5 = new SquarePyramid();//New SquarePyramid

        while(true){//main code that is running for 3d shapes
            int option = choose3dShape();//get user's choice of shape
            switch(option){//depending on option, run that shape code
                case 0://return to main directory
                    directory();
                    break;
                case 1://prism
                    shape1.assignSideLengths();//assign the prism it's sides
                    shape1.setVolume();//calculate prism volume based on lengths
                    shape1.setSurfaceArea();//calculate surface area based on lengths
                    shape1.outputResults();//output values to user
                    break;
                case 2://sphere: see prism case for detailed comments
                    shape2.assignSideLengths();
                    shape2.setVolume();
                    shape2.setSurfaceArea();
                    shape2.outputResults();
                    break;
                case 3://cylinder: see prism case for detailed comments
                    shape3.assignSideLengths();
                    shape3.setVolume();
                    shape3.setSurfaceArea();
                    shape3.outputResults();
                    break;
                case 4://cone: see prism case for detailed comments
                    shape4.assignSideLengths();
                    shape4.setVolume();
                    shape4.setSurfaceArea();
                    shape4.outputResults();
                    break;
                case 5://square based pyramid: see prism case for detailed comments
                    shape5.assignSideLengths();
                    shape5.setVolume();
                    shape5.setSurfaceArea();
                    shape5.outputResults();
                    break;
                default://if not within 0-5
                    System.out.println("Please enter a number from 0-5");
                    break;
            }
        }
    }
    
    private static int choose2dShape(){//choose 2d shape directory (detailed comments in choose3dshapes method)
        int choice;
        while(true){
            System.out.println("1 : Rectangle");//Options for 2d shapes
            System.out.println("2 : Triangle");
            System.out.println("3 : Circle");
            System.out.println("0 : To Directory");
            System.out.print("What shape would you like to calculate? ");
            try{
                choice = input.nextInt();
                break;
            }catch(InputMismatchException err){
                input.next();
                System.out.println("Not a valid Choice.");
            }
        }
        return choice;
    }
    
    private static void run2dShapes(){//switching between twodshapes. depends on the return from the method above
        TwoDShape twoDShape1 = new TwoDShape();//New Rectangle
        Triangle twoDShape2 = new Triangle();//New Triangle
        Circle twoDShape3 = new Circle();//New Circle
        
        while(true){//Main code that runs for 2d shapes
            int option = choose2dShape();//get option from directory
            switch(option){
                case 0://Back to main directory
                    directory();//See directory method
                    break;
                case 1://Rectangle
                    twoDShape1.assignSideLengths();
                    twoDShape1.setArea();
                    twoDShape1.setPerimeter();
                    twoDShape1.displayResults();
                    break;
                case 2://Triangle
                    twoDShape2.assignSideLengths();
                    twoDShape2.setPerimeter();
                    twoDShape2.setArea();
                    twoDShape2.displayResults();
                    break;
                case 3://Circle
                    twoDShape3.assignSideLengths();
                    twoDShape3.setPerimeter();
                    twoDShape3.setArea();
                    twoDShape3.displayResults();
                    break;
                default://If not within range
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
    
    private static int chooseSubProgram(){//Directory for main
        int choice;//store user choice from directory
        while(true){//Continue asking for input until valid
            System.out.println("1 : 2D Shapes");//Options for directory
            System.out.println("2 : 3D Shapes");
            System.out.println("0 : Exit");
            System.out.print("What Shape Type do you want to calculate? ");
        
            try{
                choice = input.nextInt();//Get choice
                break;//Runs if it is a valid input
            }catch(InputMismatchException err){//If type error then throw an error and ask again
                input.next();
                System.out.println("Not a valid Choice.");
            }
        }
        return choice;//send choice to directory method
    }
    
    private static void directory(){//Main directory method
        while(true){
            int option = chooseSubProgram();//Get user option for 2d or 3d shapes
            switch(option){
                case 0://End program
                    System.exit(0);
                    break;
                case 1://Send user to 2d shape directory
                    run2dShapes();
                    break;
                case 2://Send user to 3d shape directory
                    run3dShapes();
                    break;
                default://All other choices are invalid
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
    
    public static void main(String[] args) {//Main code
        directory();//Start at main directory
    }
}

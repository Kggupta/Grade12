/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecuteProgram;

import java.util.InputMismatchException;
import java.util.Scanner;
import volumessurfacearea.*;
import twoDimShapes.*;

/**
 *
 * @author keshavgupta
 */
public class RunProgram{
    static Scanner input = new Scanner(System.in);

    private static int choose3dShape(){
        int choice;
        while(true){
            System.out.println("1 : Prism");
            System.out.println("2 : Sphere");
            System.out.println("3 : Cylinder");
            System.out.println("4 : Cone");
            System.out.println("5 : Square Based Pyramid");
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
    
    private static void run3dShapes(){
        Shape shape1 = new Shape();//New prism
        Sphere shape2 = new Sphere();//New sphere
        Cylinder shape3 = new Cylinder();//New cylinder
        Cone shape4 = new Cone();//New Cone
        SquarePyramid shape5 = new SquarePyramid();//New SquarePyramid

        while(true){//main code that is running for 3d shapes
            int option = choose3dShape();//get user's choice of shape
            switch(option){//depending on option, run that shape code
                case 0://exit
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
    
    private static int choose2dShape(){
        int choice;
        while(true){
            System.out.println("1 : Rectangle");
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
    
    private static void run2dShapes(){
        TwoDShape twoDShape1 = new TwoDShape();
        Triangle twoDShape2 = new Triangle();
        Circle twoDShape3 = new Circle();
        
        while(true){
            int option = choose2dShape();
            switch(option){
                case 0:
                    directory();
                    break;
                case 1:
                    twoDShape1.assignSideLengths();
                    twoDShape1.setArea();
                    twoDShape1.setPerimeter();
                    twoDShape1.displayResults();
                    break;
                case 2:
                    twoDShape2.assignSideLengths();
                    twoDShape2.setPerimeter();
                    twoDShape2.setArea();
                    twoDShape2.displayResults();
                    break;
                case 3:
                    twoDShape3.assignSideLengths();
                    twoDShape3.setPerimeter();
                    twoDShape3.setArea();
                    twoDShape3.displayResults();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
    
    private static int chooseSubProgram(){
        int choice;
        while(true){
            System.out.println("1 : 2D Shapes");
            System.out.println("2 : 3D Shapes");
            System.out.println("0 : Exit");
            System.out.print("What Shape Type do you want to calculate? ");
        
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
    
    private static void directory(){
        while(true){
            int option = chooseSubProgram();
            switch(option){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    run2dShapes();
                    break;
                case 2:
                    run3dShapes();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
    
    public static void main(String[] args) {//Main code
        directory();
    }
}

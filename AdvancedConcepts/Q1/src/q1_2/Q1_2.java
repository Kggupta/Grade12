/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_2;
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author keshavgupta
 */
public class Q1_2 {
    enum WorkType{
        TEST, ASSIGNMENT, LAB;
    }
    protected File url = new File("./src/q1_2/stored.txt");
    protected String work;
    protected WorkType type;
    protected static int line = 1;
    protected int WorkValsChecker(String prompt){//Takes in a prompt to specify what is being asked for this is copied code from a prev assignment
        System.out.format(prompt);
        Scanner input = new Scanner(System.in);
        int num;
        while (true){
            try{
                num = input.nextInt();
                break;
            }
            catch (InputMismatchException err){
                input.next();
                System.out.print("Not a valid integer. " + prompt);
            }
        }
        return num;
    }
    
    private String setMessage(String prompt){//Takes in a prompt to specify what is being asked for this is copied code from a prev assignment
        System.out.format(prompt);
        Scanner input = new Scanner(System.in);
        String num;
        while (true){
            try{
                num = input.nextLine();
                break;
            }
            catch (InputMismatchException err){
                input.next();
                System.out.print("Not a valid String. " + prompt);
            }
        }
        return num;
    }
    
    protected void writeFile(int lineno) throws IOException {
        File f=new File(url.getPath());
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        LineNumberReader  lnr = new LineNumberReader(new FileReader(f));
        lnr.setLineNumber(lineno);
        bw.newLine();
        bw.write(this.work);
        bw.close();
        lnr.close();
         
    }
    
    protected void setWorkType(){
        boolean done = false;
        int choice;
        while(!done){
            choice = WorkValsChecker("0. Exit\n1. TEST\n2. ASSIGNMENT\n3. LAB\nWhat is the Work? ");
            switch(choice){
                case 1:
                    this.type = WorkType.TEST;
                    done = true;
                    break;
                case 2:
                    this.type = WorkType.ASSIGNMENT;
                    done = true;
                    break;
                case 3:
                    this.type = WorkType.LAB;
                    done = true;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    done = false;
                    break;
            }
        }
    }
    
    protected void setMessage(){
        this.work = this.type.toString() + " " + setMessage("What is the title? ");
    }
    
    public static void main(String[] args) throws Exception {
        //Files and enum
        //store to do list to text file
        Q1_2 worker = new Q1_2();
        do{
            worker.setWorkType();
            worker.setMessage();
            worker.writeFile(line);
            line++;
        }while(true);
    }
}

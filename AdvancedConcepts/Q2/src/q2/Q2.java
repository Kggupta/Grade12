/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.nio.file.*;
/**
 *
 * @author keshavgupta
 */
public class Q2 {
    enum WorkType{
        TEST, ASSIGNMENT, LAB, PRESENTATION;
    }
    File url = new File("./src/q2/work.txt");
    String workMsg;
    WorkType workType;
    int line = 1;
    int posnum;
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
        bw.write(this.workMsg);
        bw.newLine();
        bw.close();
        lnr.close();
         
    }
    
    protected void setWorkType() throws IOException{
        boolean done = false;
        int choice;
        while(!done){
            choice = WorkValsChecker("\n------------\nMAIN DIRECTORY\n-1. Exit\n0. Sort Work File\n1. TEST\n2. ASSIGNMENT\n3. LAB\n4. PRESENTATION\n5. Find Work By Type\nWhat is the Work? ");
            this.posnum = choice;
            switch(choice){
                case -1:
                    System.exit(0);
                    break;
                case 1:
                    this.workType = WorkType.TEST;
                    done = true;
                    break;
                case 2:
                    this.workType = WorkType.ASSIGNMENT;
                    done = true;
                    break;
                case 3:
                    this.workType = WorkType.LAB;
                    done = true;
                    break;
                case 4:
                    this.workType = WorkType.PRESENTATION;
                    done = true;
                    break;
                case 0:
                    readFile();
                    break;
                case 5:
                    searchFileWork();//Using sequential search for this as there may be multiple instances and i want all of them
                    break;
                default:
                    System.out.println("Invalid Input");
                    done = false;
                    break;
            }
        }
    }
    
    protected void searchFileWork() throws IOException{
        String categoryWork="\nWORK UNDER THAT CATEGORY\n--------\n";
        List<String> result = Files.readAllLines(Paths.get(url.getPath()));
        int requested = WorkValsChecker("What Work Type do you want to find? (1-4) ");
        for (String i : result){
            if(Character.getNumericValue(i.charAt(0)) == requested){
                categoryWork += (i + "\n");
            }
        }
        System.out.format(categoryWork);
    }
    
    protected void setMessage(){
        this.workMsg = this.posnum + ". " + this.workType.toString() + " - " + setMessage("What is the title? ");
    }
    
    protected void adderDirectory() throws IOException{
        do{
            this.setWorkType();
            this.setMessage();
            this.writeFile(line);
            line++;
        }while(true);
    }
    
    protected void readFile() throws IOException{
        List<String> result = Files.readAllLines(Paths.get(url.getPath()));
        this.sorter(result, result.size());
        File fout = new File(url.getPath());
	FileOutputStream fos = new FileOutputStream(fout);
 
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
 
	for (int i = 0; i < result.size(); i++) {
		bw.write(result.get(i));
		bw.newLine();
	}
 
	bw.close();
    }
    
    protected void sorter(List<String> array, int n){
        if (n == 1)
            return;
      
        for (int i=0; i<n-1; i++)
            if (Character.getNumericValue(array.get(i).charAt(0)) > Character.getNumericValue(array.get(i+1).charAt(0))){
                String temp = array.get(i);
                array.set(i, array.get(i+1));
                array.set(i+1, temp);
            }
      
        sorter(array, n-1);
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // Code for the bonus question
        // Contains files, sorting, recursion, searching, enum
        // Takes work and puts it into file, you can sort it by worktype then search by worktype.
        Q2 worker = new Q2();
        worker.adderDirectory();
    }
    
}

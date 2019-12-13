/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author keshavgupta
 */
public class Main { 
    public int[] marksArray = {};
    
    //Quick sort 
    protected int sortSpliter(int[] toSortArray, int lowLoc, int highLoc){ 
        int pivot = toSortArray[highLoc];  
        int i = (lowLoc-1); 
        for (int j=lowLoc; j<highLoc; j++){ 
            if (toSortArray[j] < pivot){ 
                i++; 
                int temp = toSortArray[i]; 
                toSortArray[i] = toSortArray[j]; 
                toSortArray[j] = temp; 
            } 
        } 
        int temp = toSortArray[i+1]; 
        toSortArray[i+1] = toSortArray[highLoc]; 
        toSortArray[highLoc] = temp; 

        return i+1; 
    } 
    protected void sort(int[] array, int startLoc, int endLoc) { 
        if (startLoc < endLoc){ 
            int partedLoc = sortSpliter(array, startLoc, endLoc); 
            sort(array, startLoc, partedLoc-1); 
            sort(array, partedLoc+1, endLoc); 
        } 
    }
    
    //Append
    public static int[] appendX(int n, int arr[], int x){ 
        int newarr[] = new int[n + 1]; 
        for(int i = 0; i < n; i++){
            newarr[i] = arr[i];
        } 
        newarr[n] = x; 
        return newarr; 
    } 
    //Overloaded append for file IO array
    public static String[] appendX(int n, String arr[], String x){ 
        String newarr[] = new String[n + 1]; 
        for(int i = 0; i < n; i++){
            newarr[i] = arr[i];
        } 
        newarr[n] = x; 
        return newarr; 
    }
    
    //get input
    protected static int getInput(String prompt){
        System.out.print(prompt);
        Scanner input = new Scanner(System.in);
        int userInput;
        while (true){
            try{
                userInput = input.nextInt();
                break;
            }
            catch (InputMismatchException e){
                input.next();
                System.out.print("Not a valid Input. " + prompt);
            }
        }
        return userInput;
    }
        
    //Read to array
    public static int[] readfile(){
        BufferedReader reader;
        String[] arr = {};
        try {
                reader = new BufferedReader(new FileReader("./src/test2/datafile.txt"));
                String line = reader.readLine();
                while (line != null) {
                    arr = appendX(arr.length,arr,line);
                    line = reader.readLine();
                }
                reader.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
        int size = arr.length;
        int [] intArray = new int [size];
        for(int i=0; i<size; i++) {
            intArray[i] = Integer.parseInt(arr[i]);
        }
        return intArray;
    }
    
    //WRITE FILE from array
    public static void write (int[]x) throws IOException{
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter("./src/test2/datafile.txt"));
        for (int i = 0; i < x.length; i++) {
            outputWriter.write(x[i]+"");
            outputWriter.newLine();
        }
        outputWriter.flush();  
        outputWriter.close();  
    }
    
    protected static void outputElements(int[] array){
        int count = 0;
        for(int element: array){
            count++;
            System.out.printf("Mark %d : %d \n", count, element);
            
        }
    }
   
    protected void getAverage(){
        int total = 0;
        for(int element:this.marksArray){
            total += element;
        }
        System.out.println("Your average is: "+ (total/this.marksArray.length));
    }
    protected void updateMarks() throws IOException{
        this.marksArray = readfile();
        
        //Get marks
        while(true){
            int input = getInput("Enter another mark, give a number < 1 to return to directory: ");
            if(input < 0) break;
            if(input > 100){
                System.out.println("Invalid Mark");
                continue;
            }
            this.marksArray = appendX(this.marksArray.length,this.marksArray,input);
        }
        
        write(this.marksArray);
    }
    
    protected void marksOperator() throws IOException{
        while(true){
            int input = getInput("\n\nWhat would you like to do:\n1. Sort file ascending marks\n2. Get highest mark\n3. Print all marks\n4. Get Lowest mark\n5. Get average\n6. Update marks\n7. Quit\nYour choice: ");
            switch(input){
                case 1:
                    this.sort(this.marksArray, 0, this.marksArray.length-1);
                    write(this.marksArray);
                    System.out.println("\nSorted!");
                    break;
                case 2:
                    this.sort(this.marksArray, 0, this.marksArray.length-1);
                    System.out.println("\nYour highest mark was: " + this.marksArray[this.marksArray.length-1]);
                    break;
                case 3:
                    outputElements(this.marksArray);
                    break;
                case 4:
                    this.sort(this.marksArray, 0, this.marksArray.length-1);
                    System.out.println("\nYour lowest mark was: " + this.marksArray[0]);
                    break;
                case 5:
                    this.getAverage();
                    break;
                case 6:
                    this.updateMarks();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not a valid choice");
                    break;  
            }
        }
    }
    
    public static void main(String[] args) throws IOException{ 
        //Marks sorter by getting marks, adding it to an array, saving it to a marks file then asking 
        //the user if they want to sort it, get average, get highest mark, get lowest mark, find mark
        //Sorting using quicksort  for recursion and efficiency
        Main worker = new Main();
        worker.updateMarks();
        worker.marksOperator();
    } 
}

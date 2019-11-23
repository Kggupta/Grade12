/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_1;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author keshavgupta
 */
public class Q1_1 {
    protected int size;
    protected int[] numberArray;
    
    protected int getNumber(String prompt){//Takes in a prompt to specify what is being asked for this is copied code from a prev assignment
        System.out.print(prompt);
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
    
    protected static void sort(int[] array, int n){
        if (n == 1)
            return;
      
        for (int i=0; i<n-1; i++)
            if (array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
      
        sort(array, n-1);
    }
    
    protected void setArrayValues(){
        for(int x = 0; x <= (this.numberArray.length-1); x++){
            this.numberArray[x] = getNumber("Enter next value in array ");
        }
    }
    
    protected void setArrayLength(){
        this.size = getNumber("Enter size of array ");
        this.numberArray = new int[this.size];
    }
    
    protected void outputSorted(){
        String formatted = "";
        for(int a: this.numberArray){
            formatted += " " + a;
        }
        System.out.println("Sorted array:" + formatted);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Recursion and sorting
        //Recursive sorting algorithm for a length of integers
        Q1_1 sorter = new Q1_1();
        sorter.setArrayLength();
        sorter.setArrayValues();
        sort(sorter.numberArray, sorter.size);
        sorter.outputSorted();
    }
    
}

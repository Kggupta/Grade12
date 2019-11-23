/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_3;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author keshavgupta
 */
public class Q1_3 {
    protected int size;
    protected int[] numberArray;
    protected int searchPar;
    protected int index;
    
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
    
    protected void setArrayValues(){
        for(int x = 0; x <= (this.numberArray.length-1); x++){
            this.numberArray[x] = getNumber("Enter next value in array ");
        }
    }
    
    protected void setArrayLength(){
        this.size = getNumber("Enter size of array ");
        this.numberArray = new int[this.size];
    }
    
    protected void bubbleSort(){
        for (int i = 0; i < this.numberArray.length; i++) {
        for (int j = i + 1; j < this.numberArray.length; j++) {
            int tmp = 0;
                if (this.numberArray[i] > this.numberArray[j]) {
                    tmp = this.numberArray[i];
                    this.numberArray[i] = this.numberArray[j];
                    this.numberArray[j] = tmp;
                }
            }
        }
    }
    
    protected int binarySearch(int arr[], int l, int r) { 
        if (this.searchPar > this.getArrMax()){
            return this.index = -1;
        }
        
        if (r>=l) { 
            int mid = l + (r - l)/2; 
            
            // If the element is present at the  
            // middle itself 
            if (arr[mid] == this.searchPar) 
               return this.index = mid;
   
            // If element is smaller than mid, then  
            // it can only be present in left subarray 
            if (arr[mid] > this.searchPar) 
               return binarySearch(arr, l, mid-1); 
   
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid+1, r); 
        } 
   
        // We reach here when element is not present 
        //  in array 
        return this.index = -1; 
    } 
    
    protected void setSearchPar(){
        this.searchPar = getNumber("What number do you want to search ");
    }
    
    protected int getArrLength(){
        return this.numberArray.length;
    }
    
    protected int getArrMax(){
        return this.numberArray[this.numberArray.length-1];
    }
    
    protected int getArrayMin(){
        return this.numberArray[0];
    }
    
    protected int[] getArray(){
        return this.numberArray;
    }
    
    protected void outputIndex(){
        if(this.index == -1){
            System.out.println(this.searchPar + " Not present");
        }else{
            System.out.println(this.searchPar + " in cell " + (this.index + 1));
        }
    }
    
    protected void searcher(){
        do{
            this.setSearchPar();
            this.binarySearch(this.getArray(),0, this.getArrLength());
            this.outputIndex();
        }while(true);
    }
    
    public static void main(String[] args) throws Exception {
        //searching and sorting
        //Take as many length array as needed, sort and have the user ask for the position of some integer input
        Q1_3 sAndS = new Q1_3();
        sAndS.setArrayLength();
        sAndS.setArrayValues();
        sAndS.bubbleSort();
        sAndS.searcher();    
    }
}

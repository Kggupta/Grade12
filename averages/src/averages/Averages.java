/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averages;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
/**
 *
 * @author keshavgupta
 */
public class Averages {
  int size;
  public int[] integerslist;    //declaring array
  double average;
  double range;
  
  
  public static int getNums(String prompt){
        System.out.print(prompt);
        Scanner input = new Scanner(System.in);
        int choice;
        while (true){
            try{
                choice = input.nextInt();
                break;
            }
            catch (InputMismatchException err){
                input.next();
                System.out.print("Not a valid int " + prompt);
            }
        }
        return choice;
  }
  
  public void setSize(){
      this.size = getNums("How many integers do u want to enter: ");
      this.integerslist = new int[this.size];
  }
  public void setAverage(){
    int total = 0;
    for(int x = 0;x<=this.integerslist.length-1;x++){
      total += integerslist[x];
    }
    this.average = total/this.integerslist.length;
  }
  public void setIntegers(){
    for(int x=0;x<=this.integerslist.length-1;x++){
      this.integerslist[x] = getNums((x+1)+". ");
    }
  }
  public void setRange(){
    Arrays.sort(integerslist);
    this.range = integerslist[integerslist.length-1]-integerslist[0];
  }
  public void output(){
    System.out.format("The average is: %.1f\nThe range is: %.1f", this.average,this.range);
  }
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Averages listed = new Averages();
      listed.setSize();
      listed.setIntegers();
      listed.setAverage();
      listed.setRange();
      listed.output();

    }
    
}



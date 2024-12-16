/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.countingnumbers;

import java.util.Scanner;


/**
 *
 * @author e4092399
 */
public class CountingNumbers {

    public static void main(String[] args) {
       //Scanner
       Scanner in = new Scanner (System.in);
       
       System.out.println("Enter a series of integers (type 0 to stop): ");
       
       //Initalise number counters
       int positiveCounter = 0;
       int negativeCounter = 0;
       
       
       while (true){
           
           //while true, scan in number user inputs.
           int num = in.nextInt();
           
           //if the user types 0 the loop is broken.
           if (num == 0){
               break;
           }
           
           else if (num > 0){
               //positive counter is incremented since the number entered is greater than zero.
               positiveCounter++;
           }
           
           else{
               //negative number is incremented since number entered is less than zero.
               negativeCounter++;
           }
       }
       
        System.out.println("Number of positive numbers: " + positiveCounter);
        System.out.println("Number of negative numbers: " + negativeCounter);
      
       
    }
}

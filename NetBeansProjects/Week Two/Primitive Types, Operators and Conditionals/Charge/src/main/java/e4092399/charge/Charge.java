/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.charge;

import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class Charge {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        double adultCharge = 30.00;
        double under18sCharge = 0;
        double over65sCharge = 0;
        
        //Adult but also need to verify if age is over 65.
        if (age > 18 && age < 65){
            adultCharge = 30.00;
            System.out.println("The charge for an adult under 65: " + adultCharge);
        }
        
      
         /* //Extended (under 18s pay 80%.
        else if (age < 18){
            under18sCharge = (20.00 * 0.8);
        }
           */
        
        
        //Extended - under 18s pay 60% of adult charge.
        else if (age < 18){
            under18sCharge = (adultCharge * 0.6);
            System.out.println("The charge for an under 18 is: " + under18sCharge);
        }
        
        //Extended over 65s pay 80% of adult charge.
        else{
            over65sCharge = (adultCharge * 0.8);
            System.out.println("The charge for an over 65 is: " + over65sCharge);
        }
        
        
        
       
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.calculatepostage;

import java.util.Scanner;

/**
 *
 * @author Carlt
 */
public class CalculatePostage {

    public static void main(String[] args) {
        //Scanner to take user inputs
        Scanner in = new Scanner (System.in);
        
        //Ask user to enter the weight of a parcel in kilograms
        
        System.out.println("Enter the parcel weight in kilograms: ");
        
        double parcelWeight = in.nextDouble();
        
        //postal rates depending on parcel weight. The conditions need to check if the parcel weight is between two numbers.
        
        if (parcelWeight < 1){
            double postCost = 3.50;
            System.out.println("The parcel postage cost is: " + postCost);
        }
        
        //parcelWeight is larger than or equal to one and parcelWeight is smaller than or equal to two.
        else if (parcelWeight >= 1 && parcelWeight <= 2){
            double postCost = 6.50;
            System.out.println("The parcel postage cost is: " + postCost);
        }
        
        else if (parcelWeight >= 2 && parcelWeight <= 3){
            double postCost = 10.50;
            System.out.println("The parcel postage cost is: " + postCost);
        }
        
        else if (parcelWeight >= 3 && parcelWeight <= 4){
            double postCost = 13.00;
            System.out.println("The parcel postage cost is: " + postCost);
        }
        
        else if (parcelWeight > 4){
            double postCost = 20.00;
            System.out.println("The parcel postage cost is: " + postCost);
        }
        
        else{
            System.out.println("Please enter a valid parcel weight ");
        }
        
        
        
    }
}

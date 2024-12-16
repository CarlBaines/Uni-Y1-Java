/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.commissioncalculations;

import java.util.Scanner;

/**
 *
 * @author Carlt
 */
public class CommissionCalculations {

    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);
        
        //Assign pre-existing values
        double regularCommission = 0.10;
        
        double bonusCommission = 0.25;
        
        
        //User-inputted values
        System.out.println("Enter the total sales and the total number of items sold below: ");
        
        double totalSales = in.nextDouble();
        double numOfItems = in.nextDouble();
        
        if (numOfItems > 50){
            //bonus commission
            double totalCommission = (totalSales * 0.25);
            System.out.println("Commission: " + totalCommission);
        }
        
        else{
            //normal commission
            double totalCommission = (totalSales * 0.10);
            System.out.println("Commission: " + totalCommission);
        }
    }
}

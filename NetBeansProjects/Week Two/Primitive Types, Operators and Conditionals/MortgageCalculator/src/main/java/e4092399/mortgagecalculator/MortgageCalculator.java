/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.mortgagecalculator;

/**
 *
 * @author e4092399
 */
public class MortgageCalculator {

    public static void main(String[] args) {
        
        //Calculate and display the monthly mortgage amount that would be paid.
        
        int principleAmountBorrowed = 250000;
        double interestRate = 5.0;
        int totalNumberOfMonths = 12;
        
        //Values for equation
        int p = principleAmountBorrowed;
        
        
        
        
        //Top half of equation
        double r = interestRate/12/100;
        
        double topHalfResult = Math.pow(1 + r, totalNumberOfMonths) * r;
        
        
        //Bottom of equation
        
        double bottomHalfResult = Math.pow(1 + r, totalNumberOfMonths) - 1;
        
        
        //Final calculation
        double mortgage =  principleAmountBorrowed * (topHalfResult/bottomHalfResult);
        System.out.println(mortgage);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package e4092399.integertomonths;

import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class IntegerToMonths {

    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 12. ");

        int inputtedNumber = in.nextInt();
        
        //Calls method within the output.
        System.out.println("Month " + inputtedNumber + " is " + getMonthName(inputtedNumber));
    }
    
    
    //Takes the inputtedNumber in as a parameter to the method.
    public static String getMonthName(int inputtedNumber) {
        
        //Array of monthNames.
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        //Returns the value of the index in the array - 1 because Java has zero-based index arrays.
        return monthNames[inputtedNumber - 1];

    }
}

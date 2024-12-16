/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.rangevalidation;

import java.util.Scanner;

/**
 *
 * @author Carlt
 */
public class RangeValidation {

    public static void main(String[] args) {

        // Take input from user.
        // Check to see if inputted number is between 1 and 100.

        for (;;) {

            // Scanner
            Scanner in = new Scanner(System.in);

            System.out.println("Enter a number between 1 and 100");
            int inputtedNumber = in.nextInt();

            if (inputtedNumber >= 1 && inputtedNumber <= 100) {
                System.out.println("The number: " + inputtedNumber + " was between 1 and 100.");
                break;
            }

            else {
                System.out.println("Invalid input. Please try again");
            }
        }

    }
}

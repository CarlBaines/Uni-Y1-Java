/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package e4092399.wk03_lotterynumbers;

import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class WK03_LotteryNumbers {

    public static void main(String[] args) {

        // Scanner
        Scanner keyboard = new Scanner(System.in);

        // Initialises a new array with the type integer and sets the size of the array
        // to seven.
        int[] lotteryNumbers = new int[7];

        // create array of numberstrings and bonus for the format output.

        String[] numberStrings = { "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Bonus Ball" };

        System.out.println("Please enter 7 numbers");

        // loops through the array while the index is less than the length of the
        // lotteryNumbers array
        // duplicate numbers are not allowed
        for (int index = 0; index < lotteryNumbers.length; index++) {

            if (index == 6) {
                System.out.println("Please enter bonus ball number (number 7): ");
            } else {
                System.out.println(
                        // output: number + number entered
                        String.format("Number %d:", index + 1));
            }

            int number = keyboard.nextInt();

            // loop to check for duplicate numbers
            for (int j = 0; j < index; j++) {
                if (number == lotteryNumbers[j]) {
                    System.out.println("Duplicate! Please enter another number");
                    index--;
                    break;
                }
            }

            // sets the of the current index within the array to the number inputted by the user.
            lotteryNumbers[index] = number;

        }

        // output the numbers inputted by the user in order.
        for (int index = 0; index < lotteryNumbers.length; index++) {
            
            //uses the numberStrings array for the format: Number String: Number
            System.out.println(
            String.format(
                        numberStrings[index] + " Number: %3d",
                        index + 1,
                        lotteryNumbers[index]));

        }

        keyboard.close();
    }
}

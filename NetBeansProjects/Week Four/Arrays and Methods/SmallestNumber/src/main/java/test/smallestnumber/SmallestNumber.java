/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package test.smallestnumber;

import java.util.Scanner;

/**
 *
 * @author E4092399
 */
public class SmallestNumber {

    public int number1;
    public int number2;
    public int number3;
    

    public static void main(String[] args) {
        
        int[] numbersForComparison = new int[3];
        
        inputAndValidate(numbersForComparison);
        int smallestNumber = findSmallestNumber(numbersForComparison);
        
        System.out.println("The smallest number was: " + smallestNumber);

    }

    public static int[] inputAndValidate(int [] numbersForComparison) {

        //Scanner
        Scanner in = new Scanner(System.in);

        //initialise a list for the numbers to be added to after validation to be returned
        //Java cannot return multiple values from a method.
        
        
        //validate each number
        boolean flag = true;

        while (flag) {

            //Allow user to enter three numbers
            System.out.println("Enter first number: ");
            int number1 = in.nextInt();

            System.out.println("Enter second number: ");
            int number2 = in.nextInt();

            System.out.println("Enter third number: ");
            int number3 = in.nextInt();
            
            if (number1 < 0 && number1 > 100) {
                //number 1 is invalid.
                System.out.println("Error! Enter a valid first number: ");
            } 
            else if (number2 < 0 && number2 > 100) {
                //number 2 is invalid
                System.out.println("Error! Enter a valid second number: ");
            } 
            else if (number3 < 0 && number3 > 100){
                //number 3 is invalid
                System.out.println("Error! Enter a valid third number");
            }
            
            flag = false;
            numbersForComparison[0] = number1;
            numbersForComparison[1] = number2;
            numbersForComparison[2] = number3;
            
            
        }

        return numbersForComparison;
    }

    public static int findSmallestNumber( int[] numbersForComparison) {
        
        int smallestNumber = 0;
        //loop through the list, compare the three numbers and find the smallest number
        for (int index = 0; index < numbersForComparison.length; index++){
            if (index < numbersForComparison[index]){
                //if 1st number is bigger.
                if (index < numbersForComparison[index]){
                    //if second number is bigger
                    //third number has to be smallest.#
                    smallestNumber = numbersForComparison[index];
                    break;
                }
            }
            
        }
        return smallestNumber;
    }
}

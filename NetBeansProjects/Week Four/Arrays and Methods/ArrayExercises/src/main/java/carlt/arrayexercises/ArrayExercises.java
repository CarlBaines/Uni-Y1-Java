/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package carlt.arrayexercises;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Carlt
 */
public class ArrayExercises {

    public static void main(String[] args) {

        //Scanner
        Scanner in = new Scanner(System.in);

        //Randomly generate a number
        Random rand = new Random();

        //n is used as a temp variable for the length of the array.
        int n = 20;

        //Used later in the program to define a range which the random numbers can be generated between.
        int min = 1;
        int max = 30;
        int numCount = 0;

        int originalArraySize = 0;

        String[] numberStrings = {"First Number", "Second Number", "Third Number", "Fourth Number", "Fifth Number", "Sixth Number", "Seventh Number", "Eigth Number", "Ninth Number", "Tenth Number", "Eleventh Number", "Twelfth Number", "Thirteenth Number", "Fourteenth Number", "Fifteenth Number", "Sixteenth Number", "Seventeenth Number", "Eighteenth Number", "Ninteenth Number", "Twenteith Number"};
        
        String[] numberStringsTwo = {"First Number", "Second Number", "Third Number", "Fourth Number", "Fifth Number", "Sixth Number", "Seventh Number", "Eigth Number", "Ninth Number", "Tenth Number", "Eleventh Number", "Twelfth Number", "Thirteenth Number", "Fourteenth Number", "Fifteenth Number", "Sixteenth Number", "Seventeenth Number", "Eighteenth Number", "Ninteenth Number", "Twenteith Number"}; //For second array.
        
        String[] numberStringsThree = {"First Number", "Second Number", "Third Number", "Fourth Number", "Fifth Number", "Sixth Number", "Seventh Number", "Eigth Number", "Ninth Number", "Tenth Number", "Eleventh Number", "Twelfth Number", "Thirteenth Number", "Fourteenth Number", "Fifteenth Number", "Sixteenth Number", "Seventeenth Number", "Eighteenth Number", "Ninteenth Number", "Twenteith Number"}; //For second array.
        
        int[] randomNumberArray = new int[n];

        //Loop through the array and populate it with random numbers
        for (int index = 0; index < n; index++) {

            int randomNumber = rand.nextInt(min, max);

            randomNumberArray[index] = randomNumber;

        }

        System.out.println("An Array with randomly-generated numbers");
        System.out.println("----------------------------------------");

        for (int index = 0; index < n; index++) {
            //Output numberString: Value stored in array
            System.out.println(String.format(numberStrings[index] + " [" + index + "]: " + randomNumberArray[index]));
        }

        //Ask the user to input a number between 1 and 30.
        System.out.println("\nEnter a number between 1 and 30 to check how many times it appeared in the array: ");

        int inputtedNumber = in.nextInt();

        boolean numberFound = false;

        if (inputtedNumber > min && inputtedNumber < max) {
            //loop through array to see how many times the number was found.
            for (int index = 0; index < n; index++) {

                if (inputtedNumber == randomNumberArray[index]) {
                    numCount += 1;
                    randomNumberArray[index] = 0; //All instances of the number are replaced with 0
                    originalArraySize = randomNumberArray.length;
                    System.out.println("The number " + inputtedNumber + " was found at the index: " + " [" + index + "]");
                    numberFound = true;

                }

            }
        } else {
            //Error message
            System.out.println("You did not enter a number between 1 and 30.");
            System.exit(0);
        }

        //Output number of times the userInputted number was found in the array.
        System.out.println("The number " + inputtedNumber + " was found: " + numCount + " times.");

        // Display the array again, but ignore 0 elements.
        System.out.println("\nArray after replacing all instances of " + inputtedNumber + " with 0:");
        System.out.println("----------------------------------------");

        int numberCounter = 0; //To track which numberString to use when outputting the list to use for the non-zero numbers.
        int nonZeroCount = 0; //Used for making a copy of the array later.
        for (int index = 0; index < n; index++) {
            if (randomNumberArray[index] != 0) {
                System.out.println(numberStrings[numberCounter] + " [" + index + "]: " + randomNumberArray[index]);
                numberCounter++;
                nonZeroCount++; //Increment only when a non-zero number is printed.
            }
        }

        //Create a new array whose size is that of original array minus the number of elements that contain zero. Copy all the non-zero values into the new array then display its contents.
        //Create a copy of the original array with the size equal to the number of non-zero values.
        int[] copiedArray = new int[nonZeroCount];

        System.out.println("----------------------------------------");
        System.out.println("Copied Array");
        System.out.println("----------------------------------------");

        for (int index = 0; index < nonZeroCount; index++) {
            if (randomNumberArray[index] != 0) {
                copiedArray[index] = randomNumberArray[index];
                System.out.println(numberStringsTwo[index] + " [" + index + "]: " + copiedArray[index]);
            }
        }
        
        
        //Create an array that is populated with random numbers in the raange -10 to 10. Display a suitable error message to the user if the array is dominated by negative values.
        
        int minRange = -10;
        
        int maxRange = 10;
        
        int negativeCounter = 0;
        
        int positiveCounter = 0;
        
        int[] arrayThree = new int[20];
        
        for (int j = 0; j < arrayThree.length; j++){
            int randomNumberinArrayThree = rand.nextInt(minRange, maxRange);
            arrayThree[j] = randomNumberinArrayThree;
            
            if (randomNumberinArrayThree < 0){
                //number is negative increment negative counter
                negativeCounter++;
            }
            
            else{
                //number is positive increment positive counter
                positiveCounter++;
            }
        }
        
        System.out.println("----------------------------------------");
        System.out.println("An Array with randomly-generated numbers from the range -10 to 10.");
        System.out.println("----------------------------------------");

        for (int j = 0; j < arrayThree.length; j++){
            //Output numberString: Value stored in array
            System.out.println(String.format(numberStringsThree[j] + " [" + j + "]: " + arrayThree[j]));
        }
        
        if (positiveCounter > negativeCounter){
            System.out.println("\nThe array is dominated with positive values.");
        }
        
        else{
            System.out.println("\nThe array is dominated with negative values.");
        }
        

    }
}

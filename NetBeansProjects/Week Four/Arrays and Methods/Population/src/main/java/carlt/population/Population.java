/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.population;
import java.util.Scanner;

/**
 *
 * @author Carlt
 */
public class Population {

    public static void main(String[] args) {
        //Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Create a new integer array of 10 elements that stores ages.
        
        int[] ages = new int[10];
        
        //set temporary values for age statistics.
        int smallestAge = ages[0];
        int largestAge = ages[1];
        int total = 0;
        
        String[] ageStrings = {"First Age", "Second Age", "Third Age", "Fourth Age", "Fifth Age", "Sixth Age", "Seventh Age", "Eighth Age", "Ninth Age", "Tenth Age"};
        
        System.out.println("Please enter 10 ages: ");
        
        
        //loops through the list whilst the index is less than the length of the list.
        for (int index = 0; index < ages.length; index++){
             
             //output Age + Age entered
             System.out.println(
                     String.format("Age %d: ", index + 1));
            
             
             int inputtedAge = keyboard.nextInt();
             
             //Validate inputs to prevent user adding erroneous data
             //e.g. check for negative numbers and impossible ages
             
             if (inputtedAge <= 0 || inputtedAge >= 116) {
                 //Invalid age inputted
                 System.out.println("Invalid age entered");
                 index--;
                 continue;
             }
           
             
             
             //sets the value of the current index within the ages array to the age inputted by the user.
             ages[index] = inputtedAge;
        }
        
        
        
        //seperate for loop for output - it has to iterate back through the list to read the newly-assigned values.
        
        System.out.println("\n");
        
        for (int index = 0; index < ages.length; index++){
            
            //output First Age: Number
            
            System.out.println(
                    String.format(ageStrings[index] + ": %d",
                        ages[index]));
            
        }
        
        System.out.println("\n");
        
        for (int index = 0; index < ages.length; index++){
            //Output smallest age from the array
            
            if (ages[index] < smallestAge){
                smallestAge = ages[index];

            }
            
            
            //output largest age from array.
            
            if (ages[index] > largestAge){
                largestAge = ages[index];
            }
            
            //changes the value of the total variable to the sum of all the values stored in the ages array.
            
            total += ages[index];
            
            
            
            
        }
        
        //the mean variable stores the mean of the ages list as it divides the total sum of the list by its length.
        int mean = (total/ages.length);
        
        int median = 0;
        
        for (int index = 0; index < ages.length; index++){
            
            int lastIndex = ages[ages.length - 1];
            median = lastIndex/2;
            
        }
        

        //After the loop has finished, print the results.
        System.out.println("The smallest age in the array is: " + smallestAge);
        System.out.println("The largest age in the array is: " + largestAge);
        System.out.println("The average age in the array is: " + mean);
        
        
        //MEDIAN IS WRONG
        System.out.println("The median age in the array is " + median);
        
        keyboard.close();
        
        
        
        
    }
}

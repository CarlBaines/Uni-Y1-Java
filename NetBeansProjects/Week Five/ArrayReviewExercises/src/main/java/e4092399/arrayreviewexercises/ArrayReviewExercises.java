/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.arrayreviewexercises;
import java.util.*;

/**
 *
 * @author e4092399
 */
public class ArrayReviewExercises {

    public static void main(String[] args) {
        
        /*
        
        //populates an array of ten characters.
        char[] initialArray = {'A', 'b', 'c', 'd', 'e', 'F', 'G', 'H', 'i', 'J'};
        char[] characterArray = {'A', 'b', 'c', 'd', 'e', 'F', 'G', 'H', 'i', 'J'};
        
        
        
        //Iterate over the list
        for(int index = 0; index < characterArray.length; index+=2){
            //swap each element at an even index
            
            //swap element at odd index
            char temp = characterArray[index];
            characterArray[index] = characterArray[index + 1];
            characterArray[index + 1] = temp;
            
  
            
        }
        
        System.out.println("Initial Array: " + Arrays.toString(initialArray));
        System.out.println();
        System.out.println("Swapped Array: " + Arrays.toString(characterArray));
        
        */
        
        
        //Copies the contents of an existing array into a new array that is one bigger than the original to make space for a new value. The value must be placed at the beginning of the array.
        
        //Scanner
        Scanner in = new Scanner(System.in);
        
        //initialise new integer array.
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        //initialises a new integer array that is equal to the length of the number array + 1.
        int[] newArray = new int[numberArray.length + 1];
        
        
        //loops until the index is equal to the length of the number array
        for (int index = 0; index < numberArray.length; index++){
            
            //newArray[index] = numberArray[index] - copies the numbers held at each index in the numberArray. Creates a new index at the end of the list
            //the for loop iterates until index is equal to the length of the number array.
            
            
            //adding a + 1 moves the newly-created number held at the final index of the list to the front of the list.
            newArray[index + 1] = numberArray[index];
        
            
        }
        
        System.out.println(Arrays.toString(numberArray));
        System.out.println();
        System.out.println(Arrays.toString(newArray));
        
        
       
        
    }
}

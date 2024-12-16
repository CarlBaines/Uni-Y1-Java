/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package carlt.rainfalldata;

import java.util.*;

/**
 *
 * @author Carlt
 */
public class RainfallData {

    public static void main(String[] args) {
        
        /*
        
        
        
        
        
        Lukey Pookies Brilliant Code Commented
        
        
    
    
        */
        
        
        //This value is intialised and set to zero. It is used to set the number of stars that are outputted for each rainfall value, as the value is looped through later in the program.
        int starValue = 0;
        
        
        //Scanner
        Scanner in = new Scanner(System.in);
        
        //initalises a new integer array for the rainfall values to be stored in. It will have a size of twelve as a rainfall value will be collected for each month.
        int[] rainValues = new int[12];
        
        //loops through the rainValues array.
        for(int i = 0; i < rainValues.length; i++){
            //i + 1 is used as the month counter on output.
            System.out.println("Enter the rainfall data for month " +(i+1)+ ":");
            //the value at the current index in the rainValues array, within the current iteration is set to the next integer user input.
            rainValues[i] = in.nextInt();
        }
        
        
        //A new array is initalised which will hold the sorted version of the rainValues array. It is cloned (each value is copied over) to facilitate for this.
        int[] sortedArray = rainValues.clone();
        //sorted from smallest to largest using the arrays.sort function.
        Arrays.sort(sortedArray);
        
        
        //The maximum value in the array is found by getting the index at the end of the sorted array. (length - 1).
        int maxValue = sortedArray[sortedArray.length - 1];
        
        //The amount per star is calculated by dividing the maximum value in the array by the maximum number of stars that will be used in the histogram - which is set to five.
        int amountPerStar = maxValue / 5;
        
        System.out.println("Month\tRain");
        
        //loops through the rainValues array and conducts a series of if statements.
        for(int i = 0; i < rainValues.length; i++){
            //if statements are conducted to assign a starvalue for each rainfall value which then decides how many stars are outputted in the histogram for each.
            if(rainValues[i] / amountPerStar < 1){ starValue = 0; }
            
            else if(rainValues[i] / amountPerStar < 2){ starValue = 1; }
            
            else if(rainValues[i] / amountPerStar < 3){ starValue = 2; }
            
            else if(rainValues[i] / amountPerStar < 4){ starValue = 3; }
            
            else if(rainValues[i] / amountPerStar < 5){ starValue = 4; }
            
            else { starValue = 5; }
            
            //formatting for output.
            System.out.print((i+1)+"\t"+rainValues[i]+ "|");
            
            //if star value is larger than zero, a for loop is performed through the starValue and an asteriks is outputted for each rainfall value - since it is nested within the for loop.
            if(starValue > 0){
                for(int j = 0; j < starValue; j++){
                    System.out.print("*");
                }
            }
            
            System.out.println("");
        }
    
        
        
        
        
        
    }   
        
        
}       

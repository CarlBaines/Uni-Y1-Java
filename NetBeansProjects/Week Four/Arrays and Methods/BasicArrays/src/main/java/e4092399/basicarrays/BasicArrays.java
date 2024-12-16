/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package e4092399.basicarrays;

import java.util.Random;

/**
 *
 * @author e4092399
 */
public class BasicArrays {

    public static void main(String[] args) {
        
        Random rand = new Random();
        
        
        int[] array = {12, 3, 5, 0, 5, 99, 10}; //I removed the value -1 from [3].
        
        /*
        
        //the above for loop throws an exception when a value is removed from the list because of index < 8 (the for loop will iterate out of the range of the list).
        
        for (int index = 0; index < 8; index++) {
            System.out.printf(
                    "Index %d: Value: %d\n",
                    index,
                    array[index]);
        }

        */
        
        int rand_int = rand.nextInt(100);
        
        System.out.println("The random number generated is: " + rand_int);
        
        for (int index = 0; index < 7; index++) {
            System.out.printf(
                    "Index %d: Value: %d\n",
                    index,
                    array[index]);
            
            //if current index is equal to random number then it is in the array.
            
            int currentIndex = array[index];
            
            if (currentIndex == rand_int){
                //random number is in the list
                System.out.println("""
                                   
                                   The random number generated: """ + rand_int + " was in the list");
            }
            else{
                //random number was not in the list
                System.out.println("""
                                   
                                   Random number was not in the list""");
            }
        }
        
        
    
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.arraydemo;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class ArrayDemo {

    public static void main(String[] args) {
        
        
        
        /*
        int[] numbers = new int[10];
        
        int sum = 0;
        
        for (int index = 0; index < numbers.length; index++){
            
            //first index
            numbers[0] = 5;
            //the value at the current index and iteration in the array is set to the value one. (EXCLUDING THE FIRST AND LAST VALUES).
            numbers[index] = 1;
            //last index
            numbers[numbers.length-1] = 42;
            
            sum += numbers[index];
            
            
        }
        
        System.out.println(sum);
        
        
        System.out.println(Arrays.toString(numbers));

        */
        
        
        int[] timesTable;
        
        //Scanner
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter length: ");
        
        int length = in.nextInt();
        
        System.out.println("Enter multiplier: ");
        
        int multiplier = in.nextInt();
        
        timesTable = new int[length];
        
        for (int index = 0; index < timesTable.length; index++){
            timesTable[index] = (index * multiplier);
        }
        
        System.out.println(Arrays.toString(timesTable));
        
        
    
    }
}

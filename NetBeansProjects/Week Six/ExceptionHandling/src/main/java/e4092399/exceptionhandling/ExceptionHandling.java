/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package e4092399.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int value1 = 0;
        int value2 = 0;
        
        /*
        try { // Start of try block
            System.out.print("Please enter value 1: ");
            value1 = input.nextInt(); // Could throw exception
            System.out.print("Please enter value 2: ");
            value2 = input.nextInt(); // Could throw exception
            int result = value1 / value2; // Could throw exception
            System.out.println("Result = " + result);
        } // End of try block
        
        */
        
        try{
            System.out.println("Please enter value 1: ");
            value1 = input.nextInt();
            
            System.out.println("Please enter value 2: ");
            value2 = input.nextInt();
            
            if (value2 == 10){
              
                //example of throwing runtime exception
                throw new RuntimeException("I don't like dividing by 10!");
            }
            
            if (value2 == 0){
                
                //example of throwing runtime exception for ArithmeticException.
                throw new RuntimeException("You input 0 for the divisor! I don't like dividing by zero.");
            }
        }
        
        
        
        
        //catch statement for catching an arithmetic exception.
        
        /*
        catch (ArithmeticException e) {
            System.out.println("Error! There was arithmetic exception!");
            if (value2 == 0) {
                System.out.println("\tYou input 0 for the divisor!");
            }
        }
        
        */
        
        
        
        
        //catch statement for InputMismatchException
        
        catch (InputMismatchException e){
            System.out.println("Error! There was an input mismatch exception!");
            if (value2 == 0){
                System.out.println("\t You inputted the wrong data type! ");
            }    
        }
        
        //catch statement for multiple exceptions
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.err.println("There was an error");
        }
        
        catch (RuntimeException e) {
            System.out.println("Error! There was some kind of error!");
            System.out.println("Exception details: " + e.getMessage());
        }
        
        //the finally block is a block of code that is always executed at the end of the try catch block.
        finally{
            System.out.println("\nThis is something I always do");
            System.out.println("\tIf the code executed successfully, ");
            System.out.println("\tor one of the tested exceptions was caught.");
        }

        
    }
}

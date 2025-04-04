/* A program demonstrating the implementation and use of an array-based stack in
 * Java taken from Problem Solving with  
 * Java by Elliot Koffman and Ursula Woltz. */
 
package arraystack_app;

import java.io.*;
import java.util.Scanner;

/**
 * The driver class for the array stack app. Do not modify this file.
 */
public class ArrayStack_App
{
	/**
	 * Scanner used to read input from user.
	 */
	private static Scanner reader;
	
	/**
	 * A utility method to wait for user input.
	 */
	private static String readline()
	{
		if (reader == null) {
			reader = new Scanner(System.in);
		}
		return reader.nextLine();
	}
	
	/**
	 * A utility method to print the contents of an array.
     *
     * @param arr	the array to print
	 */
	private static void printArray(double[] arr) 
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
    /**
     * The main method for the array stack app.
     *
     * @param args  the program's command-line arguments
     */
    public static void main(String[] args)
    {     
//           Part A
//          ArrayStack stack = new ArrayStack(10);
//          
//           Show that stack is empty.
//          String msg = stack.isEmpty() ? "Stack is empty." : "Stack is not empty.";
//          System.out.println(msg);
//		
//          System.out.println("Pushing 4 values into the stack...");
//        
//           Push values on to stack.
//          stack.push(5.0);
//          stack.push(6.5);
//          stack.push(-3.0);
//          stack.push(-8.0);
//      
//           Display stack contents.
//          stack.displayStack();
//     
//           Show top of stack.
//          System.out.println("Top: " + stack.peek());
//
//           Pop top value.
//          System.out.println("\nstack.pop() to remove the top value");
//          stack.pop();
//        
//           Show top of stack again.
//          System.out.println("The new Top is: " + stack.peek());
//		
//	
//          System.out.println("\nEmptying the whole stack...");
//           Empty stack.
//          while (!stack.isEmpty()) {
//              stack.pop();
//          }
//
//          System.out.println("Printing the new stack: ");
//           Demonstrate that stack is empty.
//          stack.displayStack();
          
          // Part B
          ArrayStack stackB = new ArrayStack(10);
          
          // Push values
          stackB.push(2);
          stackB.push(5);
          stackB.push(10);
          stackB.push(25);
          
          stackB.displayStack();
          
          stackB.pop();
          stackB.pop();
          stackB.pop();
          //Popping one more time would make the stack empty.
          //stackB.pop();
          
          if (stackB.isEmpty()){
              System.out.println("Stack B is empty");
          }
          else{
              System.out.println("Stack B is not empty");
          }
          
          System.out.println("The new top is: " + stackB.peek());
		
		
        }
}

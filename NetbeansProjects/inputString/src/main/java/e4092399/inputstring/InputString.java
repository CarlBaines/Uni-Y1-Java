/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.inputstring;

import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class InputString {

    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);
        
        //Take a string user input.
        
        //in.next() stops reading when the input when it reaches a whitespace character.
        System.out.println("Enter a name: ");
        String name = in.nextLine();
        
        //in.nextLine() reads the entire string regardless of whether there is whitespace.
        System.out.println("Enter a full name: ");
        String fullName = in.nextLine();
        
        
        //Output
        //print one name all in uppercase characters and the other name all in lowercase characters.
        String nameToUppercase = name.toUpperCase();
        String fullNameToLowercase = fullName.toLowerCase();
        System.out.println("The first name entered was " + nameToUppercase + " (converted to uppercase)");
        System.out.println("The second name entered was " + fullNameToLowercase + " (converted to lowercase)");
        
        
        //printing the names in order of length
        //get length of each name by using .length().
        int firstNameLength = name.length();
        
        int secondNameLength = fullName.length();
        
       
        
        //if conditions to check which name has the larger length.
        if (firstNameLength < secondNameLength){
            //output in order of length
            //shorter name is output first
            System.out.println("Shorter name: " + name + ", " + "Longer name: " + fullName);
        }
        
        else if (secondNameLength > firstNameLength){
            System.out.println("Longer name: " + fullName + ", " + "Shorter name: " + name);
        }
        
        //check to see if both names are the same length
        
        else if (firstNameLength == secondNameLength) {
            System.out.println("Both names are of the same length.");
        }
    }
}

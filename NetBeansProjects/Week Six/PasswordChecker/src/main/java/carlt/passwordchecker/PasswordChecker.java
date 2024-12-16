/*
 * Click nbfs:// nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.passwordchecker;
import java.util.Scanner;

/**
 *
 * @author Carlt
 */
public class PasswordChecker {
    
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        // User input
        System.out.println("Enter a password: ");
        
        String password = in.nextLine();
        
        
        // calls digit checker method.
        containsDigit(password);
        
        // calls lowercase letter checker method.
        containsLowercase(password);
        
        // calls uppercase letter checker method.
        containsUppercase(password);
        
        
    }
    
    // Method for checking if password contains at least one digit. The user-inputted password is taken as a parameter.
    public static int containsDigit(String password){
        
        int digitCount = 0;
        
        // loops through a character array of the user password.
        for (char c : password.toCharArray()){
            // if a char has digit, return true
            if (Character.isDigit(c)){
                // increment num count
                digitCount++;
            }
        }
        
        System.out.println("The password contained " + digitCount + " digits.");
        return digitCount;
    }
    
    // Method for checking if password contains at least one lowercase letter.
    public static int containsLowercase(String password){
        
        int lowercaseCount = 0;
        
        for (char c : password.toCharArray()){
            // if a character has a lowercase letter, return true
            if (Character.isLowerCase(c)){
                lowercaseCount++;
            }
        }
        
        System.out.println("The password contained " + lowercaseCount + " lowercase letters.");
        return lowercaseCount;
    }
    
    // Method for checking if password contains at least one uppercase letter.
    public static int containsUppercase(String password){
        
        int uppercaseCount = 0;
        
        for (char c: password.toCharArray()){
            if (Character.isUpperCase(c)){
                uppercaseCount++;
            }
        }
        
        System.out.println("The password contained " + uppercaseCount + " uppercase letters.");
        return uppercaseCount;
    }
    
    
}

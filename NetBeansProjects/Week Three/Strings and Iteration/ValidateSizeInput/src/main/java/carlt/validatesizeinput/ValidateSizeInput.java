/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package carlt.validatesizeinput;

import java.util.Scanner;

/**
 *
 * @author Carlt
 */
public class ValidateSizeInput {

    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);

        //Prompt user input. Appropriate inputs are Large, Small, L or S.
        System.out.println("Enter a size: ");

        /*Check to see if input is valid.
        Possible methods: */
        //Lowercase and uppercase versions should be accepted.
        //toLowerCase, toUpperCase
        //charAt to check "L" or "S".
        //could use equals() to compare pre-defined string to the user input object.
        //checks to see if the user input is equal to large or small (it is not case sensitive).

        boolean flag = true;

        while (flag) {
            
            //Scan in user input.
            String size = in.nextLine();
            
            boolean validInputOne = size.equalsIgnoreCase("Large");

            boolean validInputTwo = size.equalsIgnoreCase("Small");
            
            
            //for valid inputs, display size as Large, Small, L or S (no case sensitivity).
            if (validInputOne == true || validInputTwo == true) {
                flag = false;
                System.out.println("The size selected was: " + size);
            }
            
            else if ("L".equalsIgnoreCase(size) || "S".equalsIgnoreCase(size)){
                flag = false;
                if ("L".equalsIgnoreCase(size)){
                    System.out.println("The size selected was: Large. ");
                }
                else if ("S".equalsIgnoreCase(size)) {
                    System.out.println("The size selected was: Small. ");
                }
                
                else{
                    //Invalid - appropriate message
                    System.out.println("Please type a valid size ");
                    flag = true;
                }
            }
            
            else {
                //Invalid - appropriate message
                System.out.println("Please type a valid size ");
                flag = true;
            }
        }

    }
}

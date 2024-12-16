/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package carlt.staffnumber;

import java.util.Scanner;

/**
 *
 * @author Carlt
 */
public class StaffNumber {

    public static void main(String[] args) {

        //Check to see if the staff number starts with a letter and is followed by two digits.
        //use char.at to return the first character and validate it.
        //returns if the first character of the staff number begins with a number.
        boolean flag = true;

        while (flag) {

            //Scanner
            Scanner in = new Scanner(System.in);

            //User input prompt
            System.out.println("Enter a staff number: ");

            String staffNumber = in.nextLine();

            boolean isFirstCharDigit = Character.isDigit(staffNumber.charAt(0));
            
            
            //check if the staff number has a length of three
            if (staffNumber.length() != 3){
                System.out.println("");
                System.out.println("Invalid staff number entered - must be three characters long.");
                flag = true;
            }
            
           
            else if (isFirstCharDigit == false) {
                //perform more checks - staff number could be valid.
                //check if the staff number is followed by two digits (charAt method on index 1 and 2).
                boolean isTwoDigits = Character.isDigit(staffNumber.charAt(1)) && Character.isDigit(staffNumber.charAt(2));
                if (isTwoDigits) {
                    System.out.println("Valid staff number entered. ");
                    flag = false;
                } 
                else {
                    System.out.println("Invalid staff number entered. ");
                    flag = true;
                }

            }

    }

}
}

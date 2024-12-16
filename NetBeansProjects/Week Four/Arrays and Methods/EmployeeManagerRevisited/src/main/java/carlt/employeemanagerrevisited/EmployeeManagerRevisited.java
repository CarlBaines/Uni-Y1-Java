/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package carlt.employeemanagerrevisited;

import java.util.Scanner;

/**
 *
 * @author Carlt
 */
public class EmployeeManagerRevisited {

    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);

        //Set literal values (initial version of program)
        //double hoursWorked = 35;
        System.out.println("Enter your name: ");

        String employeeName = in.nextLine();

        System.out.println("Enter your staff number: ");

        String staffNumber = in.nextLine();

        //call method
        validateDetails(employeeName, staffNumber);

        System.out.println("Enter the hours worked: ");

        //Assign variables
        double hoursWorked = in.nextDouble();

        while (true) {
            //number of hours worked cannot be zero or below or over 100.
            if (hoursWorked <= 0 || hoursWorked > 100) {
                System.out.println("Error! Enter a valid number of hours worked: ");
                hoursWorked = in.nextDouble();
            } else {
                break;
            }
        }

        double hourlyRate = 9.75;

        double weeklyWage;

        if (hoursWorked > 40) {
            //pay staff an additional £4.75 for any hours above the basic 40 hour working week
            weeklyWage = (9.50 * hoursWorked + 4.50 * 5);
        } else {
            //weeklywage is calculated normally.
            weeklyWage = (hoursWorked * hourlyRate);
        }

        System.out.println("The weekly wage is " + weeklyWage);
    }

    public static String validateDetails(String employeeName, String staffNumber) {

        Scanner in = new Scanner(System.in);

        //Validate employee name - employee name cannot be empty.
        while (true) {
            if (employeeName.isEmpty()) {
                System.out.println("Error! Enter a valid employee name: ");
                employeeName = in.nextLine();
                return employeeName;
            }

            //Staff number must start with a letter and be followed by two digits.
            boolean firstCharDigit = Character.isDigit(staffNumber.charAt(0));
            boolean isTwoDigits = Character.isDigit(staffNumber.charAt(1)) && Character.isDigit(staffNumber.charAt(2));

            // Check if the staff number is valid.
            if (staffNumber.length() == 3 && Character.isLetter(staffNumber.charAt(0))
                    && Character.isDigit(staffNumber.charAt(1)) && Character.isDigit(staffNumber.charAt(2))) {
                System.out.println("Valid staff number entered!");
                return staffNumber;
            } 
            else {
                System.out.println("Error! Invalid staff number entered! Enter a valid staff number (Letter followed by 2 digits): ");
                staffNumber = in.nextLine();
            }

            return employeeName;
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.employeemanager;

import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class EmployeeManager {

    public static void main(String[] args) {
        
        //Scanner
        Scanner in = new Scanner(System.in);
       
        
        //Initial version of program (Calculate and display weekly wage)
        /*double hoursWorked = 35.0;
        
        double hourlyRate = 9.75;
        
        double weeklyWage = (hoursWorked * hourlyRate);
        
        System.out.println("The weekly wage without tax is " + weeklyWage); */
        
        //Updated version of the program which asks for a user input
        
        double hoursWorked = in.nextDouble();
        
        double hourlyRate = 9.75;
        
        double weeklyWage = (hoursWorked * hourlyRate);
         
        //Modified version of the program (staff are payed an additional £4.75 for any hours worked above the basic 40 hour working week.
        
        if (hoursWorked > 40.00) {
            weeklyWage = (hourlyRate * hoursWorked + 4.75 * 5);
        }
        
        System.out.println("The weekly wage without tax is " + weeklyWage);
        
        
        
        
        
        
      
        
        
        
        
        
    }
}

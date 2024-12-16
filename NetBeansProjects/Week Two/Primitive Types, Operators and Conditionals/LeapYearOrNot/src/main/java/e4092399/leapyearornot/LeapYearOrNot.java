/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.leapyearornot;

import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class LeapYearOrNot {

    public static void main(String[] args) {
        
        //Scanner
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a year: ");
        
        int year = in.nextInt();
        
        while(true){
            if (year <= 0 || year > 2024){
                System.out.println("Error! Enter a valid year: ");
                year = in.nextInt();
            }

            else{
                break;
            }
        }
        
        isLeapYear(year);
        
       
    }
    
    public static void isLeapYear(int year){
        
        //A leap year is determined by whether the year is divisible by 4. The if statement also accounts for the century years.
        if ((year % 4 == 0 && year % 100 != 0) && (year % 400 == 0)){
            System.out.println(year + " was a leap year");
        }
        
        else{
            System.out.println(year + " was not a leap year");
        }
    }
}

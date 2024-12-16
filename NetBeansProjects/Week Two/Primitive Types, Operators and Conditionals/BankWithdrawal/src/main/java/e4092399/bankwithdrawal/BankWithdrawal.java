/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.bankwithdrawal;

import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class BankWithdrawal {

    public static void main(String[] args) {
        
        //Scanner
        Scanner in = new Scanner(System.in);
        
        //Values
        double currentBalance = 40.00;
        
        double newBalance = 0;
        
        double overdraftLimit = 50.00;
        
        double withdrawalAmount = in.nextDouble();
        
        //Check to see if overdraft is exceeded (if exceeded add charge of £5).
        if (withdrawalAmount > overdraftLimit){
            newBalance = (currentBalance - withdrawalAmount - 5.00);
            System.out.println("Your new balance is " + newBalance + " using overdraft");
        }
        
        else{
            newBalance = (currentBalance - withdrawalAmount);
            System.out.println("Your new balance is " + newBalance);
        }
        
        
    }
}

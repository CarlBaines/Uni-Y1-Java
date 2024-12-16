/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.oddoreven;

import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class OddOrEven {

    public static void main(String[] args) {
        
        //scanner recieves user input and parse it into primitive data types.
        Scanner in = new Scanner(System.in);
        
        int userNumber = in.nextInt();
        
        //If condtion to decide whether the number is odd or even.
        
        if (userNumber % 2 == 0){
            System.out.println(userNumber + " is an even number");
        }
        
        else{
            System.out.println(userNumber + " is an odd number");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.oopcarclass;
import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class OOPCarClass {
    
    //global scanner
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        int menuChoice = 0;
        
        Car fiesta = new Car();
        
        menuChoice = getMenuChoice();
        
        switch (menuChoice){
            case 1 -> fiesta.start();
            case 2 -> fiesta.stop();
            case 3 -> fiesta.drive();
            case 4 -> fiesta.incrementSpeed();
            case 5 -> fiesta.decrementSpeed();
        }
                
                
                
    }
    
    public static int getMenuChoice(){
        
        //menu
        System.out.println("Enter a number to interact with the car:\n 1. Start the car\n 2. Stop the car\n 3. Drive the car\n 4. Increment speed\n 5. Decrement speed");
        
        int x = in.nextInt();
        while (x < 1 && x > 5){
            System.out.println("Enter a valid number for a menu choice");
            x = in.nextInt();
        }
        
        return x;
    }
    
}

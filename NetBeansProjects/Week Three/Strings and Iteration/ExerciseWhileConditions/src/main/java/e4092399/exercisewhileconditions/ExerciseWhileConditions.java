/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package e4092399.exercisewhileconditions;

import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class ExerciseWhileConditions {

    public static void main(String[] args) {

        //Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Input an exercise choice: 1, 2, 3 ");
        int choice = in.nextInt();

        //output 1, 6, 11, 16
        //count = count += 5 because the sequence goes up by five.
        switch (choice) {
            case 1 -> {
                int count = 1;
                while (count <= 16) {
                    System.out.println("Count is " + count);
                    count += 5;
                }

            }
            
            //output 27, 22, 17, 12
            case 2 -> {
                int count2 = 27;
                while (count2 >= 12) {
                    System.out.println("Count is " + count2);
                    count2 -= 5;
                }

            }
            
            //output 9, 8, 6, 5, 4, 3, 2
            case 3 -> {
                int count3 = 10;
                while (count3 > 2) {
                    
                    
                    
                    //BETTER WAY TO DO IT
                    /*
                    if (count3 == 7){
                        count3--;
                        continue;
                    }*/
                    
                    
                    
                    count3--;
                    if (count3 != 7) {

                        System.out.println("Count is " + count3);

                    }
                }

            }
            
            default -> {
                System.out.println("Invalid choice");
            }
        }
        
    }
}
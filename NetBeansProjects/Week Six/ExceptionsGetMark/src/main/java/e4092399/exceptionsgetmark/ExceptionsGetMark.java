/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.exceptionsgetmark;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author e4092399
 */
public class ExceptionsGetMark {
    
    //global scanner
    static Scanner in = new Scanner(System.in);
    
    //OLD CODE FROM EXCERCISES 1 AND 2 OF THE METHODS LAB WORKSHEET.
    public static void main(String[] args) {
        //Calls get value method and passes in the paramaters scanner input, min, max and prompt.
        int mark = getValue(in, 0, 100, "Please enter a mark between 0 - 100: ");
        //Calls grade calculator method
        getGrade(mark);
        System.out.println("The Mark is: " + mark);
    }

    public static int getMark() {
        
        while (true) {
            System.out.println("Enter a mark: ");
            int mark = in.nextInt();
            //Checks if mark is in the range of 0 and 100.
            if (mark >= 0 && mark <= 100) {
                return mark;
            }
            
            System.out.println("The mark is not valid! Please try again!");

        }

    }
    
    //mark is passed into the getGrade method.
    public static char getGrade(int mark){
        if (mark >= 70){
            //Grade A
            char grade = 'A';
            System.out.println("You got a Grade " + grade);
            return grade;
        }
        
        else if (mark >= 60 && mark <= 69){
            //Grade B
            char grade = 'B';
            System.out.println("You got a Grade " + grade);
            return grade;
        }
        
        else if (mark >= 50 && mark <= 59){
            //Grade C
            char grade = 'C';
            System.out.println("You got a Grade " + grade);
            return grade;
        }
        
        else if (mark >= 40 && mark <= 49){
            //Grade D
            char grade = 'D';
            System.out.println("You got a Grade " + grade);
            return grade;
        }
        
        else if (mark >= 0 && mark <= 39){
            //Grade F
            char grade = 'F';
            System.out.println("You got a Grade " + grade);
            return grade;
        }
        return 0;
        
        
    }
    
    //new method with error handling.
    public static int getValue(Scanner input, int min, int max, String prompt){
        
        while (true){
            try{
                System.out.println(prompt);
                int value = in.nextInt();
                
                //check if value is in the specified range, else throw an exception
                
                if (value < min || value > max){
                    throw new RuntimeException("Error! Input must be between " + min + " and " + max + ".");
                }
                return value;
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter an integer.");
                //clears invalid input
                in.next();
            }
            //if any other exceptions are caught the appropriate message for the exception caught is outputted.
            catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
}


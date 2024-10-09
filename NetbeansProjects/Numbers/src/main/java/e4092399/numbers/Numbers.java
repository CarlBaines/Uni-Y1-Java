/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.numbers;

/**
 *
 * @author e4092399
 */
public class Numbers {

    public static void main(String[] args) {
        
        int n = (int)3.9;
        System.out.print("n == " + n);
        
        double number = (5/7) * 7;
        System.out.println("5/7 * 7 is equal to " + number); //Output should be 35. Incorrect output as number = 0.
        
        //Formula to Java
        int x = 5;
        int y = 10;
        
        int equationResult;
        
        //3x + y
        equationResult = (3 * x) + y;
        System.out.println(equationResult);
        
        //x + y/7
        
        double a = 5.0;
        double b = 10.0;
        
        double equationResult2;
        
        equationResult2 = (a + b)/7.0;
        System.out.println(equationResult2); //Output will be 2 instead of 2.142857 when the value of a and b are integers.
        
        //3x + y/z + 2
        
        double c = 5;
        double d = 10;
        double e = 15;
        
        double equationResult3;
        
        equationResult3 = (3.0 * c + d)/e + 2.0;
        System.out.println(equationResult3);
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.trianglesize;
import java.util.Scanner;

/**
 *
 * @author Carlt
 */
public class TriangleSize {

    public static void main(String[] args) {
        
        //Scanner
        Scanner in = new Scanner(System.in);
        
        //Input a triangle size from the user.
        
        System.out.println("Enter triangle size: ");
        
        int triangleSize = in.nextInt();
        
        
        boolean flag = true;
        
        while (flag){
            if (triangleSize < 20){
                System.out.println("You entered " + triangleSize + " as the triangle size.");
                flag = false;
                break;
            }
            else{
                System.out.println("Input was invalid. Enter a valid triangle size.");
                System.out.println("Enter triangle size: ");
                triangleSize = in.nextInt();
            }
        }
        
    }
}

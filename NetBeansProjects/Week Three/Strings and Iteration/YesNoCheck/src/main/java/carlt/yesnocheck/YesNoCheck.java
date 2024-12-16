/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.yesnocheck;
import java.util.Scanner;

/**
 *
 * @author Carlt
 */
public class YesNoCheck {

    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);
        
        System.out.println("Are you sure you want to continue (Y/N)? ");
        
        //Inputs a response from the user.
        String response = in.nextLine();
        
        boolean flag = true;
        
        while (flag){
            if (response.equals("Y") || response.equals("N") || response.equals("Yes") || response.equals("No")){
                System.out.println("Your response was: " + response);
                flag = false;
                break;
            }
            else{
                System.out.println("Are you sure you want to continue (Y/N)? ");
                response = in.nextLine();
                flag = true;
            }
        }
    }
}

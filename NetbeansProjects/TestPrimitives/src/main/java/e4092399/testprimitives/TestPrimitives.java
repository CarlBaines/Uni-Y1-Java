/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.testprimitives;

/**
 *
 * @author e4092399
 */
public class TestPrimitives {

    public static void main(String[] args) {
        
        //Attempt to assign incorrect value to the variable's type. You can force the assignment by putting the variable type in brackets before the value.
        int numberOfSweets = (int) 41.5;
        
        
        boolean isPregnant = false;
        double itemPrice = 17.99;
        int weightInKilos = 77;
        
        /*My own values*/
        
        boolean isStudying = true;
        char plus = '+';
        double ticketPrice = 32.50;
        
        System.out.println(numberOfSweets);
        System.out.println(isPregnant);
        System.out.println(itemPrice);
        System.out.println(weightInKilos);
        System.out.println(isStudying);
        System.out.println(plus);
        System.out.println(ticketPrice);
        
        
        
        //Second part
        int first = 17;
        int second = first;
        
        char badGrade = 'D';
        
        //Second attempt of assigning incorrect value to the variable's type. Impossible to set studentGrade to true.
        char studentGrade = badGrade;
        
        
        System.out.println(second);
        System.out.println(studentGrade);
        
        
    }
}

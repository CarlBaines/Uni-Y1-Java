/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.hellodialog;

import javax.swing.JOptionPane;

/**
 *
 * @author e4092399
 */
public class HelloDialog {

    public static void main(String[] args) {
        
        //Option Panes
        
        JOptionPane.showMessageDialog(null, "Applications Development is awesome! ");
        //custom title with warning icon
        JOptionPane.showMessageDialog(null, "This dialog says something has gone wrong! ", "An Error Message", JOptionPane.ERROR_MESSAGE);
        //Custom title, no icon
        JOptionPane.showMessageDialog(null, "This dialog is a little plain message " + JOptionPane.PLAIN_MESSAGE);
       
        
        
        /*
        
        int answer = JOptionPane.showConfirmDialog(null, "Can you see this dialog?", "My Dialog Window", JOptionPane.OK_CANCEL_OPTION);
        
        if(answer == JOptionPane.OK_OPTION){
            System.out.println("Excellent");
        }
        else{
            System.out.println("Oh Dear!");
        }
        
        /*
        
        //SONIC THE HEDGEHOG
        /*
        Object[] move = 
        {
            "Up", "Down", "Left", "Right", "Start", "Quit"
        };
        
        int option = 0;
        do{
            option = JOptionPane.showOptionDialog(null,
                    "Anyone play Sonic the Hedgehog?",
                    "Cheat",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    move, //Sets the options from Object[] move.
                    move[0]); //Sets a default.
            
            System.out.printf("Option you selected %d\n", option);
        }
        while (option != 6);
        */
        
        String input = JOptionPane.showInputDialog(null, "Enter size: ");
        
        System.out.printf("You put %s\n", input);
        
        try{
            int num = Integer.parseInt(input);
            System.out.printf("Successfully cast to an int: %d\n", num);
        }
        catch(Exception e){
            System.out.println("Did not enter a number!");
        }    
        
        
    }
}

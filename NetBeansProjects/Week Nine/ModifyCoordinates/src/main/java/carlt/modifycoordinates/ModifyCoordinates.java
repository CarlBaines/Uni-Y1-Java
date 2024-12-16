/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.modifycoordinates;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlt
 */
public class ModifyCoordinates {
    

    public static void main(String[] args) {
        
        int x = 100; //left
        int y = 50; //top
        
        Object[] adjustCoordinates =  {"Up", "Down", "Up 10", "Down 10", "Left", "Right", "Left 10", "Right 10", "Finish"};      
        
        boolean showOptionPane = true;
        
        //Only runs menu method and switch case statement when the X and Y coordinates are above or equal to zero. 
        while(showOptionPane && x >= 0 && y >= 0){
            int choice = menu(x, y, adjustCoordinates);
            
            //Update coordinates based on choice
            switch(choice){
                case 0:
                    //Up
                    y += 1;
                    break;
                case 1:
                    //Down
                    y -= 1;
                    break;
                case 2:
                    //Up 10
                    y += 10;
                    break;
                case 3:
                    //Down 10
                    y -= 10;
                    break;
                case 4:
                    //Left
                    x -= 1;
                    break;
                case 5:
                    //Right
                    x += 1;
                    break;
                case 6:
                    //Left 10
                    x -= 10;
                    break;
                case 7:
                    //Right 10
                    x += 10;
                    break;
                case 8:
                    showOptionPane = false;
                    break;
                default:
                    showOptionPane = false;
            }
        }
        
        System.out.println("The X or Y coordinate has went under zero!");
        System.exit(0);
        
        
    }
    
    public static int menu(int x, int y, Object[] adjustCoordinates){
        
        JFrame newFrame = new JFrame();
        
        
        return JOptionPane.showOptionDialog(
                newFrame,
                "The current coordinates are: " + x + "," + y,
                "Coordinate Adjustment",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                adjustCoordinates,
                adjustCoordinates[0]
            );
        }
        
        
    }


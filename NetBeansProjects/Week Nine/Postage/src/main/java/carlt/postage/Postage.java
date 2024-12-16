/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.postage;

import java.awt.Frame;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlt
 */
public class Postage {

    public static void main(String[] args) {
        
        JFrame newFrame = new JFrame();
        JLabel newLabel = new JLabel();
        
        
        Object[] possibilities = {"First Class", "Second Class", "Recorded", "Registered"};
        
        String postageType = (String) JOptionPane.showInputDialog(
                newFrame,
                "Select postage type:",
                "Postage",
                JOptionPane.QUESTION_MESSAGE,
                null,
                possibilities,
                "First Class"
        );

        if (postageType != null && !postageType.isEmpty()){
            newLabel.setText("The postage type: " + postageType + " was entered.");
        }
        else{
            newLabel.setText("No postage type was selected.");
        }
        
        newLabel.setHorizontalAlignment(JLabel.CENTER);
        
        newFrame.add(newLabel);
        newFrame.setSize(300, 300);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setVisible(true);
        
        
        
        
    }
}

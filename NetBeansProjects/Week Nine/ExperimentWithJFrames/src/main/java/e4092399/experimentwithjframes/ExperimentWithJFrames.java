/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.experimentwithjframes;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author e4092399
 */
public class ExperimentWithJFrames {

    public static void main(String[] args) {
        
        JFrame newFrame = new JFrame();
        JPanel newPanel = new JPanel();
        
        //Frame
        newFrame.setTitle("Messing Around with JFrames");
        newFrame.setSize(500,500);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Window cannot be resized.
        newFrame.setResizable(false);
        
        newFrame.setVisible(true);
        
        
        //Panel
        newPanel.setSize(300,300);
        newPanel.setBackground(Color.red);
        
        newFrame.add(newPanel);
        
        //Window does not appear.
        //newFrame.pack();
        
    }
    
      
    
   
}

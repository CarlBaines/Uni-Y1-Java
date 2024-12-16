/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.jbuttoncount;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author E4092399
 */
public class JButtonCount {

    public static void main(String[] args) {
        JFrame newFrame = new JFrame();
        CountButtonPanel newCountButtonPanel = new CountButtonPanel();
        
        newFrame.add(newCountButtonPanel);
        
        newFrame.setSize(300,300);
        newFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        newFrame.setVisible(true);
        
    }
}

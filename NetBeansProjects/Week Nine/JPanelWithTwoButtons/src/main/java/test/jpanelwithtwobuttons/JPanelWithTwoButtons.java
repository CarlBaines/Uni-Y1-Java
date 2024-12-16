/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.jpanelwithtwobuttons;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author E4092399
 */
public class JPanelWithTwoButtons {

    public static void main(String[] args) {
        LightPanel newLightPanel = new LightPanel();
        
        JFrame newFrame = new JFrame();
        
        newFrame.add(new LightPanel());
        
        
        newFrame.setSize(300,300);
        newFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        newFrame.setVisible(true);
    }
}

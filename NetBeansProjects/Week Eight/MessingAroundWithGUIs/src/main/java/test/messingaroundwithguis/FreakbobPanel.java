/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.messingaroundwithguis;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Carlt
 */
public class FreakbobPanel extends JPanel {

    public FreakbobPanel() {
        //Panel properties
        setBackground(Color.DARK_GRAY);
        
        //Add components to the panel
        JButton button = createFreakyButton();
        add(button);
    }
    
    private JButton createFreakyButton(){
        JButton button = new JButton("Click this to get freaky");
        button.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        return button;
    }

}

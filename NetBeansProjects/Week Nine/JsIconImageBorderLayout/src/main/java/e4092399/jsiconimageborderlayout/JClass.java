/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.jsiconimageborderlayout;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author e4092399
 */
public class JClass extends JFrame{
    
    public JClass(){
        super();
        JFrame newFrame = new JFrame("My Frame Example");

        ImageIcon image = new ImageIcon("src/image.jpeg");
        
        newFrame.setLayout(new BorderLayout());
        
        //Components
        JLabel imageLabel = new JLabel(image);
        newFrame.add(imageLabel, BorderLayout.CENTER);
        
        JLabel textLabel = new JLabel("Freakbob");
        newFrame.add(textLabel, BorderLayout.NORTH);
        
        JButton newButton = new JButton("Click me");
        newFrame.add(newButton, BorderLayout.SOUTH);
        
        JCheckBox CheckBox1 = new JCheckBox("Freaky");
        newFrame.add(CheckBox1, BorderLayout.EAST);
        
        JCheckBox CheckBox2 = new JCheckBox("No Freaky");
        newFrame.add(CheckBox2, BorderLayout.WEST);
        
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setSize(650,650);
        //newJClass.pack();
        newFrame.setVisible(true);
    }    
}

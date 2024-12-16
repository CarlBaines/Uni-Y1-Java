/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.flags;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author e4092399
 */
public class BoliviaFlag extends JFrame {
    
    
    public BoliviaFlag(){
        super();
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        
        
        //Bolivia Flag - i dont think it is :)
        JLabel bol1 = new JLabel();
        bol1.setPreferredSize(new Dimension(100, 300));
        bol1.setOpaque(true);
        bol1.setBackground(new Color(15, 148, 82));
        
        JLabel bol2 = new JLabel();
        bol2.setPreferredSize(new Dimension(100, 300));
        bol2.setOpaque(true);
        bol2.setBackground(new Color(255, 238, 8));
        
        JLabel bol3 = new JLabel();
        bol3.setPreferredSize(new Dimension(100, 300));
        bol3.setOpaque(true);
        bol3.setBackground(new Color(222, 17, 24));
        
        add(bol1, FlowLayout.LEFT);
        add(bol2, FlowLayout.CENTER);
        add(bol3, FlowLayout.RIGHT);
        
        setSize(350, 300);
        pack();
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

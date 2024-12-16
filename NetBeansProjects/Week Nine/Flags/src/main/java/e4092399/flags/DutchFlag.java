/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.flags;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author e4092399
 */
public class DutchFlag extends JFrame {
    
    //Constructor
    public DutchFlag(){
        super();
        setLayout(new BorderLayout());
        
        //Dutch Flag
        JLabel dutch1 = new JLabel();
        dutch1.setPreferredSize(new Dimension(300, 100));
        dutch1.setOpaque(true);
        dutch1.setBackground(new Color(246, 13, 11));
        
        JLabel dutch2 = new JLabel();
        dutch2.setPreferredSize(new Dimension(300, 100));
        dutch2.setOpaque(true);
        dutch2.setBackground(Color.WHITE);
        
        JLabel dutch3 = new JLabel();
        dutch3.setPreferredSize(new Dimension(300, 100));
        dutch3.setOpaque(true);
        dutch3.setBackground(new Color(25, 10, 124));
        
        add(dutch1, BorderLayout.NORTH);
        add(dutch2, BorderLayout.CENTER);
        add(dutch3, BorderLayout.SOUTH);
        
        
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }   
}

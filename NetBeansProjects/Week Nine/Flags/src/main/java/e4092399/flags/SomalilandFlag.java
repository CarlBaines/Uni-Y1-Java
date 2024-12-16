/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.flags;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author e4092399
 */
public class SomalilandFlag extends JFrame{
    public SomalilandFlag(){
        super();
        
        setLayout(new BorderLayout());
        
        ImageIcon imgOne = new ImageIcon("src/IMAGES/image1.gif");
        ImageIcon imgTwo = new ImageIcon("src/IMAGES/image2.gif");
        
        OverlayLabel starImage = new OverlayLabel(imgOne);
        OverlayLabel writingImage = new OverlayLabel(imgTwo);
        
        
        JLabel soma1 = new JLabel();
        soma1.setPreferredSize(new Dimension(300, 100));
        soma1.setOpaque(true);
        soma1.setBackground(new Color(8, 123, 56));
        
        JLabel soma2 = new JLabel();
        soma2.setPreferredSize(new Dimension(150, 50));
        soma2.setOpaque(true);
        soma2.setBackground(Color.WHITE);
        
        JLabel soma3 = new JLabel();
        soma3.setPreferredSize(new Dimension(300, 100));
        soma3.setOpaque(true);
        soma3.setBackground(new Color(222, 17, 24));
        
        //Components
        add(soma1, BorderLayout.NORTH);
        add(soma2, BorderLayout.CENTER);
        add(soma3, BorderLayout.SOUTH);
        
        JPanel centerPanel = new JPanel();
        centerPanel.add(starImage, BorderLayout.CENTER);
        centerPanel.add(writingImage, BorderLayout.NORTH);
        
        add(centerPanel, BorderLayout.CENTER);
        
        setSize(300, 325);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

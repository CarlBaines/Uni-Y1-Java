/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.jpanelwithtwobuttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author E4092399
 */
public class LightPanel extends JPanel implements ActionListener {
    
    //properties
    private JLabel lightLabel;
    private JButton onButton;
    private JButton offButton;
    private ImageIcon lightOffIcon;
    private ImageIcon lightOnIcon;
    
    //Constructor
    public LightPanel(){
        onButton = new JButton("On");
        offButton = new JButton("Off");
        
        lightOffIcon = new ImageIcon("src/light_images/light_off.png");
        lightOnIcon = new ImageIcon("src/light_images/light_on.png");
        
        
        //JLabel with light off image initially.
        lightLabel = new JLabel(lightOffIcon); 
        //set preferred size of newLabel to 100x100 and change background colour.
        lightLabel.setPreferredSize(new Dimension(100,100));
        setOpaque(true);
        setBackground(Color.LIGHT_GRAY);
        
        //Event listeners
        onButton.addActionListener(this);
        offButton.addActionListener(this);
        
        //add components.
        add(lightLabel);
        add(onButton);
        add(offButton);
        
                
                
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Update the light image based on the button click
        if (e.getActionCommand().equals("On")){
            lightLabel.setIcon(lightOnIcon);
            setBackground(Color.YELLOW);
            updateUI();
        }
        else if(e.getActionCommand().equals("Off")){
            lightLabel.setIcon(lightOffIcon);
            setBackground(Color.LIGHT_GRAY);
            updateUI();
        }
    }
    
}

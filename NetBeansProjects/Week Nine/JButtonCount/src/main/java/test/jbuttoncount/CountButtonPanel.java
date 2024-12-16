/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.jbuttoncount;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author E4092399
 */
public class CountButtonPanel extends JPanel implements ActionListener {
    
    //properties
    private JLabel newLabel;
    private int buttonPushes = 0;
    
    //constructor
    public CountButtonPanel() {
        newLabel = new JLabel("Button pushes: 0");
        JButton newButton = new JButton("Click the button");
        
        newButton.addActionListener(this);
        
        newLabel.setOpaque(true);
        newButton.setOpaque(true);
        add(newLabel);
        add(newButton);
        
        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        buttonPushes += 1;
        newLabel.setText("Button pushes: " + buttonPushes);
        updateUI();
        
        
    }

}

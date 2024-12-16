/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.buttonpanelpractice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author E4092399
 */
public class HelloButtonPanel extends JPanel implements ActionListener{
    
    //properties
    private JLabel newLabel;
    private boolean isHello = false;
    
    //Constructor
    public HelloButtonPanel() {
        
        JButton newButton = new JButton("Come and go");
        newLabel = new JLabel("Hello");
        
        //Assigns action listener to button
        newButton.addActionListener(this);
        
        newLabel.setOpaque(true);
        newLabel.setBackground(Color.YELLOW);
        
        
        add(newLabel);
        add(newButton);
        
        setSize(300, 300);
        setVisible(true);
        
        //sets isHello to true as hello will be displayed on the gui initially.
        isHello = true;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(isHello){
           //isHello is set to false globally. So text turns to goodbye when the button is clicked.
           newLabel.setText("Goodbye");
           newLabel.setBackground(Color.GREEN);
        } 
        else{
            newLabel.setText("Hello");
            newLabel.setBackground(Color.YELLOW);
        }
        
        //Flips the value of isHello from its value after the event.
        isHello = !isHello;
        
        
        
    }

    
    
    
    

    

}

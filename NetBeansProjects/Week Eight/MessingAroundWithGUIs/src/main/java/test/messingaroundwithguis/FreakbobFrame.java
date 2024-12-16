/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.messingaroundwithguis;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Carlt
 */
public class FreakbobFrame extends JFrame {
    
    //Constructor
    public FreakbobFrame(){
        //Frame properties. REMOVES THE NEED FOR JFRAME. ... (due to the inheritance of the JFrame Class).
        //Sets size of the window.
        setSize(300, 400);
        //Exits on close.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Title of window.
        setTitle("Freakbob");
        //two methods - the first returns the ContentPane object of the container. The content pane is then set to the background colour black.
        getContentPane().setBackground(Color.BLACK);
       
        
        //add content to the frame
        
        //Flow layout arranges components in a directional flow.
        setLayout(new FlowLayout());
        
        //The return value of the createImageLabel method is added to the frame.
        add(createImageLabel());
        
        //A new instance of the FreakbobPanel class is added to the frame.
        add(new FreakbobPanel());
    }
    
    private JLabel createImageLabel(){
        //Image and filename.
        ImageIcon img = new ImageIcon("Freakbob.jpeg");
        
        //Resizes image by returning it and making use of the getScaledInstance method from Java's Image class.
        Image resizedImage = img.getImage().getScaledInstance(300,300, Image.SCALE_DEFAULT);
        
        //Creates a new instance of the ImageIcon class which takes the resizedImage as a parameter.
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        //the resized image is returned/
        return new JLabel(resizedImageIcon);
    }
    
}

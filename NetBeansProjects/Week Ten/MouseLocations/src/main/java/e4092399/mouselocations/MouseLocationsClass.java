/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.mouselocations;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author e4092399
 */
public class MouseLocationsClass extends JFrame implements MouseListener{
    
    private JFrame newFrame;
    private JPanel newPanel;
    private JLabel mouseClickLocationLabel;
    private JLabel mouseDragLabel;
    private int mouseLocation;
    
    private int dragDistance;
    private int firstX;
    private int firstY;
    private int secondX;
    private int secondY;
    
    private Point startingPoint;
    private Point endPoint;
    
    
    //constructor
    public MouseLocationsClass(){
        
        super();
        
        newFrame = new JFrame();
        
        newPanel = new JPanel();
        mouseClickLocationLabel = new JLabel("Click on the screen to display mouse click location");
        mouseDragLabel = new JLabel("Drag the mouse to calculate drag distance");
        
        
        
        mouseClickLocationLabel.setBackground(Color.BLACK);
        mouseClickLocationLabel.setForeground(Color.WHITE);
        mouseClickLocationLabel.setOpaque(true);
        mouseClickLocationLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        mouseClickLocationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mouseClickLocationLabel.setPreferredSize(new Dimension(500, 50));
        
        mouseClickLocationLabel.addMouseListener(this);
        
        mouseDragLabel.setBackground(Color.BLACK);
        mouseDragLabel.setForeground(Color.WHITE);
        mouseDragLabel.setOpaque(true);
        mouseDragLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        mouseDragLabel.setHorizontalAlignment(SwingConstants.CENTER);
      
        newPanel.add(mouseClickLocationLabel);
        newPanel.add(mouseDragLabel);
        newPanel.setBackground(Color.BLACK);
        
        newPanel.addMouseListener(this);
        
        add(newPanel);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    
    
    

    @Override
    public void mouseClicked(MouseEvent me) {
        //output to console
        //System.out.println(me.getPoint());
        
        //output location of mouse click
        //mouseLocation = JOptionPane.showConfirmDialog(null, me.getPoint(), "Mouse Location", OK_CANCEL_OPTION, PLAIN_MESSAGE, null);
        
        //output location of mouse click to the JLabel.
        mouseClickLocationLabel.setText("" + me.getPoint());
    }
    

    @Override
    public void mousePressed(MouseEvent me) {
        startingPoint = me.getPoint();
        firstX = startingPoint.x;
        firstY = startingPoint.y;
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        endPoint = me.getPoint();
        secondX = endPoint.x;
        secondY = endPoint.y;
        
        int distanceX = (firstX - secondX) * (firstX - secondX);
        int distanceY = (firstY - secondY) * (firstY - secondY);
        
        double totalDistance = Math.sqrt(distanceX + distanceY);
        mouseDragLabel.setText("" + totalDistance); 
        
        
        
        
        
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
}

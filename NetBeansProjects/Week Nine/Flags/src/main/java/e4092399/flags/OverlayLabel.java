/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.flags;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author E4092399
 */
public class OverlayLabel extends JLabel {
    private ImageIcon overlayImage;
    
    //Constructor
    public OverlayLabel(ImageIcon overlayImage){
        this.overlayImage = overlayImage;
        setPreferredSize(new Dimension(600,200));
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //Check if overlay image is set
        if (overlayImage != null){
            int x = (getWidth() - overlayImage.getIconWidth() / 2);
            int y = (getHeight() - overlayImage.getIconHeight() / 2);
            overlayImage.paintIcon(this, g, x, y);
        }
    }
}

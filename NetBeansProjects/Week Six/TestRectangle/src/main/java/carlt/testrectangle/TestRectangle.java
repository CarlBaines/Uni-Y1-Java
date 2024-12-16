/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.testrectangle;

/**
 *
 * @author Carlt
 */
public class TestRectangle {

    public static void main(String[] args) {
        //new instance of the rectangle class with 10.0 as the length and 15.0 as the width.
        Rectangle r = new Rectangle(10.0, 15.0);
        
        
        //OUTPUTS
        System.out.println("Length: " + r.getLength());
        
        System.out.println("Width: " + r.getWidth());
        
        System.out.println("The area of the rectangle is: " + r.computeArea());
        
        System.out.println("The perimeter of the rectangle is: " + r.computePerimeter());
    }
}

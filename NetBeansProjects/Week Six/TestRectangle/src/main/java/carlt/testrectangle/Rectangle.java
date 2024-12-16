/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlt.testrectangle;

/**
 *
 * @author Carlt
 */
public class Rectangle {
    
    //properties
    private double length;
    private double width;
    private double perimeter;
    private double area;
    
    //Constructor to set default values for length and width.
    
    public Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
    }
    
    //Constructor that takes parameters
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    //Methods
    
    //GETTER METHODS
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    
    //CALCULATION METHODS
    public double computeArea(){
        area = (length * width);
        return area;
    }
    
    public double computePerimeter(){
        perimeter = (length * 2) + (width * 2);
        return perimeter;
    }
}

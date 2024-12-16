/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlt.testcar;

/**
 *
 * @author Carlt
 */
public class Car {
        
    //properties
    private int topSpeed;
    private char taxBand;
    private boolean turbo = false;
    
    //Constructor which sets default values
    public Car(){
        this(0, 'A', false); //set default values
    }
    
    
    //Constructors with three parameters
    public Car(int topSpeed, char taxBand, boolean turbo){
        this.topSpeed = topSpeed;
        this.taxBand = taxBand;
        this.turbo = turbo;
    }
    
    //Methods for returning (GET METHODS)
    
    public int getTopSpeed(){
        return topSpeed;
    }
    
    public char getTaxBand(){
        return taxBand;
    }
    
    public boolean getTurbo(){
        return turbo;
    }
    
}

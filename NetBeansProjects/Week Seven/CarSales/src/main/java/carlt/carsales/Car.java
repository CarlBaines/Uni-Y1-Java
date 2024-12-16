/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlt.carsales;

/**
 *
 * @author Carlt
 */
public class Car {
    
    //Properties
    private String make;
    private String model;
    private String reg;
    private int value;

    public Car(String make, String model, String reg, int value) {
        this.make = make;
        this.model = model;
        this.reg = reg;
        this.value = value;
    }
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getReg(){
        return reg;
    }
    
    public int getValue(){
        return value;
    }
    
    @Override
    public String toString(){
        String result = String.format("Car{%s}{%s}{%s}{%s}", make, model, reg, value);
        return result;        
    }
    
    
    
    
    
    
}

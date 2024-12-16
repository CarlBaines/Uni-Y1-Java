/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.lamp;

/**
 *
 * @author e4092399
 */
public class TestLamp {
    //Properties
    private boolean state;
    
    //Constructor
    public TestLamp(){
        this.state = false;
    }
    
    //Methods
    public void switchOn(){
        this.state = true;
    }
    
    public void switchOff(){
        this.state = false;
    }
    
    public boolean isState(){
        return state;
    }
}

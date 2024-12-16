/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.testlift;

/**
 *
 * @author e4092399
 */
public class Lift {
    
    //Properties
    private int currentFloor;
    private boolean doorsOpen = false;
    
    private int topFloor;
    
    
    
    //Constructors
    public Lift(){
        this(0);
    }
    
    public Lift(int currentFloor){
        this(currentFloor, 10);
    }
    
    public Lift(int currentFloor, int topFloor){
        this.currentFloor = currentFloor;
        this.topFloor = topFloor;
    }
    
    
    
    
    
    //Methods
    public int getCurrentFloor(){
        return currentFloor;
    }
    
    public boolean isDoorsOpen(){
        return doorsOpen;
    }
    
    public void toggleDoors(){
        doorsOpen = !doorsOpen;
    }
    
    public void setCurrentFloor(int cf){
        currentFloor = cf;
    }
    
    
    
    
    
    public void goUp(){
        if(currentFloor < topFloor){
            if (!doorsOpen){
                currentFloor++;
            }
            else{
                System.out.println("Error lift doors not closed");
            }
        }
        else{
            System.out.println("Error already at top floor");
        }
    }

   
    
}

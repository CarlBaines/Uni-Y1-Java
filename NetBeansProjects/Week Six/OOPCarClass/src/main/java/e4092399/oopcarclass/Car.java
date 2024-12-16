/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.oopcarclass;

/**
 *
 * @author e4092399
 */
public class Car {
   
    
    //private attributes
    private boolean isStarted = false;
    private int speed = 0;
    private double fuel = 1.0;
    private double fuelDecreaser;
    
   
    
     
    
    public void start(){
        if (!isStarted){
            isStarted = true;
            System.out.println("Car has been started\n");
               
        }
        else{
            isStarted = false;
            System.out.println("Car has not been started yet\n");
            
        }
    }
    
    
    public void stop(){
        
        //attempts to stop a car when it is already stopped are ignored
        //method can't be stopped when the car speed is not zero.
        while (speed == 0){
            
            if (isStarted){
                System.out.println("Car has been stopped!\n");
                break;
            }
        
        }
        
    }
    
    public void drive(){
        //Does nothing when the car is stationary or stopped.
        //The faster the car is going, the more the fuel decreases.
        
        //car would be started at function call
        while (isStarted){
            //car is started
            if (fuel != 0){
                fuelDecreaser = (fuel * speed * 0.1);
        
                fuel = (fuel - fuelDecreaser);

                System.out.println("----------------------------------");
                System.out.println("Fuel has decreased to " + fuel);
                System.out.println("----------------------------------");
                
                break;
            }
            else{
                isStarted = false;
                System.out.println("Car has been stopped! There is no fuel left! \n");
                break;
            }
        }
        
        
        
        
    }
    
    public void incrementSpeed(){
        //only increments the speed when the car has been started.
        if (isStarted){
            speed++;
            System.out.println("Car speed is " + speed +"\n");
        }
        
        else{
            System.out.println("Car has not been started yet\n");
        }
        
       
    }
    
    public void decrementSpeed(){
        //reduce the speed in steps of 1.
        
        //while loop prevents erraneous values
        while (speed > 0){
            if(isStarted){
                speed--;
                System.out.println("Car speed is " + speed + "\n");
        }
            
        else{
            System.out.println("Car has not been started yet\n");
        }
            
        }
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.testlift;

/**
 *
 * @author e4092399
 */
public class TestLift {

    public static void main(String[] args) {
        Lift elevator = new Lift();
        
        //Second object
        Lift glassElevator = new Lift(4);
        
        //open the doors
        elevator.toggleDoors();
        
        elevator.goUp();
        
        elevator.toggleDoors();
        
        elevator.goUp();
        
        elevator.goUp();
        
        System.out.println("The current floor is " + elevator.getCurrentFloor());
        
        System.out.println("The current floor is " + glassElevator.getCurrentFloor());
    }
}

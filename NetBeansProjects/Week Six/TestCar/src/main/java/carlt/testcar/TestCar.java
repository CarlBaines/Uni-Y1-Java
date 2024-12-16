/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.testcar;

/**
 *
 * @author Carlt
 */
public class TestCar {

    public static void main(String[] args) {
        
        //new instances/objects of the car class
        Car c1 = new Car(121, 'C', false);
        Car c2 = new Car(178, 'E', true);
        Car c3 = new Car(62, 'A', false);
        
        //calls method taking car name (instance name) as parameter.
        printCarDetails("c1", c1);
        printCarDetails("c2", c2);
        printCarDetails("c3", c3);
    }
    
    
    public static void printCarDetails(String carName, Car car){
        
        //GET METHODS USED FOR OUTPUT.
        System.out.println("Car name: " + carName);
        System.out.println("Top Speed: " + car.getTopSpeed() + "mph");
        System.out.println("Tax Band: " + car.getTaxBand());
        System.out.println("Turbo?: " + car.getTurbo());
        System.out.println();
    }
}

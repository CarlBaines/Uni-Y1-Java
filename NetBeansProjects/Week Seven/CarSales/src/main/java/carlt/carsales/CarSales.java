/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlt.carsales;
import java.util.ArrayList;

/**
 *
 * @author Carlt
 */
public class CarSales {
    private ArrayList<Car> cars;
    
    public CarSales(){
        cars = new ArrayList<>();
    }
    
    public void addCar(String make, String model, String reg, int value){
        Car car = new Car(make, model, reg, value);
        cars.add(car);
    }
    
    public void removeCar(String reg){
        //Remove a car by iterating througn the car list to
        //find a matching registration, then removing.
        //Note that an ArrayList is NOT the best collection to be
        //using if we intend to do this sort of operation often.
        
        for (int index = 0; index < cars.size(); index++){
            Car car = cars.get(index);
            if (reg.equals(cars.get(index).getReg())){
                cars.remove(index);
            }
            break;
        }
        
    }
    
    public void clearCars(){
        //Tax man is onto us, empty the inventory!
        cars.clear();
    }
    
    public int totalValue(){
        int sum = 0;
        //Iterate through all cars summing the value.
        for (int index = 0; index < cars.size(); index++){
            sum += cars.get(index).getValue();
        }
        
        return sum;
    }
    
    @Override
    public String toString(){
        //return "CarSales{" + "cars=" + cars + '}';
        String result = String.format("CarSales{%s}", cars);
        return result;
    }

}

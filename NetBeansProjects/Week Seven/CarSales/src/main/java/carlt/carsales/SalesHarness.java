/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlt.carsales;

import java.util.Scanner;

/**
 *
 * @author Carlt
 */
public class SalesHarness {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        //creates a new instance of the CarSales class.
        CarSales sales = new CarSales();
        
        //accesses add car method
        sales.addCar("Ford", "Focus", "NU70 YBX", 20000);
        sales.addCar("Nissan", "Micra", "YP53 HZZ", 1100);
        
        //Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Menu System
        System.out.println("SALES RECORD MENU SYSTEM");
        System.out.println("1. List all existing sales");
        System.out.println("2. Add Sale");
        System.out.println("3. Remove sale");
        System.out.println("4. Print total value");
        System.out.println("5. Remove all");
        System.out.print("Choose an option: ");
        
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline after nextInt()

        switch (choice) {
            case 1 ->
                //Lists all existing sales
                System.out.println(sales.toString());

            case 2 -> {
                
                //Adds a sale by taking user inputs 
                System.out.print("Enter a make: ");
                String make = scanner.nextLine(); 

                System.out.print("Enter a model: ");
                String model = scanner.nextLine(); 

                System.out.print("Enter a registration number: ");
                String reg = scanner.nextLine(); 

                System.out.print("Enter the sale value: ");
                int value = scanner.nextInt();
                scanner.nextLine(); 
                
                //uses addCar method.
                sales.addCar(make, model, reg, value);
                System.out.println("Car added successfully.");
                
                //prints new sales ArrayList.
                System.out.println(sales.toString());
            }

            case 3 -> {
                
                //Removes sale by taking REG from user.
                System.out.print("Enter the registration number to remove: ");
                String regToRemove = scanner.nextLine();
                
                //calls removeCar method.
                sales.removeCar(regToRemove);
                System.out.println("Car removed successfully.");
                
                //prints new sales ArrayList.
                System.out.println(sales.toString());
            }

            case 4 ->
                //total value of all cars is calculated by calling the totalValue method.
                System.out.println("Total value of all cars: " + sales.totalValue());

            case 5 -> {
                //All sales are cleared by calling the clearCars method.
                sales.clearCars();
                System.out.println("All cars removed.");
            }

            default ->
                System.out.println("Invalid option. Please choose again.");
        }

    }

}

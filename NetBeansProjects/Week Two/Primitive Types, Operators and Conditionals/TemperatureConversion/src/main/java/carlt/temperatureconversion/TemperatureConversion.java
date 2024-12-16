/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.temperatureconversion;

import java.util.Scanner;

/**
 *
 * @author Carlt
 */
public class TemperatureConversion {

    public static void main(String[] args) {
        //Take user input for which conversion they want to complete.
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a conversion type: Type 1 for Fahrenheit to Celcius or Type 2 for Celcius to Fahrenheit");
        
        int conversionType = in.nextInt();
        
        if (conversionType == 1){
            
            //takes a fahrenheit temperature from the user.
            System.out.println("Please enter a fahrenheit temperature to convert to celcius: ");
            
            //Fahrenheit to Celcius
            double FahrenheitValue = in.nextDouble();
            
            //fahrenheit to celcius conversion
            double fahrenheitToCelcius = (FahrenheitValue - 32) * 5 / 9;
            
            //output
            System.out.println(FahrenheitValue + "F to celcius = " + fahrenheitToCelcius + "C");
            
        }
        
        else if (conversionType == 2){
            
            //takes a celcius reading from the user.
            System.out.println("Please enter a celcius temperature: ");
            
            //Celcius to Fahrenheit
            double CelciusValue = in.nextDouble();
            
            //celcius to fahrenheit conversion.
            double celciusToFahrenheit = (CelciusValue * 9) / 5 + 32;
            
            //output
            System.out.println(CelciusValue + "C to Fahrenheit = " + celciusToFahrenheit + "F");
            
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.testarithmetic;

/**
 *
 * @author e4092399
 */
public class TestArithmetic {

    public static void main(String[] args) {
        
        int a = 3;
        int b = 5;
        int c = 10;
        int d = a + c;
        int e = 3 * 5;
        int f = c % a;
        int g = c / a;
        double h = c / a;
        
        double celcius = 40;
        //Celcius to Fahrenheit
        double fahrenheit = celcius * 9/5 + 32;
        
        //Fahrenheit to Celcius
        double fahrenheit2 = (celcius - 30) / 2;
        
        
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g); //result is technically incorrect as there is no decimal places since g is an int.
        System.out.println(h); //result will still be 3.0. TO GET 3.33, both c and a (ints) will need to be changed to doubles.
        
        System.out.println(fahrenheit);
        System.out.println(fahrenheit2);

    }
}

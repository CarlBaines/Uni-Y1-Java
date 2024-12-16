/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.calculatediscountedprice;
import java.util.Scanner;

/**
 *
 * @author e4092399
 */
public class CalculateDiscountedPrice {
    
    //Global Scanner
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //call method.
        calculateDiscountedCost();
        
        
        
    }
    
    //LOGIC ERROR IN METHOD
    
    public static void calculateDiscountedCost(){
        
        double discount;
        
        System.out.println("Enter the product unit price: ");
        
        double productUnitPrice = in.nextDouble();
        
        System.out.println("Enter the quantity required: ");
        
        double quantity = in.nextDouble();
        
        if (quantity < 10){
            //zero discount
            double total = productUnitPrice;
            System.out.println("The total cost for the product is (no discount): " + total);
        }
        
        else if (quantity >= 10 && quantity <= 20){
            //3.5% discount
            discount = (productUnitPrice * 0.35);
            double total = (productUnitPrice - discount);
            System.out.println("The total cost for the product is: " + total + " with the discount: " + discount + "%");
        }
        
        else if (quantity >= 21 && quantity <= 35){
            //4.2% discount
            discount = (productUnitPrice * 0.42);
            double total = (productUnitPrice - discount);
            System.out.println("The total cost for the product is: " + total + " with the discount: " + discount + "%");
            
        }
        
        else if (quantity >= 36 && quantity <= 60){
            //5.7% discount
            discount = (productUnitPrice * 0.57);
            double total = (productUnitPrice - discount);
            System.out.println("The total cost for the product is: " + total + " with the discount: " + discount + "%");
        }
        
        else if (quantity > 60){
            //7% discount
            discount = (productUnitPrice * 0.7);
            double total = (productUnitPrice - discount);
            System.out.println("The total cost for the product is: " + total + " with the discount: " + discount + "%");
        }
        
        
        
        
    }
}

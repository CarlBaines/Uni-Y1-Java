/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.methodsfordiscount;
import java.util.*;

/**
 *
 * @author Carlt
 */
public class MethodsForDiscount {

    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);
        
        String itemName;
        
        String itemArray [] = {"Sonic", "SpongeBob", "Valorant", "Fortnite", "Football", "Book", "RedBull", "a", "b", "c"};
        
        int itemCounter = 0;
        
        for (int index = 0; index < itemArray.length; index++){
            System.out.println("Add an item to the order: ");
            itemName = in.nextLine();
            
            //validation
            System.out.println("Item added to order!");
            itemCounter++;
        }
    }
}

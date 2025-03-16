/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carlt.adtpracticedriver2;

/**
 *
 * @author Carlt
 */
public class ADTPracticeDriver2 {

    public static void main(String[] args) {
        ArrayADT existingADT = new ArrayADT(5);
        
        System.out.println(existingADT.add(1));
        System.out.println(outputArrayContents(existingADT));
        System.out.println(existingADT.add(2));
        System.out.println(outputArrayContents(existingADT));
        System.out.println(existingADT.add(3));
        System.out.println(outputArrayContents(existingADT));
        System.out.println(existingADT.add(4));
        System.out.println(outputArrayContents(existingADT));
        
        System.out.println(existingADT.remove(2));
        System.out.println(outputArrayContents(existingADT));
        
        System.out.println(existingADT.get(1));
        
        System.out.println(existingADT.isEmpty());
        System.out.println(existingADT.isFull());
        
        
    }
    
    public static String outputArrayContents(ArrayADT existingADT){
        return existingADT.toString();
    }
}

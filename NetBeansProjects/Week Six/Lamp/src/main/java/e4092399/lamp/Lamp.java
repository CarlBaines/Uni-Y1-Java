/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.lamp;

/**
 *
 * @author e4092399
 */
public class Lamp {

    public static void main(String[] args) {
       TestLamp lamp1 = new TestLamp();
       System.out.println("State is " + lamp1.isState());
       
       lamp1.switchOn();
       System.out.println("State is " + lamp1.isState());
       
       lamp1.switchOff();
       System.out.println("State is " + lamp1.isState());
    }
}

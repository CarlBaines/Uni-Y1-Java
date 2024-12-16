/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e4092399.catsanddogs;

/**
 *
 * @author e4092399
 */
public class CatsAndDogs {

    public static void main(String[] args) {     
        
        //Pet - Default pet (THE BEAST)
        Pet pet1 = new Pet();
        
        //Cat
        Cat cat1 = new Cat("Felix");
        System.out.println(cat1.name);
        cat1.makeNoise();
        cat1.performTrick();
        
        
        //Dog
        Dog dog1 = new Dog("Max");
        System.out.println("\n" + dog1.name);
        dog1.makeNoise();
        dog1.performTrick();
        System.out.println("\n");
        
        //Create an array of type Pet and fill it with a mix of Cats, Dogs and Pets.
        Pet petList[] = {cat1, dog1, pet1};
        
        for (Pet index : petList) {
            System.out.println("For loop: \n" + index.name);
            index.makeNoise();
            index.fetch();
            System.out.println("\n");
        }    
    }
}

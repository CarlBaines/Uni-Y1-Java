/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.catsanddogs;

/**
 *
 * @author e4092399
 */
public class Dog extends Pet{
    
    Dog(String name){
        super(name);
    }
    
    @Override
    public void makeNoise(){
        System.out.printf("%s barks. \n", name);
    }
    
    @Override
    public void performTrick(){
        System.out.printf("%s does a griddy. \n", name);
    }
    
    @Override
    public void fetch(){
        System.out.printf("%s goes to fetch. \n", name);
    }
    
   
    
    
}

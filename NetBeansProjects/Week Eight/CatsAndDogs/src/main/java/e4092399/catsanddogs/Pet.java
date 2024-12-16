/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.catsanddogs;
/**
 *
 * @author e4092399
 */
public class Pet {
    protected String name;
    
    //default constructor
    public Pet(){
        name = "the beast";
    }
    
    public Pet(String name){
        this.name = name;
    }
    
    
    public void makeNoise(){
        System.out.printf("%s makes a noise. \n", name);
    }
    
    public void performTrick(){
        System.out.printf("%s performs a trick. \n", name);
    }
    
    public void fetch(){
        System.out.printf("%s cannot fetch. \n", name);
    }
    
    
        
}

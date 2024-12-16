/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlt.testpassword;

/**
 *
 * @author Carlt
 */
public class Password {
    
    
    //Properties
    
    private String word;
    private int length;
    private boolean upper;
    private boolean lower;
    private boolean digit;
    
    
    //Constructor with default values
    
    public Password(){        

        this.word = "password";
        this.length = 8;
        this.upper = false;
        this.lower = false;
        this.digit = false;
    }
    
    //parameterised constructor
    
    public Password(String word, int length, boolean upper, boolean lower, boolean digit){
        this.word = word;
        this.length = length;
        this.upper = upper;
        this.lower = lower;
        this.digit = digit;
    }
    
    //GET METHODS
    
    //Get password length method
    public int getPasswordLength(){
        length = word.length();
        return length;
    }
    
    //Check password contains some uppercase characters
    public boolean containsUppercase(){
        
        for (Character c : word.toCharArray()){
            if (Character.isUpperCase(c)){
                return true;
            }
        }
        
        return false;
    }
   
}

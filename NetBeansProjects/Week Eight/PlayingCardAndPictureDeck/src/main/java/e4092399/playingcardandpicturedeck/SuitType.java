/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package e4092399.playingcardandpicturedeck;

/**
 *
 * @author e4092399
 */
public enum SuitType {
     HEARTS, DIAMONDS, CLUBS, SPADES;
     
     @Override
     public String toString(){
         String firstChar = ("" + this.name().charAt(0)).toUpperCase();
         return firstChar + this.name().substring(1).toLowerCase();
     }
}

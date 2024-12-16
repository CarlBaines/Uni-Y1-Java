/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.playingcardandpicturedeck;

/**
 *
 * @author e4092399
 */
public class PlayingCardMain {
    public static void main(String[] args) {
        //THE GOAT STEVEN'S CODE.
        Deck standardDeck = new StandardDeck();
        Deck pictureDeck = new PictureDeck();
        
        System.out.println("\nStandard Deck\n");
        displayDeck(standardDeck);
        
        System.out.println("\nPicture Deck\n");
        displayDeck(pictureDeck);
    }
    
    public static void displayDeck (Deck deck){
        System.out.println(deck);
    }    
    

    
     
}

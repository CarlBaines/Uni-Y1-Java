/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.playingcardandpicturedeck;

/**
 *
 * @author e4092399
 */
public class PictureDeck extends Deck {
    
    
    public PictureDeck(){
        int faceValuesToBuild[] = {1, 11, 12, 13};
        
        for (SuitType st : SuitType.values()){
            for(int faceValue : faceValuesToBuild){
                playingCards.add(new PlayingCard(st, faceValue));
            }    
        }
    }
       
}

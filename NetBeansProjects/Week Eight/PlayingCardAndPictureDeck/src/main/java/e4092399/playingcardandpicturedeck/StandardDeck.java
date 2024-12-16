/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.playingcardandpicturedeck;

/**
 *
 * @author E4092399
 */
public class StandardDeck extends Deck {

    public StandardDeck() {

        for (SuitType st : SuitType.values()) {
            for (int faceValue = 1; faceValue <= 13; faceValue++) {
                playingCards.add(new PlayingCard(st, faceValue));
            }

        }
        
    }    
 }

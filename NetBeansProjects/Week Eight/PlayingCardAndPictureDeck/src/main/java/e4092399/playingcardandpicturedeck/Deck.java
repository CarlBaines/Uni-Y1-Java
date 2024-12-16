/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.playingcardandpicturedeck;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author e4092399
 */
public abstract class Deck {
    protected ArrayList<PlayingCard> playingCards = new ArrayList<>(); 
   
    
    public final Deck shuffle(){
        Collections.shuffle(playingCards);
        return this;
    }
    
    public final Deck reset(){
        Collections.sort(playingCards);
        return this;
    }
    
    public final Deck reverse(){
        Collections.reverse(playingCards);
        return this;
    }
    
    public final PlayingCard lowestCard(){
        return Collections.min(playingCards);
    }
    
    public PlayingCard highestCard(){
        return Collections.max(playingCards);
    }
    
    
    
    public PlayingCard deal(){
        if (playingCards.isEmpty()){
            return null;
        }    
        return playingCards.remove(0);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("The deck of cards contains ");
        sb.append(playingCards.size());
        sb.append(" playing cards.\n");
        
        for (PlayingCard pc : playingCards){
            sb.append(pc);
            sb.append("\n");
        }
        
        return sb.toString();
    }    
}

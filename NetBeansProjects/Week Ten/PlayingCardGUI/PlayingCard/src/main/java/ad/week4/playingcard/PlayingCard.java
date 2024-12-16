package ad.week4.playingcard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author U0012604
 */
public class PlayingCard {
    public enum SuitTypes {
        Spades, Clubs, Hearts, Diamond
    }
    
    private final SuitTypes suitType;
    private final int faceValue;
    private boolean turned = false;

    public PlayingCard(int faceValue, SuitTypes suitType) {
        this.suitType = suitType;
        this.faceValue = faceValue;
    }

    public SuitTypes getSuitType() {
        return suitType;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public boolean isTurned() {
        return turned;
    }
    
    public void turn() {
        turned = !turned;
    }

    @Override
    public String toString() {
        return "PlayingCard{" + "suitType=" + suitType + ", faceValue=" + faceValue + ", turned=" + turned + '}';
    }
    
}

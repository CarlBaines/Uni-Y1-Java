/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.playingcardandpicturedeck;

/**
 *
 * @author e4092399
 */
public class PlayingCard implements Comparable<PlayingCard> {
    private int faceValue;
    private SuitType suitType;
    
    public PlayingCard(SuitType suitType, int faceValue){
        this.suitType = suitType;
        this.faceValue = faceValue;
    }

    public SuitType getSuitType() {
        return suitType;
    }
    
    public int getFaceValue(){
        return faceValue;
    }
    
    @Override
    public String toString(){
        String suitValueStr;
        switch(faceValue){
            case 1:
                suitValueStr = "Ace";
                break;
            case 11:
                suitValueStr = "Jack";
                break;
            case 12:
                suitValueStr = "Queen";
                break;
            case 13:
                suitValueStr = "King";
                break;
            default:
                suitValueStr = String.valueOf(faceValue);
                break;
        }
        return String.format("The %s of %s", suitValueStr, suitType);
    }

    @Override
    public int compareTo(PlayingCard o) {
        
        int thisSuitType = suitType.ordinal();
        int otherSuitType = o.suitType.ordinal();
        
        if (thisSuitType < otherSuitType ||
            thisSuitType == otherSuitType && faceValue < o.faceValue){
            return -1;
        }
        else if (thisSuitType == otherSuitType && faceValue == o.faceValue){
            return 0;
        }
        return 1;
    }
}

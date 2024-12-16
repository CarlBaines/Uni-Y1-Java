package ad.week4.playingcard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * PlayingCardView
 * 
 * A Swing Component that is a GUI representation of our PlayingCard model.
 * 
 * @author U0012604
 */
public class PlayingCardView extends JLabel {
    private final PlayingCard pcModel;
    
    /*
        All the Playing Card images are loaded when this class is loaded.
    */
    private static final Map<String, ImageIcon> playingCardImageIcons = loadImageIcons();
    private static final ImageIcon playingCardBack = new ImageIcon("images/Cards Pack/PNG/Medium/Back Blue 1.png");
        
    /**
     * PlayingCardView
     * 
     * @param pcModel 
     */
    public PlayingCardView(PlayingCard pcModel) {
    	setHorizontalAlignment(JLabel.CENTER);
    	setVerticalAlignment(JLabel.CENTER);
        this.pcModel = pcModel;
        
        selectPlayingCardImage();
    }
    
    /**
     * turn()
     * 
     * Calls the wrapped playing card object's turn() method and then
     * updates the image being displayed.
     */
    public void turn() {
        pcModel.turn();
        selectPlayingCardImage();
    }
    
    /**
     * getPlayingCard()
     * 
     * @return the playing card object being wrapped.
     */
    public PlayingCard getPlayingCard() {
        return pcModel;
    }
    
    /**
     * getPlayingCardValue()
     * 
     * @return the face value of the playing card being wrapped.
     */
    public Integer getPlayingCardValue() {
        if(pcModel.isTurned()) {
            return pcModel.getFaceValue();
        }
        return null;
    }
    
    /**
     * selectPlayingCardImage()
     * 
     * Selects the appropriate image to display based upon
     * the face/suit of the card or if the card is face down,
     * then it selects the card back image.
     */
    private void selectPlayingCardImage() {
        if(pcModel.isTurned()) {
            final String key =
                    String.format(
                            "%s %d",
                            pcModel.getSuitType().toString(),
                            pcModel.getFaceValue());
            this.setIcon(playingCardImageIcons.get(key));
        }
        else {
            this.setIcon(playingCardBack);
        }        
    }
    
    /**
     * loadImageIcons()
     * 
     * static method used to loaded the static Map of ImageIcons with the
     * playing card images.
     * @return Map<String, ImageIcon>
     */
    private static Map<String, ImageIcon> loadImageIcons() {
        final Map<String, ImageIcon> imageIcons = new HashMap<>();
        
        for(final PlayingCard.SuitTypes st : PlayingCard.SuitTypes.values()) {
            for(int value = 1; value <= 13; value++) {
                final String key = String.format("%s %d", st.toString(), value);
                
                imageIcons.put(key, new ImageIcon("images/Cards Pack/PNG/Medium/" + key + ".png"));
            }
        }

        return imageIcons;       
    }
}

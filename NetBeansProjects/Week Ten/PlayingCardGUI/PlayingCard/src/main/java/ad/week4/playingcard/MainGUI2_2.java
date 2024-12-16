package ad.week4.playingcard;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainGUI2_2 extends JPanel implements MouseMotionListener {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Playing Card 2");
		frame.setLayout(new BorderLayout());
		frame.add(new MainGUI2_2());
		frame.pack();
		frame.setVisible(true);
	}
	
	public MainGUI2_2() {
		super();
		setLayout(new GridBagLayout());
		
		initGame();
	}
	
	private void initGame() {
        /*
            Create the 52 playing cards and shuffle
        */
        List<PlayingCard> playingCards = new ArrayList<>();

        for(PlayingCard.SuitTypes st : PlayingCard.SuitTypes.values()) {
            for(int faceValue = 1; faceValue < 14; faceValue++) {
                playingCards.add(new PlayingCard(faceValue, st));
            }
        }
        
        Collections.shuffle(playingCards);
        
        /*
            Create the PlayingCardView objects that
            will wrap each Playing Card object, providing
            a graphical representation of the each Playing Card
            in the GUI.
        */
        int x = 0, y = 0;
        for(final PlayingCard pc : playingCards) {
            //
            // Set the constraints for the GridBagLayout for this card
            //
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = x++;
            c.gridy = y;
            if(x == 13) {
                x = 0;
                y++;
            }
            
            // Create the view object
            //
            PlayingCardView pcv = new PlayingCardView(pc);
            
            // Add the the panel, passing the constaints object
            // to determine where the new PlayingCardView object will be placed.
            //
            add(pcv, c);       
        }
        
        this.addMouseMotionListener(this);
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if (getComponentAt(e.getPoint()) instanceof PlayingCardView) {
			PlayingCardView playingCardView = (PlayingCardView) getComponentAt(e.getPoint());
			playingCardView.turn();	
		}
	}

}

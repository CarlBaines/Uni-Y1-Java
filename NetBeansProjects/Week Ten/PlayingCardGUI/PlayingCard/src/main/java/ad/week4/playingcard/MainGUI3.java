package ad.week4.playingcard;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainGUI3 extends JPanel implements MouseListener, MouseMotionListener {
    private PlayingCardView draggingCard = null;
    
	public static void main(String[] args) {
		JFrame frame = new JFrame("Playing Card 3");
		frame.setLayout(new BorderLayout());
		frame.add(new MainGUI3());
		frame.pack();
		frame.setVisible(true);
	}
	
	public MainGUI3() {
		super();
		setLayout(new GridBagLayout());
		
		initGame();
	}
	
	private void initGame() {
        
		// Create the 52 playing cards and shuffle
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
            
        	// Set the constraints for the GridBagLayout for this card
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = x++;
            c.gridy = y;
            if(x == 13) {
                x = 0;
                y++;
            }
            
            // Create the view object
            PlayingCardView pcv = new PlayingCardView(pc);
            
            // Add the the panel, passing the constaints object
            // to determine where the new PlayingCardView object will be placed.
            add(pcv, c);       
        }
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Just print out a message as the mouse is being dragged.
        // Nothing more, nothing less than that!
        //
        if(SwingUtilities.isLeftMouseButton(e) && draggingCard != null) {
            System.out.println("Dragging the card " + draggingCard.getPlayingCard() + " at coordinates [" + e.getX() + ", " + e.getY() + "]");
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
      	// Which component is the mouse currently hovering over?
        PlayingCardView selectedCard = (PlayingCardView) getComponentAt(e.getPoint());
        
        if(selectedCard != null) {
            switch(e.getButton()) {
                case MouseEvent.BUTTON1:
                    draggingCard = selectedCard;
                    System.out.println("Selected a card to swap");
                    break;
                case MouseEvent.BUTTON2:
                    break;
                case MouseEvent.BUTTON3:
                    break;
            } 
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        PlayingCardView otherCard = (PlayingCardView) getComponentAt(e.getPoint());

        // Perform the appropriate behaviour, depending on which button has changed state,
        switch(e.getButton()) {
            // Swap two cards' places
            case MouseEvent.BUTTON1:
                if(draggingCard != null && otherCard != null) {

                    // Swap the playing card positions in the GridBagLayout
                    GridBagLayout gbl = (GridBagLayout) getLayout();

                    // Just swapping their constraints around.
                    GridBagConstraints draggedCardConstraints = (GridBagConstraints) gbl.getConstraints(draggingCard);
                    GridBagConstraints otherCardConstraints = (GridBagConstraints) gbl.getConstraints(otherCard);

                    gbl.setConstraints(draggingCard, otherCardConstraints);
                    gbl.setConstraints(otherCard, draggedCardConstraints);
                    
                    updateUI();
                    System.out.println("SWAPPING!!");

                    draggingCard = otherCard = null;
                }
                break;

            // "Delete" a card
            case MouseEvent.BUTTON2:
                // Create a new GridBagConstraint objects whose size is the same as 
                // the component we're removing from the panel.
                GridBagLayout gbl = (GridBagLayout) getLayout();
                GridBagConstraints otherCardConstraints = (GridBagConstraints) gbl.getConstraints(otherCard);

                // Create an "invisible" rigid area that will prevent the 
                // GridBagLayout from collapsing
                Component invisible = Box.createRigidArea(new Dimension(otherCard.getWidth(), otherCard.getHeight()));

                // Remove the PlayingCardView object from the panel
                remove(otherCard);

                // Add the "invisible" rigid area where the card had been
                add(invisible, otherCardConstraints);
                
                updateUI();
                break;
             
            // Turn the card
            case MouseEvent.BUTTON3:
	            System.out.println("Turning card");
	            otherCard.turn();
	            updateUI();                    
                break;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //
        // Do nothing
        //
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //
        // Do nothing
        //
    }
}

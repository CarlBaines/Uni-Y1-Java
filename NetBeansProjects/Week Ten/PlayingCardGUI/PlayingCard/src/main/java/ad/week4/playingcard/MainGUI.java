package ad.week4.playingcard;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainGUI extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Playing Card 1");
		frame.setLayout(new BorderLayout());
		frame.add(new MainGUI());
		frame.pack();
		frame.setVisible(true);
	}
	
	public MainGUI() {
		super();
		setLayout(new BorderLayout());
				
		PlayingCard card = new PlayingCard(1, PlayingCard.SuitTypes.Spades);
		PlayingCardView cardView = new PlayingCardView(card);
		
		cardView.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				PlayingCardView srcCard = (PlayingCardView) e.getSource();
				srcCard.turn();
			}	
		});
		
		add(cardView);
	}

}

package behavioural.state;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UI {
	private Player player; 
	private static JTextField textField = new JTextField();
	
	public UI (Player player) {
		this.player = player;
	}
	
	public void init () {
		JFrame frame = new JFrame("Test player");
		frame.setSize(300,100);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		frame.getContentPane().add(panel);
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.X_AXIS));
		
		panel.add(textField);
		panel.add(buttons);
		
		JButton play = new JButton("Play");
		play.addActionListener( e -> textField.setText(player.getState().onPlay()));
		buttons.add(play);
		
		JButton stop = new JButton("Stop");
		play.addActionListener( e -> textField.setText(player.getState().onLock()));
		buttons.add(stop);
		
		JButton next = new JButton("Next");
		play.addActionListener( e -> textField.setText(player.getState().onNext()));
		buttons.add(next);
		
		JButton prev = new JButton("Previous");
		play.addActionListener( e -> textField.setText(player.getState().onPrevious()));
		buttons.add(prev);

		frame.setVisible(true);
	}
}

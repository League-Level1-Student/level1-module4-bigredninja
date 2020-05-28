package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTouter {
	char currentLetter;
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
public void run () {
	currentLetter = generateRandomLetter();
JFrame frame = new JFrame();
JLabel label = new JLabel();
	label.setText("currentLetter");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.add(label);
	frame.pack();
}
}


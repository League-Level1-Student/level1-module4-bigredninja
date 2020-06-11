package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class TypingTouter implements KeyListener{
	char currentLetter;
	JLabel label = new JLabel();
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
public void run () {
	currentLetter = generateRandomLetter();
JFrame frame = new JFrame();

	label.setText(currentLetter + "");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.add(label);
	frame.pack();
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	 frame.addKeyListener(this);
	 frame.setVisible(true);
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(currentLetter + "");
	char key = arg0.getKeyChar();
	if (key == currentLetter) {
		System.out.println("CORRECT!");
	}
	System.out.println(key);
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}


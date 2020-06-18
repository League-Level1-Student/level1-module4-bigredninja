package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class TypingTouter implements KeyListener{
	char currentLetter;
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
public void run () {
	currentLetter = generateRandomLetter();
	panel.setVisible(true);
	panel.add(label);
	frame.add(panel);
	label.setText(currentLetter + "");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
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
	char key = arg0.getKeyChar();
	if (key == currentLetter) {
		System.out.println("CORRECT!");
		panel.setBackground(Color.green);
	}
	else {
		panel.setBackground(Color.red );
	}
	System.out.println(key);
	currentLetter = generateRandomLetter();
	label.setText(currentLetter + "");
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}


package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whack_a_mole implements ActionListener {
JButton mole;
	public static void main(String[] args) {
		new Whack_a_mole().Gui();
	
	}

	private void Gui() {
		JFrame frame = new JFrame();
		Random rnd = new Random();
		JPanel panel = new JPanel();
		JButton[] buttons = new JButton[27];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			panel.add(buttons[i]);
			buttons[i].addActionListener(null);
			buttons[i].setSize(100,50);
	
		}
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		int n = rnd.nextInt(buttons.length);
		buttons[n].setText("mole");
		mole = buttons[n];	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//TODO Auto-generated method stub
		if (arg0.getSource()== mole ) {
			
		}
		
	}
}
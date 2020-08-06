package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whack_a_mole implements ActionListener {
	public static void main(String[] args) {
		new Whack_a_mole().Gui();
	}

	private void Gui() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton[] buttons = new JButton[27];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			panel.add(buttons[i]);
			buttons[i].addActionListener(null);

		}
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(100, 200);
		frame.setLocationRelativeTo(null);
		
			}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
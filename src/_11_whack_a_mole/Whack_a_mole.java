package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_a_mole implements ActionListener {
JButton mole;
JFrame frame;
int clicks = 0;
int badclicks = 0;
Date date = new Date();
	public static void main(String[] args) {
		new Whack_a_mole().Gui();
	
	}

	private void Gui() {
		frame = new JFrame();
		Random rnd = new Random();
		JPanel panel = new JPanel();
		JButton[] buttons = new JButton[27];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			
			buttons[i].addActionListener(this);
			buttons[i].setSize(500,500);
			buttons[i].setText("         ");
			panel.add(buttons[i]);
	
		}
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		int n = rnd.nextInt(buttons.length);
		buttons[n].setText("mole");
		mole = buttons[n];	
		}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//TODO Auto-generated method stub
		if (arg0.getSource()== mole ) {
			clicks++;
			if (clicks==10) {
				frame.dispose();
				endGame(date,clicks);
			}
			else {
				
			
			frame.dispose();
			Gui();
			}
		}
		else {	
			speak("not quite");
			frame.dispose();
			Gui();
		}
	}
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
       
        }
    }
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}

}
package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class NastySuprise implements ActionListener {
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	
	public void run() {
	leftButton.setText("trick");
	rightButton.setText("treat");
	frame.add(panel);
	panel.add(rightButton);
	panel.add(leftButton);
	leftButton.addActionListener(this);
	rightButton.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == leftButton) {
			showPictureFromTheInternet("https://hips.hearstapps.com/countryliving.cdnds.net/17/47/1511194376-cavachon-puppy-christmas.jpg");
		}
		if(arg0.getSource() == rightButton)
		showPictureFromTheInternet("https://www.kindpng.com/picc/m/204-2045157_spooky-skeleton-halloween-aesthetic-scary-monster-spooky-skeleton.png");
	}
	

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}


}

package _08_calculator;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator implements ActionListener{
	
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	public void showbutton() {
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		frame.add(panel);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		frame.pack();
		frame.setVisible(true);
	}
	public static int add(int a,int b) {
		return a+b;
		
	}
	public static int sub(int a,int b) {
		return a-b;
		
	}
	public static int mul(int a,int b) {
		return a*b;
		
	}
	public static int div(int a,int b) {
		return a/b;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==add) {
			
		}
	}
}
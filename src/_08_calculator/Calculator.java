package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton add = new JButton("add");
	JButton sub = new JButton("sub");
	JButton mul = new JButton("mul");
	JButton div = new JButton("div");
	JTextField text1 = new JTextField(20);
	JTextField text2 = new JTextField(20);
	JTextField answer = new JTextField(20);

	public void showbutton() {
		panel.add(text1);
		panel.add(text2);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(answer);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}

	public static int add(int a, int b) {
		return a + b;

	}

	public static int sub(int a2, int b2) {
		return a2 - b2;

	}

	public static int mul(int a3, int b3) {
		return a3 * b3;

	}

	public static int div(int a4, int b4) {
		return a4 / b4;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == add) {
			String textc1 = text1.getText();
			String textc2 = text2.getText();
			int a = Integer.parseInt(textc1);
			int b = Integer.parseInt(textc2);
			int sum = add(a, b);
			answer.setText(sum + "");
			
	}
		if (e.getSource() == sub) {
			String textC1 = text1.getText();
			String textC2 = text2.getText();
			int a2 = Integer.parseInt(textC1);
			int b2 = Integer.parseInt(textC2);
			int sum1 = sub(a2, b2);
			answer.setText(sum1 + "");
	}
		if (e.getSource() == mul) {
			String textCo1 = text1.getText();
			String textCo2 = text2.getText();
			int a3 = Integer.parseInt(textCo1);
			int b3 = Integer.parseInt(textCo2);
			int sum2 = mul(a3, b3);
			answer.setText(sum2 + "");
	}
		if (e.getSource() == div) {
			String textCO1 = text1.getText();
			String textCO2 = text2.getText();
			int a4 = Integer.parseInt(textCO1);
			int b4 = Integer.parseInt(textCO2);
			int sum3 = div(a4, b4);
			answer.setText(sum3 + "");	
	}}}

package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random rnd = new Random();
		 int numb = rnd.nextInt(4);	
	// 3. Print out this variable
      
		 //System.out.println(numb);
	// 4. Get the user to enter a question for the 8 ball
      JOptionPane.showInputDialog("ask me a question");
	// 5. If the random number is 0
		 if (numb == 0) {
			System.out.println("yes");
		}
	// -- tell the user "Yes"

	// 6. If the random number is 1
		 if (numb == 1) {
		 System.out.println("no");
		}
	// -- tell the user "No"

	// 7. If the random number is 2
		 if (numb == 2) {
			System.out.println("maybe you should ask Google");
		}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
		 if (numb == 3) {
			System.out.println("no,no,no didn't say the magic word");
		}
	// -- write your own answer

}
}
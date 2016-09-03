package FreeLab;

//Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
* I have a pocket full of change. I hate doing math. Make me a program that
* will calculate how much money I have without me having to use my brain. Then
* make me a sandwich.
*/
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String Nickels = JOptionPane.showInputDialog("How many Nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int Nickel = Integer.parseInt(Nickels);
		float N = (float) (Nickel / 20.0);
		// Ask the user how many dimes they have, and convert their answer
		String Dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int Dime = Integer.parseInt(Dimes);
		float D = (float) (Dime / 10.0);
		// Ask the user how many quarters they have, and convert their answer
		String Quarters = JOptionPane.showInputDialog("How many Quarters do you have?");
		int Quarter = Integer.parseInt(Quarters);
		float Q = (float) (Quarter / 4.0); // Calculate how much money the user has and save it in a double variable
		String Pennies = JOptionPane.showInputDialog("How many Pennies do you have?");
		int Penny = Integer.parseInt(Pennies);
		float P = (float) (Penny / 100.0);

		// Tell the user how much money they have
		float S = N + P + Q + D;

		JOptionPane.showMessageDialog(null, "You have " + S + " " + "dollars!");
		float Gumballs = S * 4;
		JOptionPane.showMessageDialog(null, "You can buy " + Gumballs + " " + "gumballs with the amount of money that you have!");

	}

}

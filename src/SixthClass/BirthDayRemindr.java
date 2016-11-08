package SixthClass;

// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthDayRemindr {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String TrumpsBirthday = "June 14th";
		String HillarysBirthday = "October 26th";
		String JohnCenasBirthday = "April 23th";
		String JackSepticeye = "February 7th";
		String Poodiepie = "October 24th";
		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String Bday = JOptionPane.showInputDialog("Which birthday?");
		// 3. Print out what the user typed
		System.out.println("Bday");
		if (Bday.equalsIgnoreCase("Trump for prezi")) {
			JOptionPane.showMessageDialog(null, TrumpsBirthday);

		} else if (Bday.equalsIgnoreCase("Hillary for prez")) {
			JOptionPane.showMessageDialog(null, HillarysBirthday);
		} else if (Bday.equalsIgnoreCase("JOHN CENA!!")) {
			JOptionPane.showMessageDialog(null, JohnCenasBirthday);
		} else if (Bday.equalsIgnoreCase("Jack!")) {
			JOptionPane.showMessageDialog(null, JackSepticeye);
		} else if (Bday.equalsIgnoreCase("Poods")) {
			JOptionPane.showMessageDialog(null, Poodiepie);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry I dont remember that name!");
		}
	}
}

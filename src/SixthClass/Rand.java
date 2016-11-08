package SixthClass;

import java.util.Random;

import javax.swing.JOptionPane;

public class Rand {

	public static void main(String[] args) {
		int poo = 0;
		int hoo = 0;
		for (int i = 1; i < 999999; i++) {
			int xplosivejohncena = new Random().nextInt();

			if (poo < xplosivejohncena) {
				poo = xplosivejohncena;
			}
			if (hoo > xplosivejohncena) {
				hoo = xplosivejohncena;
			}
		}
		JOptionPane.showMessageDialog(null, hoo);
		JOptionPane.showMessageDialog(null, poo);
	}
}

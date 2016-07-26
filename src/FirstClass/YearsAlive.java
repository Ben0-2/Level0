package FirstClass;

import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {

		String age = JOptionPane.showInputDialog("How old are you");
		int b = Integer.parseInt(age);
		int Years = 2016 - b;
		if (b >= 30) {
			JOptionPane.showMessageDialog(null, "You are too old bro");
			System.exit(0);
		}
		for (int i = 0; i < b + 1; i++) {
			JOptionPane.showMessageDialog(null, Years);
			Years++;

		}

	}
}

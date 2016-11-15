package SeventhClass;
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


public class DizzyBoyy {


	public static void main(String[] args) {
				 
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
String poo = JOptionPane.showInputDialog("HOw much dizzy? from 1-10");
int dance = Integer.parseInt(poo);
 // 1. Use the dance method to make the Tortoise spin.
	dance(dance);


	}


	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}




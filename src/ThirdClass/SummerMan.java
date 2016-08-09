package ThirdClass;

import javax.swing.JOptionPane;

public class SummerMan {
public static void main(String[] args) {
	String Name=JOptionPane.showInputDialog("Put in your name");
	String Summer= JOptionPane.showInputDialog("What did u do last summer?");
	JOptionPane.showInputDialog("I know what you did last summer.");
    JOptionPane.showMessageDialog(null, Name + " " + "did " + Summer + " " + "Last summer!");
	
}																					
}

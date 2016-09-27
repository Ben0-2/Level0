package FourthClasssssss;

import java.io.IOException;

//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/**
* Secret Message Box / Secure Messaging System
* 
* You want to leave a message on one of the Mac computers so that only your friend can read it.
* You set up the passcode and the secret message. 
* Your friend types in the passcode to retrieve the message.
* 
*/

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		String passcode = "I solemnly swear that I am up to no good and that my farts stink";
	String Message= JOptionPane.showInputDialog("Secret massage please");
	String Password= JOptionPane.showInputDialog("Password plz");
	if(Password.equals(passcode)){
		try {
			Runtime.getRuntime().exec("say " + Message).waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	else{
		JOptionPane.showMessageDialog(null, "Failed!!!!!!");
	}
	}
	// 1. Set the passcode in a String variable
	
	// 2. Using a pop-up, ask for a secret message and store it in a variable

	// 3. Ask your friend for the passcode and store it in a variable

	// 4. If the passcode matches, show the secret message

	// 5. If the passcode does not match, pop-up "INTRUDER!!"

	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.

}



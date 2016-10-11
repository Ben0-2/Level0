package FifthClass;


	 import java.util.Random;

import javax.swing.JOptionPane;

	// Copyright Wintriss Technical Schools 2013
	public class HighLowGame {

		public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int random = new Random().nextInt(100);
			// 2. Print out the random variable above
			    
			// 11. do the following 10 times
			for (int i = 0; i < 10; i++) {
				
			
				// 1. ask the user for a guess using a pop-up window, and save their response 
                String guess = JOptionPane.showInputDialog("Put in guess plz");
				// 4. convert the users’ answer to an int (Integer.parseInt(string))
				int hello = Integer.parseInt(guess);
				// 5. if the guess is correct
					if(hello == random){
						JOptionPane.showInputDialog("You win!");
						System.exit(0);
					
					}
				// 6. win
				if(hello>random){
					JOptionPane.showMessageDialog(null, "Yo guess is too high! try again!");
																										
				}														
					// 7. if the guess is high
				if(hello<random){
					JOptionPane.showMessageDialog(null, "Tooo low! try again!"); 
				}
					// 8. tell them it's too high
				// 9. if the guess is low
			}		// 10. tell them it's too low
           JOptionPane.showMessageDialog(null, "u lose bro, sorry");
			// 12. tell them they lose
		System.exit(0);
		}

		private static void playVideo(String string) {
			// TODO Auto-generated method stub
			
		}

	}





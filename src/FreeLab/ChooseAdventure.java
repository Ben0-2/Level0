package FreeLab;

import java.util.Scanner;

public class ChooseAdventure {
	public static void main(String[] args) {
		Scanner Hi = new Scanner(System.in);
		System.out.println(
				"You are a top secret agent going to find out the murderer of the President of the United States of \n America, You are sitting on a chair at your desk. There is a letter sitting in front of you.");
		String one = Hi.nextLine();
		if (one.equalsIgnoreCase("Open the letter")) {
			System.out.println(
					"Hello! new recruit. You have been hired by the \n Army of the United States of America to solve a murder case. \n We want you to solve the mystery of the murder of \n our President. Tell us your name. \n There is an identification card in here that will come in handy.");
			String LetterAnswer = Hi.nextLine();
			System.out.println("Ok! your name is " + LetterAnswer);
			System.out.println("The first thing we would like you to do is \n get on a plane to the Pentagon. \n We will give you further instructions there.");
			String Ticket = Hi.nextLine();
			if (Ticket.equalsIgnoreCase("Buy ticket")) {
				System.out.println("You got a ticket to go to \n Washington Dulles International Airport");
				System.out.println("You are at SAN airport and about to go through security");
				System.out.println("Oh no! The security guard has found a gun in your bag!");
				String guard = Hi.nextLine();
				if (guard.equalsIgnoreCase("Show him my identification")) {
					System.out.println("The guard accepts you in and lets you into the terminal");
					System.out.println("You have just gotten out of your gate in Dc.\n You board a taxi to get to the Pentagon");
					System.out.println("You have arrived at the Pentagon and are going to a meeting \n with the Secretary of Defense.");
					System.out.println("The Secretary tells you that the murderer is Jonathan Kingston, Your uncle!");
					String uncle = Hi.nextLine();
					if (uncle.equalsIgnoreCase("Tell him the murderer is my uncle")) {
						System.out.println("The Secretary tells you that you have to be tough and arrest him");
						String choice = Hi.nextLine();
						if (choice.equalsIgnoreCase("Take the mission")) {
							System.out.println("Good job on making it this far! \n You will continue your adventure in the next part of this game.");
							System.exit(0);
						}
						else{
							System.out.println("Would you like to quit?");
							String quit= Hi.nextLine();
							if(quit.equalsIgnoreCase("Yes")){
								System.out.println("Okay! Goodbye");
								System.exit(0);
							}
							
						}
					}
					else{
						System.out.println("Would you like to quit?");
						String quit= Hi.nextLine();
						if(quit.equalsIgnoreCase("Yes")){
							System.out.println("Okay! Goodbye");
							System.exit(0);
						}
						
					}
				}
				else{
					System.out.println("Would you like to quit?");
					String quit= Hi.nextLine();
					if(quit.equalsIgnoreCase("Yes")){
						System.out.println("Okay! Goodbye");
						System.exit(0);
					}
					
				}
			}
			else{
				System.out.println("Would you like to quit?");
				String quit= Hi.nextLine();
				if(quit.equalsIgnoreCase("Yes")){
					System.out.println("Okay! Goodbye");
					System.exit(0);
				}
				
			}
		}
		else{
			System.out.println("Would you like to quit?");
			String quit= Hi.nextLine();
			if(quit.equalsIgnoreCase("Yes")){
				System.out.println("Okay! Goodbye");
				System.exit(0);
			}
			
		}
	}

}

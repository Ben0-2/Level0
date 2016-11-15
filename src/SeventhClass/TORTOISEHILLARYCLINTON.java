package SeventhClass;
import org.teachingextensions.logo.Pizza;
//Copyright Wintriss Technical Schools 2014
import org.teachingextensions.logo.Tortoise;


/*** Teacher's note ***/
/*
* Start by reviewing the 3 pieces of a for loop (initialization, condition,
* increment). Do not give the students the answer to the challenge.
*/


public class TORTOISEHILLARYCLINTON {


	public static void main(String[] args) {
		
Tortoise HILLARYCLINTON = new Tortoise();
		// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to see the result of this line.
HILLARYCLINTON.setX(50);

		// 2. Make the Tortoise draw a star shape. Hint: 144.
HILLARYCLINTON.setSpeed(10);
HILLARYCLINTON.penDown();
HILLARYCLINTON.turn(90);

for (int i = 0; i < 12; i++) {

	HILLARYCLINTON.move(30);

		// 3. Set the size of the star to 30
for (int j = 0; j < 5; j++) {
	HILLARYCLINTON.move(50);
    HILLARYCLINTON.turn(144);
}
}		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */


	}


}


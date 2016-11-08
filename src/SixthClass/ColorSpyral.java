package SixthClass;

import org.jointheleague.graphical.robot.Robot;

public class ColorSpyral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot GAMMATRON = new Robot();
		// 5. Set your robot's pen to the down position
		GAMMATRON.penDown();

		// 3. Set the robot to go at max speed (10)
		GAMMATRON.setSpeed(10);

		// 4. Repeat the code below 75 times (you’ll need to move the mustache!)

		for (int i = 0; i < 900000; i++) {

			// 7. Change the pen color to random
			GAMMATRON.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing
			// (5*i)
			GAMMATRON.move(5 * i);
			// 2. Turn the robot 1/3 of 360 degrees to the right
			GAMMATRON.turn(360 / 7);
			// 8. Change the number of sides to 7 (don’t add a new line of code
			// for this one!)

			// 9. Set the pen width to i
			GAMMATRON.setPenWidth(i);
		}

	}
}

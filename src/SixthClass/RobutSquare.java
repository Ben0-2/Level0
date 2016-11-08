package SixthClass;

import org.jointheleague.graphical.robot.Robot;

public class RobutSquare {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
		Robot GAMMATRON = new Robot();

		// 3. Put the robot's pen down
		GAMMATRON.penDown();
		// 6. Make the robot move as fast as possible
		GAMMATRON.setSpeed(10);
		// 5. Do everything below here 4 times

		// 2. Move your robot 200 pixels

		for (int i = 0; i < 4; i++) {
			GAMMATRON.move(200);
			// 4. Turn the robot 90 degrees to the right (90 degrees)
			GAMMATRON.turn(90);
		}
	}
}

/*
 * ERIN KELLY
 */
import java.util.Scanner;
public class RobotSimFE {
	private static Scanner keyboard = new Scanner(System.in);
	private static RobotSim RSMan = new RobotSim();
	public static void main(String[] args) {
		printGreeting();
		boolean play = true;
		while(play)
		{
			//front end
			//ask for board file
			System.out.println("Enter the file for the board");
			String boardFile = keyboard.nextLine();
			//ask for command file
			System.out.println("Enter file for the robot commands");
			String comFile = keyboard.nextLine();
			
			RSMan.readBoard(boardFile);
			RSMan.readCommand(comFile);
			//runs simulation
			sim();
			//end of sim outputs
			System.out.println("Simulation End");
			System.out.println("Quit? Enter \"yes\" to quit or \"no\" to run another simulation");
			String input = keyboard.nextLine();
			if(input.equalsIgnoreCase("yes"))
			{
				System.out.println("Goodbye!");
				play = false;
			}
			else if(input.equalsIgnoreCase("no"))
				play = true;
			else
			{
				System.out.println("Invalid input. Ending simulations");
				play = false;
			}
		}
	}
	public static void printGreeting()
	{
		System.out.println("Welcome to the Robot Simulator");
	}
	public static void sim()
	{
		System.out.println("Simulation begin");
		RSMan.move();
	}
}

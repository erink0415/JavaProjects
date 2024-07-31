//erin kelly
import java.util.Scanner;
public class SheepFE {
	public static Scanner keyboard = new Scanner(System.in);
	public static final String DELIM = "\t";
	public static SheepManager s = new SheepManager();
	public static boolean play;
	
	public static void main(String[] args) {
		//while loop so the user can use the program again without restarting
		boolean play = true;
		while(play)
		{
			printGreeting();
			printPrompt();
			printSchedule();
			System.out.println("If you would like to make a schedule again type \"yes\" "
					+ "\nif you are done type \"no\"");
			String input = keyboard.nextLine();
			if(input.equals("yes"))
				play = true;
			else if(input.equals("no"))
			{
				play = false;
				System.out.println("Goodbye");
				System.exit(0);
			}
		}
	}

	public static void printGreeting()
	{
		System.out.println("Hello and welcome to the Sheep Shearing Scheduler!");
	}
	public static void printPrompt()
	{
		System.out.println("Please enter the file name you want to use.");
		String fileName = keyboard.nextLine();
		//calls readFile method from sheepManager
		s.readFile(fileName);
	}
	public static void printSchedule()
	{
		System.out.println("Here's your schedule!");
		s.scheduleSheep();
	}
	public static void printEnding()
	{
		System.out.println("If you would like to make a schedule again type \"yes\" "
				+ "\nif you are done type \"no\"");
		String input = keyboard.nextLine();
		if(input == "yes")
			play = true;
		else
		{
			play = false;
			System.out.println("Goodbye");
			System.exit(0);
		}
		
			
	}
}


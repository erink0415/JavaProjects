/*
 * ERIN KELLY
 */

import java.util.Scanner;
//IMPORT VGDATAMANAGERRRRR

public class VGDataFE {

	private static Scanner keyboard = new Scanner(System.in);
	private static VGDatabaseManager VGManager = new VGDatabaseManager();

	
	public static void main(String[] args) {

		//create while loop for user choice
		printGreeting();
		boolean play = true;
		while(play)
		{
			printChoices();
			
			int input = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(input)
			{
			case 1:
				loadDatabase();
				break;
			case 2:
				searchDatabase();
				break;
			case 3:
				printCurrentToConsole();
				break;
			case 4:
				printCurrentToFile();
				break;
			case 0:
				play = false;
				break;
			default:
				System.out.println("invalid input");
			}
			
		}

	}

	//TODO make printGreeting
	public static void printGreeting()
	{
		System.out.println("Welcome to the video game database!");
	}
	
	//TODO make print choices
	public static void printChoices()
	{
		System.out.println("Enter 1 to load the video game database\n"
				+ "Enter 2 to search the database\n"
				+ "Enter 3 to print the current results to the console\n"
				+ "Enter 4 to print the current results to file\n"
				+ "Enter 0 to quit");
	}
	
	//case 1
	public static void loadDatabase()
	{
		System.out.println("Enter the file name");
		String fileName = keyboard.nextLine();
		//BACKEND METHODDDDDD
		VGManager.readVGDFile(fileName);
		
	}
	
	//case 2
	public static void searchDatabase()
	{
		System.out.println("Enter the name of the game or '*' for all");
		String game = keyboard.nextLine();

		System.out.println("Enter the name of the console or '*' for all");
		String console = keyboard.nextLine();
		VGManager.searchVGD(game, console);
	}
	
	//case 3 
	public static void printCurrentToConsole()
	{
		VGManager.print();
	}
	
	//case 4
	public static void printCurrentToFile()
	{
		System.out.println("Enter the file name");
		String fileName = keyboard.nextLine();
		System.out.println("Would you like to append? True or False");
		boolean append = keyboard.nextBoolean();
		if(append == true)
		{
			VGManager.writeVGDAppend(fileName);
		}
		else
		{
			//TODO MAKE BACKEND
			VGManager.writeVGDFile(fileName);
		}
		
		
	}
}

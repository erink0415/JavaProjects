/*
 * ERIN KELLY
 */
import java.util.Scanner;
public class DresserFrontEnd {

	public static Dresser dresser = new Dresser();
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		printGreeting();
		
		boolean play = true;
		
		while(play)
		{
		
			printChoice();
			int input = keyboard.nextInt();
			if(input == 1)
			{
				addClothes(keyboard);
			}	
			else if(input == 2)
			{//TODO CREATE METHOD
				removeClothes(keyboard);
				
			}
			else if(input == 3)
			{
				printDresser();
				
			}
			else if(input == 9)
			{
				System.out.println("goodbye");
				play = false;
			}
		}

	}
	public static void printGreeting()
	{
		System.out.println("Welcome to the dresser!");
	}
	public static void printChoice()
	{
		System.out.println("Enter 1: to add an item \n"
				+ "Enter 2: to remove an item \n"
				+ "Enter 3. to print out the dresser contents \n"
				+ "Enter 9: to quit");
	}
	public static void addClothes(Scanner keyboard)
	{
		System.out.println("Enter the type.\n"
				+ "it may be undergarment, socks, stockings, top, bottom, or cape");
		keyboard.nextLine();
		String clothesType = keyboard.nextLine();
		System.out.println("Enter a color\n"
				+ "it may be brown, pink, orange, green, blue, purple, or grey");
		String clothesColor = keyboard.nextLine();
		
		
		dresser.Add(new Clothing(clothesType, clothesColor));
	}
	public static void removeClothes(Scanner keyboard)
	{
		System.out.println("Enter the type\n"
				+ "it may be undergarment, socks, stockings, top, bottom, or cape");
		keyboard.nextLine();
		String clothesType = keyboard.nextLine();
		System.out.println("Enter the color\n"
				+ "It may be brown, pink, orange, green, blue, purple, or grey");
		String clothesColor = keyboard.nextLine();
		
		dresser.Remove(new Clothing(clothesType, clothesColor));
	}
	public static void printDresser()
	{
		dresser.Print();
	}
}

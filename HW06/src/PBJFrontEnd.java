/*
 * ERIN KELLY
 */
import java.util.Scanner;
public class PBJFrontEnd {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean restart = false;
		//variables for sandwich.....
		//top bread
		String pbj1Name;
		int pbj1Cal;
		String pbj1Type;
		
		//pb
		String pb1Name;
		int pb1Cal;
		boolean pb1Crunch;
		
		//jelly
		String j1Name;
		int j1Cal;
		String j1Type;
		
		//bottom bread
		String pbj01Name;
		int pbj01Cal;
		String pbj01Type;
		
		//Sandwich two
		//top bread
		String pbj2Name;
		int pbj2Cal;
		String pbj2Type;
		
		//pb
		String pb2Name;
		int pb2Cal;
		boolean pb2Crunch;
		
		//jelly
		String j2Name;
		int j2Cal;
		String j2Type;
		
		//bottom bread
		String pbj02Name;
		int pbj02Cal;
		String pbj02Type;
		
		System.out.println("Welcome to the PBJ Sandwich Maker!");
		//to let user replay
		while(!restart)
		{
			System.out.println("----Sandwich One----");
			//PBJSandwich pbj01 = new PBJSandwich();
			System.out.println("Top Slice of Bread Information");
			System.out.println("Enter name of the bread");
			pbj1Name = keyboard.nextLine();
			System.out.println("Enter the number of calories");
			pbj1Cal = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
			pbj1Type = keyboard.nextLine();
			
			System.out.println("Peanut Butter Information");
			System.out.println("Enter name of the peanut butter");
			pb1Name = keyboard.nextLine();
			System.out.println("Enter the number of calories");
			pb1Cal = keyboard.nextInt();
			System.out.println("Is it crunchy? enter \"true\" or \"false\"");
			pb1Crunch = keyboard.nextBoolean();
			
			System.out.println("Jelly Info");
			System.out.println("Enter the name of the jelly");
			j1Name = keyboard.nextLine();
			keyboard.nextLine();
			System.out.println("Enter the number of calories");
			j1Cal = keyboard.nextInt();
			System.out.println("Enter the type of bread. Must be \"Apple\", \"Blueberry\", \"Grape\", \"Strawberry\", or \"Tomato\"");
			j1Type = keyboard.nextLine();
			keyboard.nextLine();
			
			System.out.println("Bottom Slice of bread info");
			System.out.println("Enter name of the bread");
			pbj01Name = keyboard.nextLine();
			System.out.println("Enter number of calories");
			pbj01Cal = keyboard.nextInt();
			System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
			pbj01Type = keyboard.nextLine();
			keyboard.nextLine();
			
			//SANDWICH TWOOOO
			System.out.println("----Sandwich Two----");
			//PBJSandwich pbj02 = new PBJSandwich();
			System.out.println("Top Slice of Bread Information");
			System.out.println("Enter name of the bread");
			pbj2Name = keyboard.nextLine();
			System.out.println("Enter the number of calories");
			pbj2Cal = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
			pbj2Type = keyboard.nextLine();
			
			System.out.println("Peanut Butter Information");
			System.out.println("Enter name of the peanut butter");
			pb2Name = keyboard.nextLine();
			System.out.println("Enter the number of calories");
			pb2Cal = keyboard.nextInt();
			System.out.println("Is it crunchy? enter \"true\" or \"false\"");
			pb2Crunch = keyboard.nextBoolean();
			
			System.out.println("Jelly Info");
			System.out.println("Enter the name of the jelly");
			j2Name = keyboard.nextLine();
			keyboard.nextLine();
			System.out.println("Enter the number of calories");
			j2Cal = keyboard.nextInt();
			System.out.println("Enter the type of bread. Must be \"Apple\", \"Blueberry\", \"Grape\", \"Strawberry\", or \"Tomato\"");
			j2Type = keyboard.nextLine();
			keyboard.nextLine();
			
			System.out.println("Bottom Slice of bread info");
			System.out.println("Enter name of the bread");
			pbj02Name = keyboard.nextLine();
			System.out.println("Enter number of calories");
			pbj02Cal = keyboard.nextInt();
			System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
			pbj02Type = keyboard.nextLine();
			keyboard.nextLine();
			
			Bread topSlice1 = new Bread(pbj1Name,pbj1Cal,pbj1Type);
			PeanutButter pb1 = new PeanutButter(pb1Name, pb1Cal, pb1Crunch);
			Jelly jelly1 = new Jelly(j1Name,j1Cal, j1Type);
			Bread bottomSlice1 = new Bread(pbj01Name,pbj01Cal,pbj01Type);
			
			Bread topSlice2 = new Bread(pbj2Name,pbj2Cal,pbj2Type);
			PeanutButter pb2 = new PeanutButter(pb2Name, pb2Cal, pb2Crunch);
			Jelly jelly2 = new Jelly(j2Name,j2Cal, j2Type);
			Bread bottomSlice2 = new Bread(pbj02Name,pbj02Cal,pbj02Type);
			
					
			
			PBJSandwich pbj01 = new PBJSandwich(topSlice1, pb1, jelly1, bottomSlice1);
			PBJSandwich pbj02 = new PBJSandwich(topSlice2, pb2, jelly2, bottomSlice2);
			
			System.out.println("Sandwich One\n"+pbj01.toString()+"\n");
			System.out.println("Sandwich Two\n"+pbj02.toString()+"\n");
			
			System.out.println("Are they the same sandwich? "+pbj01.equals(pbj02));
			
			System.out.println("\n"
					+ "Would you like to replay? \n"
					+ "Type \"yes\" to reenter pbj or \"no\" to quit");
			String input = keyboard.nextLine();
			if(input.equalsIgnoreCase("yes"))
				restart = false;
			else if(input.equalsIgnoreCase("no"))
				restart = true;
			
			
		}
	}

}

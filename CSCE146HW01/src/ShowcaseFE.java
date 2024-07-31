/*
 * ERIN KELLY
 */
import java.util.Scanner;
import java.util.*;


public class ShowcaseFE {
	private static Scanner keyboard = new Scanner(System.in);
	private static PrizeManager prizeManager = new PrizeManager();

	
	//TODO CREATE RANDOM PRIZE LIST

	public static void main(String[] args) {
				
		//VARIABLES
		
		
	
	
		System.out.println("Welcome to the showcase show down!");
		
		boolean play = true;
		while(play)
		{
			//makes prize array
		Prize[] prize = prizeManager.getPrize();
			
		Prize[] actPrizes = PrizeManager.choosePrizes(prize);
		
		System.out.println("You're prizes are:");
		
		for(int i=0;i<actPrizes.length;i++)
		{
			System.out.println(actPrizes[i]);
		}
		System.out.println("You must enter the total cost of the prizes without going over and \n"
				+ "within $1300 of its actual price");
		System.out.println("Enter your guess");
		// MAKE DOUBLE FOR USER INPUT
		int input = keyboard.nextInt();
		keyboard.nextLine();
		
		//how to get prices for added prizes
		if(input <= PrizeManager.addPrizes(actPrizes) - 1300 || input > PrizeManager.addPrizes(actPrizes))
		{
			System.out.println("the actual price of the prizes was "+PrizeManager.addPrizes(actPrizes));
			System.out.println("YOU LOSEEEEEEEEEEEEEEE !");
			
		}
		else
		{
			System.out.println("the actual price of the prizes was "+PrizeManager.addPrizes(actPrizes));
			System.out.println("YOU WIN !!!");
		}
		//TO ask player if they want to play again
		System.out.println("Would you like to quit? Enter \"yes\" to quit");
		//user input
		String playAgain = keyboard.nextLine();
		
		System.out.println("You entered "+playAgain);
		if(playAgain.equalsIgnoreCase("yes"))
		{
			System.out.println("GOODBYE");
			play = false;
		}
		else if(playAgain.equalsIgnoreCase("no"))
		{
			play = true;
		}
		else
		{
			System.out.println("That's invalid. Ending the game.");
			play = false;
		}
		}
	}
	
	

}

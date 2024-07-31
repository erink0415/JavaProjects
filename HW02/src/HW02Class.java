/*
 * Erin Kelly
 */

import java.util.Scanner;
import java.util.Random;

public class HW02Class {
	
	public static void main(String[] args) {
		
//make array for r p s, make array for wins
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		r.nextInt();
		int compTurn = r.nextInt(3);
		
		boolean play = true;
		

		System.out.println("Time to play rock, paper, scissors!");
		

		do
		{
//variables to store the wins
			int playerWin = 0;
			int compWin = 0;
			
			for(int i = 0; i < 3; i++)
			{
				System.out.println("\nWelcome to round "+(i+1)+" of rock, paper, scissors! "
						+ "\nEnter \"0\" for rock, \"1\" for paper, or \"2\" for scissors");
				int playerTurn = keyboard.nextInt();
				keyboard.nextLine();
				
				if (playerTurn < 0 || playerTurn >= 3)
				{
					System.out.println("Whoops, that's not a valid input. The computer automatically wins.");
//add in a win to computer
					compWin++;
				}
				
				System.out.println("You chose "+playerTurn+", the computer chose "+compTurn);
//Player wins and computer wins code
				if(playerTurn == compTurn)
				{
					System.out.println("That's a draw! No one gets a point.");
				}
				else if(playerTurn == 0 && compTurn == 1)
				{
					System.out.println("The computer wins! The computer gets a point.");
					compWin++;
				}
				else if(playerTurn == 0 && compTurn == 2)
				{
					System.out.println("You win! You get a point");
					playerWin++;
				}
				else if (playerTurn == 1 && compTurn == 0)
				{
					System.out.println("You win! You get a point!");
					playerWin++;
				}
				else if (playerTurn == 1 && compTurn == 2)
				{
					System.out.println("The computer wins! The computer gets a point.");
					compWin++;
				}
				else if (playerTurn == 2 && compTurn == 0)
				{
					System.out.println("The computer wins! The computer gets a point.");
					compWin++;
				}
				else if (playerTurn == 2 && compTurn == 1)
				{
					System.out.println("You win! You get a point!");
					playerWin++;
				}
				
				
			}
//best two out of three win code
				if(playerWin < compWin)
				{
					System.out.println("The computer won best two out of three!");
				}
				else if (playerWin == compWin)
				{
					System.out.println("You and the computer have a draw.");
				}
				else if (playerWin > compWin)
				{
					System.out.println("You won best two out of three!");
				}
				
				System.out.println("\nWould you like to play again? \"yes\" or \"no\"");
				String playAgain = keyboard.nextLine();
				
//user input for playing again
				if(playAgain.equals("yes"))
				{
					play = true;
				}
				else if (playAgain.equals("no"))
				{
					play = false;
					System.out.println("Bye-Bye!");
					System.exit(0);
				}
				else 
				{
					play = false;
					System.out.println("Bye-Bye!");
					System.exit(0);
				}
			
		} while(play);
	

}
}
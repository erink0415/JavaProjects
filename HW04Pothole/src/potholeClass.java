/*
 * Erin Kelly
 */
import java.util.Scanner;
import java.util.Random;

public class potholeClass {
	
	public static final int BOARD_SIZE = 10;
	public static final char EMPTY = '_';
	public static final char PLAYER = 'X';
	public static final char HOME = '^';
	public static final char POTHOLE = '_';
	
	public static void main(String[] args) {
			
			Scanner keyboard = new Scanner(System.in);
			Random r = new Random();
			
			boolean playAgain = false;
			
		while(!playAgain)
		{
			//create all coordinates
			int pX = 0;
			int pY = 0;
			int gX = 9;
			int gY = 9;
			int potX1 = r.nextInt(BOARD_SIZE-1);
			int potY1 = r.nextInt(BOARD_SIZE-1);
			
			int potX2 = r.nextInt(BOARD_SIZE-1);
			int potY2 = r.nextInt(BOARD_SIZE-1);
			
			int potX3 = r.nextInt(BOARD_SIZE-1);
			int potY3 = r.nextInt(BOARD_SIZE-1);
			
			int potX4 = r.nextInt(BOARD_SIZE-1);
			int potY4 = r.nextInt(BOARD_SIZE-1);
			
			int potX5 = r.nextInt(BOARD_SIZE-1);
			int potY5 = r.nextInt(BOARD_SIZE-1);
			
			char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
			for(int i=0; i<board.length;i++)
			{
				for(int j=0; j<board[i].length; j++)
				{
					board[i][j] = EMPTY;
				}
			}
			//assign player, goal, and potholes to board
			board[pY][pX] = PLAYER;
			board[gY][gX] = HOME;
			board[potY1][potX1] = POTHOLE;
			board[potY2][potX2] = POTHOLE;
			board[potY3][potX3] = POTHOLE;
			board[potY4][potX4] = POTHOLE;
			board[potY5][potX5] = POTHOLE;
			
			
			System.out.println("Welcome to pothole driving! Get home while avoiding potholes!");
			boolean gameOver = false;
			while(!gameOver)
			{
				//print the board
				for(int i = 0; i < board.length; i++) 
				{
					for(int j=0; j<board[i ].length; j++)
					{
						System.out.print(board[i][j]);
					}
					System.out.println();
				}
				
				//user input
				System.out.println("enter either -1, 0, or 1, to move the X or 9 to quit");
				int dX = keyboard.nextInt();
				if(dX == 9)
				{
					System.out.println("Goodbye!");
					System.exit(0);
				}
				System.out.println("enter either -1, 0, or 1 to move the y");
				int dY = keyboard.nextInt();
				if (dX < -1 || dX > 1)
				{
					System.out.println("thats invalid");
					dX = 0;
				}
				if(dY < -1 || dY > 1)
				{
					System.out.println("invalid");
					dY = 0;
				}
			
				
				board[pY][pX] = EMPTY;
				pX += dX;
				pY += dY;
				//d is always delta/change in ^
				//out of bounds code
				if(pX < 0)
				{
					pX = 0;
				}
				else if(pX >= BOARD_SIZE)
				{
					pX = BOARD_SIZE - 1;
				}
				if(pY < 0)
				{
					pY = 0;
				}
				else if(pY >= BOARD_SIZE)
				{
					pY = BOARD_SIZE - 1;
				}
				board[pY][pX] = PLAYER;
				//win code
				if(pX == gX && pY == gY)
				{
					System.out.println("YOU WIN!");
					keyboard.nextLine();
					gameOver = true;
				}
				//loose code for all 5 potholes
				if(pX == potX1 && pY == potY1)
				{
					System.out.println("OH NOO POTHOLE!");
					keyboard.nextLine();
					gameOver = true;
				}
				if(pX == potX2 && pY == potY2)
				{
					System.out.println("OH NOO POTHOLE!");
					keyboard.nextLine();
					gameOver = true;
				}
				if(pX == potX3 && pY == potY3)
				{
					System.out.println("OH NOO POTHOLE!");
					keyboard.nextLine();
					gameOver = true;
				}
				if(pX == potX4 && pY == potY4)
				{
					System.out.println("OH NOO POTHOLE!");
					keyboard.nextLine();
					gameOver = true;
				}
				if(pX == potX5 && pY == potY5)
				{
					System.out.println("OH NOO POTHOLE!");
					keyboard.nextLine();
					gameOver = true;
				}
			}
			
			//make play again while
			System.out.println("Would you like to play again?");
			String answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("yes"))
			{
				playAgain = false;
			}
			else if(answer.equalsIgnoreCase("no"))
			{
				System.out.println("Goodbye!");
				playAgain = true;
			}
			else
			{
				System.out.println("GOODBYE");
			}
		}

	}

}


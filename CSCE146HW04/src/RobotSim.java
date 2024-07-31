/*
 * ERIN KELLY
 */
import java.util.Scanner;
import java.io.*;
public class RobotSim {
	public static final int SIZE = 10;
	QueueI<String> comQueue;
	private char[][] board;
	
	public void readBoard(String boardFile)
	{
		board = new char[SIZE][SIZE];
		try
		{
			Scanner fileScanner = new Scanner(new File(boardFile));
			for(int i=0;i<SIZE;i++)
			{
				String row = fileScanner.nextLine();
				for(int j=0;j<SIZE;j++)
				{
					board[i][j] = row.charAt(j);
				}
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void readCommand(String comFile)
	{
		comQueue = new ArrayQueue<String>();
		try
		{
			Scanner fileScanner = new Scanner(new File(comFile));
			while(fileScanner.hasNext())
			{
				String command = fileScanner.nextLine();
				comQueue.enqueue(command);
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void printBoard()
	{
		for(int i=0;i<SIZE;i++)
		{
			for(int j=0;j<SIZE;j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	public void move()
	{
		//make robot
		char robot = 'O';
		//coordinates
		int pX = 0;
		int pY = 0;
		board[pX][pY] = robot;
		int comNum = -1;
		printBoard();
		while(comQueue.peek() != null)
		{
			comNum++;
			String command = comQueue.dequeue();
			if(command.equals("Move Up"))
			{
				//make current position reg ground again
				board[pX][pY] = '_';
				pX--;
				if(board[pX][pY]=='X')
				{
					System.out.println("Command "+comNum+"\nCRASH!");
					return;
				}
				//adds robot to new position
				board[pX][pY] = robot;
			}
			else if(command.equals("Move Down"))
			{
				//make current position reg ground again
				board[pX][pY] = '_';
				pX++;
				if(board[pX][pY]=='X')
				{
					System.out.println("Command "+comNum+"\nCRASH!");
					return;
				}
				//adds robot to new position
				board[pX][pY] = robot;
			}
			else if(command.equals("Move Left"))
			{
				//make current position reg ground again
				board[pX][pY] = '_';
				pY--;
				if(board[pX][pY]=='X')
				{
					System.out.println("Command "+comNum+"\nCRASH!");
					return;
				}
				//adds robot to new position
				board[pX][pY] = robot;
			}
			else if(command.equals("Move Right"))
			{
				//make current position reg ground again
				board[pX][pY] = '_';
				pY++;
				if(board[pX][pY]=='X')
				{
					System.out.println("Command "+comNum+"\nCRASH!");
					return;
				}
				//adds robot to new position
				board[pX][pY] = robot;
			}
			System.out.println("Command "+comNum);
			printBoard();
		}
	}
}

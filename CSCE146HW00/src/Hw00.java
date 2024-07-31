/*
 * ERIN KELLY
 */
import java.util.Scanner;
import java.math.*;

public class Hw00 {
	private static Scanner keyboard = new Scanner(System.in);
	
	//VARIABLES
	static double vector1[] = new double[0];
	static double vector2[] = new double[0];
	static int size = 2;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Vector Operations Program!");
		
		Boolean run = true; 
		while(run) 
		{
			print();
			//USER ANSWER
			int input = keyboard.nextInt();
			//IF FOR EACH OPTION
			if(input == 1)
			{
				// CREATE VECTOR AND ADD
				add();
			}
			else if(input == 2)
			{
				// create vector and subtract
				subtract();
			}
			else if(input == 3)
			{
				// create vector and find magnitude
				createCalcVector();
				
			}
			else if(input ==9)
			{
				System.out.println("Goodbye");
				System.exit(0);
			}
			else
			{
				System.out.println("Whoops thats an invalid input. Try Again");
			}
			
		}

	}
	
	public static void print()
	{
		System.out.println("Enter 1. To Add 2 Vectors"
				+ "\nEnter 2. To Subtract 2 Vectors"
				+ "\nEnter 3. To Find the Magnitude of a Vector"
				+ "\nEnter 9. To Quit");
	}
	
	
	public static void add()
	{
		System.out.println("Enter the size of the Vectors");
		int size = keyboard.nextInt();
		if(size<=0)
				{
					System.out.println("Whoops, invalid input");
				}
		else 
		{
		double vector1[] = new double[size];
		System.out.println("Enter the values for Vector1.");
		// make forloop
		for(int i = 0; i<size;i++ )
		{
			//MAKE ARRAYS
			double num = keyboard.nextDouble();
			vector1[i] = num;
		}
		double vector2[] = new double[size];
		System.out.println("Enter the values for Vector2");
		for(int i=0;i<size;i++)
		{
			//MAKE ARRAY
			double num = keyboard.nextDouble();
			vector2[i] = num;
		}
		//ADD VECTORS TOGETHER
		//CREATE NEW ARRAY FOR SUM
		double[] sum = new double[size];
		for(int i=0; i<size;i++)
		{
			sum[i] = vector1[i] + vector2[i];
		}
		System.out.println("Result:");
		for(int i=0;i<size;i++)
		{
			System.out.println(vector1[i]);
		}
		System.out.println("+");
		for(int i=0;i<size;i++)
		{
			System.out.println(vector2[i]);
		}
		System.out.println("=");
		for(int i=0;i<size;i++)
		{
			System.out.println(sum[i]);
		}
		}
		
	}
	
	public static void subtract()
	{
		System.out.println("Enter the size of the Vectors");
		int size = keyboard.nextInt();
		if(size<=0)
				{
					System.out.println("Whoops, invalid input");
				}
		else 
		{
		double vector1[] = new double[size];
		System.out.println("Enter the values for Vector1.");
		// make forloop
		for(int i = 0; i<size;i++ )
		{
			//MAKE ARRAYS
			double num = keyboard.nextDouble();
			vector1[i] = num;
		}
		double vector2[] = new double[size];
		System.out.println("Enter the values for Vector2");
		for(int i=0;i<size;i++)
		{
			//MAKE ARRAY
			double num = keyboard.nextDouble();
			vector2[i] = num;
		}
		//SUBTRACT THE ARRAYSSSS STINKY
		//CREATE NEW ARRAY FOR DIFFERENCE
				double[] diff = new double[size];
				for(int i=0; i<size;i++)
				{
					diff[i] = vector1[i] - vector2[i];
				}
				System.out.println("Result:");
				for(int i=0;i<size;i++)
				{
					System.out.println(vector1[i]);
				}
				System.out.println("-");
				for(int i=0;i<size;i++)
				{
					System.out.println(vector2[i]);
				}
				System.out.println("=");
				for(int i=0;i<size;i++)
				{
					System.out.println(diff[i]);
				}
		}
	}
	
	public static void createCalcVector()
	{
		//MAKE VECTOR FOR OPTION 3
		System.out.println("Enter the size of the Vector");
		int size = keyboard.nextInt();
		if(size<=0)
				{
					System.out.println("Whoops, invalid input");
				}
		else 
		{
		double vector1[] = new double[size];
		System.out.println("Enter the values for the Vector.");
		//make forloop
		for(int i = 0; i<size;i++ )
		{
			//MAKE ARRAYS
			double num = keyboard.nextDouble();
			vector1[i] = num;
		}
		magnitude(vector1);
		System.out.println("The magnitude is "+magnitude(vector1));
		}
	}
	
	public static double magnitude(double[] vector)
	{
		//for loop to find magnitude of vector
		double magnitude = 0.0;
		for(int i=0;i<vector.length;i++)
		{
			magnitude += vector[i] * vector[i];
		}
		return Math.sqrt(magnitude);
	}
	

}

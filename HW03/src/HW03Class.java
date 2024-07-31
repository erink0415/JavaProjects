/*
 * Erin Kelly
 */
import java.util.Scanner;
public class HW03Class {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
//welcome user and get user input
		System.out.println("Welcome to Sorting Recatngles!");
		
		Rectangle[] collection = new Rectangle[0];
		double lengthInput = 0;
		double widthInput = 0;
		int size = 0;
		double avg = 0;
		double add =0;
		double smallestValue = 1000000000;
		double biggestValue = -1;
		//create boolean for while loop so it goes back to options
		boolean play = true;
		
		while(play)
		{
			System.out.println("Do you want to \n"
					+ "1. Enter rectangle data - both the size of the collection and each individual rectabgle's length and width \n"
					+ "2. Sort and display the rectangles' areas from smallest to largest \n"
					+ "3. Sort and display the rectangles' areas from largest to smallest \n"
					+ "4. Display the average area of the rectangles \n"
					+ "5. Display the minimum area in the collection \n"
					+ "6. Display the maximum area in the collection \n"
					+ "7. Quit the program");
			int answer = keyboard.nextInt();
			keyboard.nextLine();
			
			if(answer == 1) {
				System.out.println("How many rectangles do you want in your collection?");
				size = keyboard.nextInt();
				keyboard.nextLine();
		//create collection of rectangles
				collection = new Rectangle[size];
		//get length and width of rect's
				for(int i=0;i<collection.length;i++)
				{
					System.out.println("enter the length of rectangle "+i);
					lengthInput = keyboard.nextDouble();
	
					
					//width user input
					System.out.println("enter the width of rectangle "+i);
					widthInput = keyboard.nextDouble();
					//store rect dimensions in array
					collection[i] = new Rectangle(lengthInput, widthInput);
				}
			//sort display smallest to largest
			}else if(answer == 2){
				//if statement for no input 
				if(lengthInput <=0 || widthInput <=0)
				{
					System.out.println("whoops, you don't have valid input to sort. Choose option 1 to begin.");
					
				}else {
					
				boolean swapped = true;
						while(swapped)
						{
							swapped = false;
							for(int i = 0; i<collection.length-1; i++)
							{
								if(collection[i].getArea() > collection[i+1].getArea())
								{
									Rectangle temp = collection[i];
									collection[i] = collection[i+1];
									collection[i+1] = temp;
									swapped = true;
								}
							}
						}
						System.out.println("the sorted rectangles areas are");
						for(int i=0; i<collection.length; i++)
						{
							System.out.println(collection[i].getArea());
						}
				}
			}else if(answer == 3) {
				//if for no prior input
				if(lengthInput <=0 || widthInput <=0)
				{
					System.out.println("whoops, you don't have valid input to sort. Choose option 1 to begin.");
					
				}else {
				//sorting algorithm !!
				boolean swapped = true;
					while(swapped)
					{
						swapped = false;
						for(int i = 0; i<collection.length-1; i++)
						{
							if(collection[i].getArea() < collection[i+1].getArea())
							{
								Rectangle temp = collection[i];
								collection[i] = collection[i+1];
								collection[i+1] = temp;
								swapped = true;
							}
						}
					}
					for(int i=0; i<collection.length; i++)
					{
						System.out.println(collection[i].getArea());
					}
				}
			}else if(answer == 4) {
				//if for no prior input
				if(lengthInput <=0 || widthInput <=0)
				{
					System.out.println("whoops, you don't have valid input to sort. Choose option 1 to begin.");
					
				}else {
				System.out.println("find average");
				//make for loop to add the areas
				for(int i=0; i<collection.length; i++)
				{
					add += collection[i].getArea();
				}
				avg = add/size;
				System.out.println("The average of all the rectangles areas is "+avg);
				
				}
			}else if(answer == 5) {
				//if for no prior input
				if(lengthInput <=0 || widthInput <=0)
				{
					System.out.println("whoops, you don't have valid input to sort. Choose option 1 to begin.");
					
				}else {
					//find minimum area
					for(int i=0; i<collection.length; i++)
					{
						if(collection[i].getArea() < smallestValue)
						{
							smallestValue = collection[i].getArea();
						}
						
					}
					System.out.println("The minimum area is "+smallestValue);
				}
			}else if(answer == 6) {
				//if for no prior input
				if(lengthInput <=0 || widthInput <=0)
				{
					System.out.println("whoops, you don't have valid input to sort. Choose option 1 to begin.");
					
				}else {
					//find max area
					for(int i=0; i<collection.length; i++)
					{
						if(collection[i].getArea() > biggestValue)
						{
							biggestValue = collection[i].getArea();
						}
					}
					System.out.println("The maximum area is "+biggestValue);
				}
			}else if (answer == 7) {
				System.out.println("Goodbye!");
				System.exit(0);
				play = false;
			}else
			{
				System.out.println("Whoops, thats not an option. Try again.");
			}
		}
	}

}

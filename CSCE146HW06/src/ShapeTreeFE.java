//ERIN KELLY

import java.io.File;
import java.util.Scanner;

public class ShapeTreeFE {

	public static Scanner keyboard = new Scanner(System.in);
	public static LinkedBST<Shape> sBST = new LinkedBST<Shape>();
	public static final String DELIM = "\t";
	
	public static void main(String[] args) {
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
				readFile();
				sBST.printInorder();
				break;
			case 2:
				printTree();
				break;
			case 3:
				addShape();
				break;
			case 4:
				removeShape();
				break;
			case 5:
				search();
				break;
			case 6:
				findShape();
				break;
			case 7:
				removeShapeBigArea();
				break;
			case 8:
				printShapeToFile();
				break;
			case 0:
				System.out.println("Goodbye!");
				play = false;
				break;
			default:
				System.out.println("invalid input");
			}
		}
	}
	public static void printGreeting()
	{
		System.out.println("Welcome to the Shape Tree!");
	}
	public static void printChoices()
	{
		System.out.println("Enter 1. To Read a shape tree from a file"
				+ "\nEnter 2. to print a tree traversal to the console"
				+ "\nEnter 3. To add a shape"
				+ "\nEnter 4. to remove a shape"
				+ "\nEnter 5. to search for a shape"
				+ "\nEnter 6. to find the shape with the max area"
				+ "\nEnter 7. To remove all shapes greater than an area"
				+ "\nEnter 8. To print shape tree to a file"
				+ "\nEnter 0. to quit");
	}
	public static void readFile()
	{
		System.out.println("enter the name of your file");
		String fileName = keyboard.nextLine();
		System.out.println("Populating tree file");
		try
		{
			//Creates the scanner to read the file
			Scanner fileScanner = new Scanner(new File(fileName));
			//While there is a next line
			while(fileScanner.hasNextLine())
			{
				//Read the next line in the file
				String fileLine = fileScanner.nextLine();
				//Split said line based on the tab delimiter
				String[] splitLines = fileLine.split(DELIM);
				if(splitLines.length == 3 || splitLines.length == 2)
				{
					String type = splitLines[0];
					if(type.equalsIgnoreCase("rectangle"))
					{
						double info = Double.parseDouble(splitLines[1]);
						//System.out.println(info);
						double info2 = Double.parseDouble(splitLines[2]);
						//System.out.println(info2);
						Rectangle r = new Rectangle(type, info, info2, 0);
						r.area(info, info2);
						sBST.add(r);
					}
					else if(type.equalsIgnoreCase("right triangle"))
					{
						double info = Double.parseDouble(splitLines[1]);
						double info2 = Double.parseDouble(splitLines[2]);
						RightTriangle rt = new RightTriangle(type, info, info2, 0);
						rt.area(info, info2);
						sBST.add(rt);
					}
					else if(type.equalsIgnoreCase("circle"))
					{
						double info = Double.parseDouble(splitLines[1]);
						Circle c = new Circle(type, info, 0);
						
						c.area(info);
						sBST.add(c);
					}
				}
			}
			fileScanner.close();//Closes the file Scanner
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void printTree()
	{
		sBST.printInorder();
	}
	public static void addShape()
	{
		System.out.println("Enter the type of shape. \n"
				+ "Either \"circle\", \"right triangle\", or \"rectangle\"");
		String shape = keyboard.nextLine();
		
		//if to know how many doubles needed
		if(shape.equalsIgnoreCase("circle"))
		{
			System.out.println("Enter the radius");
			double radius = keyboard.nextDouble();
			keyboard.nextLine();
			//math to get area
			Circle c = new Circle(shape, radius, 0);
			c.area(radius);
			//adds shape
			sBST.add(c);
		}
		else if(shape.equalsIgnoreCase("right triangle"))
		{
			System.out.println("Enter the height");
			double height = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println("Enter the base");
			double base = keyboard.nextDouble();
			keyboard.nextLine();
			//math to get area
			RightTriangle rt = new RightTriangle(shape, base, height, 0);
			rt.area(base, height);
			//adds shape
			sBST.add(rt);
		}
		else if(shape.equalsIgnoreCase("rectangle"))
		{
			System.out.println("Enter the length");
			double length = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println("Enter the width");
			double width = keyboard.nextDouble();
			keyboard.nextLine();
			//math to get area
			Rectangle r = new Rectangle(shape, length, width, 0);
			r.area(length, width);
			//adds shape
			sBST.add(r);
		}
	}
	public static void removeShape()
	{
		System.out.println("What shape type would you like to remove?");
		String type = keyboard.nextLine();
		if(type.equalsIgnoreCase("circle"))
		{
			System.out.println("Enter the radius you want to remove");
			double radius = keyboard.nextDouble();
			Circle c = new Circle(type, radius, 0);
			c.area(radius);
			sBST.remove(c);
		}
		else if(type.equalsIgnoreCase("right triangle"))
		{
			System.out.println("Enter the base");
			double base = keyboard.nextDouble();
			System.out.println("Enter the height");
			double height = keyboard.nextDouble();
			RightTriangle rt = new RightTriangle(type, base, height, 0);
			rt.area(base, height);
			sBST.remove(rt);
		}
		else if(type.equalsIgnoreCase("rectangle"))
		{
			System.out.println("Enter the length");
			double length = keyboard.nextDouble();
			System.out.println("Enter the width");
			double width = keyboard.nextDouble();
			Rectangle r = new Rectangle(type, length, width, 0);
			r.area(length, width);
			sBST.remove(r);
		}
	}
	public static void search()
	{
		System.out.println("What shape type would you like to search for? "
				+ "\nExample: \"Circle\"");
		String type = keyboard.nextLine();
		if(type.equalsIgnoreCase("circle"))
		{
			System.out.println("Enter the radius");
			double radius = keyboard.nextDouble();
			Circle c = new Circle(type, radius, 0);
			c.area(radius);
			sBST.search(c);
			System.out.println(sBST.search(c));
		}
		else if(type.equalsIgnoreCase("right triangle"))
		{
			System.out.println("Enter the base");
			double base = keyboard.nextDouble();
			System.out.println("Enter the height");
			double height = keyboard.nextDouble();
			RightTriangle rt = new RightTriangle(type, base, height, 0);
			rt.area(base, height);
			sBST.search(rt);
			System.out.println(sBST.search(rt));
		}
		else if(type.equalsIgnoreCase("rectangle"))
		{
			System.out.println("Enter the length");
			double length = keyboard.nextDouble();
			System.out.println("Enter the width");
			double width = keyboard.nextDouble();
			Rectangle r = new Rectangle(type, length, width, 0);
			r.area(length, width);
			sBST.search(r);
			System.out.println(sBST.search(r));
		}
	}
	public static void findShape()
	{
		System.out.println("The shape with the max area: "+sBST.findMaxInTree());
	}
	public static void removeShapeBigArea()
	{
		System.out.println("Enter the maximum area");
		double max = keyboard.nextDouble();
		while(sBST.findMaxInTree().getArea() > max)
		{
			sBST.removeMax();
		}
	}
	public static void printShapeToFile()
	{
		System.out.println("Enter the name of the file.");
		String file = keyboard.nextLine();
		sBST.writeFile(file);
		
	}
}

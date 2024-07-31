/*
 * Erin Kelly
 */
package hw00;

import java.util.Scanner;

public class hw00Class {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
	//instructions for user
		System.out.println("Enter a 4-bit binary number to convert it to decimal form!");
		
	//4-digit binary input from user
		String input = keyboard.nextLine();
		

		int numberOne = 0;
	//digit 1 = 0 or 8
	if (input.charAt(0) == '0')
	{
		numberOne = 0;
		System.out.print("0");
	}
	else 
	{
		numberOne = 8;
		System.out.print("8");
	}
		
		int numberTwo = 0;
		
	//digit 2 = 0 or 4
	if (input.charAt(1) == '0')
	{
		numberTwo = 0;	
		System.out.print("0");
	}
	else 
	{
		numberTwo = 4;
		System.out.print("4");
	}
	
		int numberThree = 0;
		
	//digit 3 = 0 or 2
	if (input.charAt(2) == '0')
	{
		numberThree = 0;
		System.out.print("0");
	}
	else 
	{
		numberThree = 2;
		System.out.print("2");
	}
	
		int numberFour = 0;
		
	//digit 4 = 0 or 1
	if (input.charAt(3) == '0')
	{
		numberFour = 0;
		System.out.println("0");
	}
	else
	{
		numberFour = 1;
		System.out.println("1");
	}
	
	//Make a variable to add together the converted decimals. 
		int firstConvert = numberOne + numberTwo + numberThree + numberFour;
		
	//print out the decimal value for first input
		System.out.println("The decimal value of this binary is "+firstConvert+".");
	
	//prompt user to write second line of binary
		System.out.println("Now enter a second 4-bit binary code.");
	
	//Second line of binary input
		String inputTwo = keyboard.nextLine();
	
		int secondNumberOne = 0;
	//digit 1 = 0 or 8
	if (inputTwo.charAt(0) == '0')
	{
		secondNumberOne = 0;
		System.out.print("0");
	}
	else
	{
		secondNumberOne = 8;
		System.out.print("8");
	}
	
		int secondNumberTwo = 0;
	//digit 2 = 0 or 4
	if (inputTwo.charAt(1) == '0')
	{
		secondNumberTwo = 0;
		System.out.print("0");
	}
	else
	{
		secondNumberTwo = 4;
		System.out.print("4");
	}
	
		int secondNumberThree = 0;
	//digit 3 = 0 or 2
	if (inputTwo.charAt(2) == '0')
	{
		secondNumberThree = 0;
		System.out.print("0");
	}
	else
	{
		secondNumberThree = 2;
		System.out.print("2");
	}
	
		int secondNumberFour = 0;
	//digit 4 = 0 or 1
	if (inputTwo.charAt(3) == '0')
	{
		secondNumberFour = 0;
		System.out.println("0");
	}
	else
	{
		secondNumberFour = 1;
		System.out.println("1");
	}
	
	//make variable to add together second group of converted decimals
		int secondConvert = secondNumberOne + secondNumberTwo + secondNumberThree + secondNumberFour;
		
	//make computer print out the second decimal value
		System.out.println("The decimal value of this binary is "+secondConvert+".");
	
	//Now add both converted decimals together
		int totalConvert = firstConvert + secondConvert;
		
	//give the final output
		System.out.println("The total decimal value of both 4-bit binary numbers is "+totalConvert+".");
	}

}

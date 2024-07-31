/*
 * ERIN KELLY
 */
import java.util.Scanner;

public class CoffeeTester {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		String nameTwo;
		int caffeine;
		int caffeineTwo;
		
		//prompt user
		System.out.println("How much coffee can you drink?");
		System.out.println("What's the name of the first coffee?");
		//get variable
		name = keyboard.nextLine();
		//prompt user
		System.out.println("What's the caffeine content?");
		//get variable
		caffeine = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("");
		System.out.println("What's the name of the second coffee?");
		nameTwo = keyboard.nextLine();
		System.out.println("What's the caffeine content?");
		caffeineTwo = keyboard.nextInt();
				
		Coffee coffee01 = new Coffee(name, caffeine);
		Coffee coffee02 = new Coffee(nameTwo, caffeineTwo);
		
		System.out.println("It would take "+coffee01.riskyAmount()+" "+coffee01.getName()+" before it's dangerous to drink more.");
		System.out.println("It would take "+coffee02.riskyAmount()+" "+coffee02.getName()+" before it's dangerous to drink more.");
	}

}

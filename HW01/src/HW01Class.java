/*
 * Erin Kelly
 */
import java.util.Scanner;

public class HW01Class {

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
		
	System.out.println("Welcome! You get to go on an adventure! Enter \"yes\" to begin");
	
	String optionOne = keyboard.nextLine();
	
//Start adventure
	if (optionOne.equalsIgnoreCase("yes"))
	{
		System.out.println("After your last class of the day, you walk outside to find"
				+ " a mysterious cave has appeared in the road. Do you \"enter\" or \"leave\"?");
	//option two of adv. enter
		String optionTwo = keyboard.nextLine();
		if (optionTwo.equalsIgnoreCase("enter"))
		{
			System.out.println("You see a bright light from the other side. "
					+ "You can finish going through the cave or go through a dark path to your right. \nDo you go \"right\" or \"straight\".");
	//option four of adv. straight
			String optionFour = keyboard.nextLine();
			if (optionFour.equalsIgnoreCase("straight"))
			{
				System.out.println("You slowly walk out to see that you're now in the middle of a wizard battle! \n"
						+ "A door shuts behind you! Do you hide along the edges of the colloseum or charge into battle? \n"
						+ "Enter \"charge\" or \"hide\".");
	//option five of adv. hide
				String optionFive = keyboard.nextLine();
				if (optionFive.equalsIgnoreCase("hide"))
				{
					System.out.println("While hiding, you look around to see what's surrounding you. \n"
							+ "You see a pile of weapons; swords, wands, nunchucks, axes, etc. \n"
							+ "You run to get some. How many weapons do you grab?");
	//option six of adv. how many weapons?
					int optionSix = keyboard.nextInt();
					keyboard.nextLine();
			//<= 2 weapons
					if (optionSix <= 2 && optionSix > 0)
					{
						System.out.println("You grab your choice of weapon and join the battle!"
								+ " Do you go after the big, buff wizard or little wizard? \n"
								+ "Enter \"buff wizard\" or \"little wizard\".");
	//option seven of adv. Attack big guy
						String optionSeven = keyboard.nextLine();
						if (optionSeven.equalsIgnoreCase("buff wizard"))
						{
							System.out.println("He's more bark than bite! You take him down! \n"
									+ "You intimidate the little wizard and catch him off gaurd! \n"
									+ "You win the battle! As your prize, you can choose to explore "
									+ "the magical world or go back home. \nEnter \"explore\" or \"go home\"");
	//option eight of adv. explore
							String optionEight = keyboard.nextLine();
							if (optionEight.equalsIgnoreCase("explore"))
							{
								System.out.println("Yay! You get to explore this magical world. The people in "
										+ "power offer to give you a guided tour. Do you go on the tour or explore "
										+ "on your own? \nEnter \"tour\" or \"exlore alone\"");
	//option nine of adv. tour
								String optionNine = keyboard.nextLine();
								if (optionNine.equalsIgnoreCase("tour"))
								{
									System.out.println("Yay! You get a guided tour. Do you want to explore the castle or the city? \nEnter \"castle\" or \"city\"");
	//option ten of adv. tour city
									String optionTen = keyboard.nextLine();
									if (optionTen.equalsIgnoreCase("city"))
									{
										System.out.println("While getting a tour of the city, the people in power keep bringing you through spooky alleyways. \n"
												+ "Do you run away from the tour or stay with the tour? \n"
												+ "Enter \"stay\" or \"run away\"");
	//option eleven of adv. stay with tour
										String optionEleven = keyboard.nextLine();
										if (optionEleven.equalsIgnoreCase("stay"))
										{
											System.out.println("Oh no! You should've left when you had the chance. \n"
													+ "They use the next alleyway to kidnap you and throw you in the dungeon for life!");
											System.exit(0);
										}
	//option eleven; leave tour
										else if (optionEleven.equalsIgnoreCase("run away"));
										{
											System.out.println("You leave the tour and wander around until you find the cave where you entered. \n"
													+ "You decide to go back to your normal life. Goodbye!");
											System.exit(0);
										}
									}
	//option ten; castle
									else if (optionTen.equalsIgnoreCase("castle"))
									{
										System.out.println("Oh no! It was a trap. The people in power don't like that a mortal won the wizard battle. \n"
												+ "They throw you in the dungeon for the rest of your life.");
										System.exit(0);
									}
								}
	//option nine; explore alone
								else if (optionNine.equalsIgnoreCase("explore alone"))
								{
									System.out.println("You wander around the city and eventually find your way back to the cave where you entered. \n"
											+ "You decide to stay in the magical city! Congratulations on your new life!");
									System.exit(0);
								}
							}
	//option eight; go home
							else if (optionEight.equalsIgnoreCase("go home"))
							{
								System.out.println("You go back through the cave and live your normal life! Your adventure is over.");
								System.exit(0);
							}
						}
	//option seven; lil wizard
						else if (optionSeven.equalsIgnoreCase("little wizard"))
						{
							System.out.println("He's more powerful than you thought! You lose the fight.");
							System.exit(0);
						}
							
					}
	//option six >= 3 weapons
					else if (optionSix >= 3)
					{
						System.out.println("While trying to pick up and wield all of your weapons, "
								+ "the wizards find you and use a spell to put you to sleep! You lose.");
						System.exit(0);
					}
				}
	//option five; Charge in battle
				else if (optionFive.equalsIgnoreCase("charge"))
				{
					System.out.println("Oh no! You overestimated your strength! The wizards blast "
							+ "you and put you in jail for interferring with the battle. Your adventure is over");
					System.exit(0);
				}
			}
	//option four; right in cave
			else if (optionFour.equalsIgnoreCase("right"))
			{
				System.out.println("It's pitch black, so you walk with the walls for what feel like an hour. "
						+ "You eventually come back to the main part of the cave, but there's only one way to go now. \n"
						+ "Out the way you came. You leave and continue your normal life. Goodbye!");
				System.exit(0);
			}
		}
	//option two; leave cave
		else if (optionTwo.equalsIgnoreCase("leave"))
		{
			System.out.println("Oh no! While walking away from the cave, you forget to \n"
					+ "check if you're allowed to cross the street! You made it past the \n"
					+ "cars but are tired from the adrenaline. You go home and sleep. Goodbye.");
			System.exit(0);
		}
	}
	
	}

}

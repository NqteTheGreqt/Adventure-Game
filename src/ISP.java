import java.util.Scanner;

/* Names: Nathan and Guntaas
 * Date: May 28, 2019
 * ISP
 * This program is a choose your own adventure game where the user needs to escape the woods.  The player has three chances to escape.  
 * If they don't escape, it's game over.
 * This program contains many components.  Here are some and their functions:
 * If statements: Choose between one option or another based on the user's input
 * Case statements: Choose between three or more options based on the user's input
 * do while loop: runs through the program once before checking if the loop should be repeated, then repeats if needed
 * while (true) / try catch: This is a way of searching for errors, such as entering the wrong letter.  These are crucial.  If the user makes a mistake, he/she does not have to restart the program, there will simply be
 * a message saying "error: Enter A or B" or something similar
 * Math.random: This is used to generate a random number that is used to make a decision
 * There will be a line of code after every win/lose branch saying "decision = "D";"  All this does is set the variable so that it does not enter any other decision structures in the code and instead skips to the while at the end 
 */

public class ISP {

	public static void main(String[] args) {
		String decision = null; //Variable for all of the user's decisions
		double randomNumber = 0.0; //Variable for the random number that will be used
		String playAgain = null; //Variable for if the user would like to play again
		//Declares and initializes variables
		
		Scanner scan = new Scanner(System.in); //Sets up scanner
		
		do {
			System.out.println("Welcome to our choose your own adventure game.  "
					+ "In this game you will need to escape the woods, so get ready and choose wisely. \n");			
			System.out.println("Welcome.");
			System.out.println("Let the game begin...");
			System.out.println("You wake up surrounded by trees.");
			System.out.println("You have no memory of anything related to your current situation.");
			System.out.println("You look around and you see a tree fallen over.");
			System.out.println("You don't know why, but that seems odd.");
			System.out.println("You're lost and you don't know how to get out.");
			System.out.println("It's clear that you're deep in the forest and you need to get out.");
			System.out.println("You see a different tree that you think you can climb.");
			System.out.println("You think to yourself, 'Maybe I can look for a way out if I climb'.");
			System.out.println("At the same time, you realize that the tree is pretty high up and you could fall.");
			System.out.println("A less risky option would be to start walking and figure out how to get out as you go.");
			System.out.println("A - Start climbing the tree");
			System.out.println("B - Start walking");
			System.out.print("Enter A or B: ");
			
			while (true) {
				try {
				decision = scan.next(); //Scans the decision
				decision = decision.toUpperCase(); //Converts decision to upper case
				
				if (decision.charAt(0) =='A'|| decision.charAt(0)=='B') {
					break;
				} //End of if statement to verify that input is correct
					
				else {
					System.out.print("Invalid entry.  Enter A or B: ");
				} //End of else to give an error message if input is incorrect 
			
				} catch (Exception e) {
				
				System.out.print("Error.  Enter A or B: ");
				scan.next(); //Clears scanner
				
				} //End of try catch to detect errors
				
			} //End of while loop to detect errors
			
			if (decision.charAt(0) == 'A') {
				System.out.println("\nSuccess!  You made your way up the tree without falling and now you can see the whole forest.");
				System.out.println("The forest is massive, it seems like it goes forever in all directions.");
				System.out.println("In one direction you see the edge of the forest and it's pretty far away, but in the other direction,"
						+ " you see smoke a lot closer to you than the end of the forest.");
				System.out.println("Should you towards the smoke in hopes of finding someone to help you,"
						+ " or do you start walking towards the edge of the forest?");
				System.out.println("A - Go towards the smoke");
				System.out.println("B - Start walking towards the edge of the forest");
				System.out.print("Enter A or B: ");
				
				while (true) {
					try {
						decision = scan.next(); //Scans the decision
						decision = decision.toUpperCase(); //Converts decision to upper case
						
						if (decision.charAt(0) == 'A'|| decision.charAt(0) == 'B') {
							break;
						} //End of if statement to verify that input is correct
						
						else {
							System.out.print("Invalid entry.  Enter A or B: ");
						} //End of else to give an error message if input is incorrect 
						
					} catch (Exception e) {
						
						System.out.print("Error.  Enter A or B");
						scan.next(); //Clears scanner
						
					} //End of try catch to detect errors
					
				} //End of while loop to detect errors				
				
				if (decision.charAt(0) == 'A') {
					System.out.println("\nYou decide that it's a good idea to go towards the smoke.  The smoke could be coming from a campfire or a forest fire.");
					System.out.println("That means there should be someone there.");
					System.out.println("It takes you about 20 minutes to walk over to the fire.");
					System.out.println("As you approach the campfire, you see a hooded figure next to a campfire.");
					System.out.println("The hooded figure has a torch in its hand and it seems creepy.");
					System.out.println("You're not sure if you should ask the figure for directions or try to find your own way out.");
					System.out.println("The hooded figure seems scary, but you never know until you talk to them.");
					System.out.println("At the same time, you have no idea how to get out of the forest.");
					System.out.println("You could go in the other direction and find your own way out,"
							+ " or you can approach the hooded figure in hope of getting directions.");
					System.out.println("A - Go in the other direction and find your own way out");
					System.out.println("B - Approach the hooded figure");
					System.out.print("Enter A or B: ");
					
					while (true) {
						try {
							decision = scan.next(); //Scans the decision
							decision = decision.toUpperCase(); //Converts decision to upper case
							
							if (decision.charAt(0) == 'A'|| decision.charAt(0) == 'B') {
								break;
							} //End of if statement to verify that input is correct
							else {
								System.out.print("Invalid entry.  Enter A or B: ");
							} //End of else to give an error message if input is incorrect 
							
						} catch (Exception e) {
							System.out.print("Error.  Enter A or B");
							scan.next(); //Clears scanner
						} //End of try catch to detect errors
						
					} //End of while loop to detect errors
					
					if (decision.charAt(0) == 'A') {
						System.out.println("\nYou decided to go in the other direction because the hooded figure seemed creepy.");
						System.out.println("You find a path that looks promising so you follow it.");
						System.out.println("After a few minutes on the path, there's a fork in the path.");
						System.out.println("The path branches into three other paths.  One goes left, one goes straight and one goes right.");
						System.out.println("You can't see anything important down any of the paths.");
						System.out.println("You have a big decision to make, so choose wisely.");
						System.out.println("L - Left");
						System.out.println("S - Straight");
						System.out.println("R - Right");
						System.out.print("Enter L, S or R: ");
						
						while (true) {
							try {
								decision = scan.next(); //Scans the decision
								decision = decision.toUpperCase(); //Converts decision to upper case
								
								if (decision.charAt(0) == 'L'|| decision.charAt(0) == 'S'|| decision.charAt(0) == 'R') {
									break;
								} //End of if statement to verify that input is correct
								
								else {
									System.out.print("Invalid entry.  Enter L, S or R: ");
								} //End of else to give an error message if input is incorrect 
								
							} catch (Exception e) {
								System.out.print("Error.  Enter L, S or R");
								scan.next(); //Clears scanner
							} //End of try catch to detect errors
							
						} //End of while loop to detect errors
						
						switch (decision) {
						case "L":
							System.out.println("\nYou had a good feeling about the left path so you went left.");					
							System.out.println("You've been walking for an hour on this path and you start to feel very hungry."
									+ "  You haven't seen any food on the path.");
							System.out.println("There probably won't be food on the path if you keep walking in the same direction."
									+ "  You might have to go off path if you want food.");
							System.out.println("You could also keep going in the same direction and hope that the end of the forest in nearby."
									+ "  You should be able to find food if you get out of the forest.");
							System.out.println("A - Go off path to look for food");
							System.out.println("B - Keep going in the same direction.");
							System.out.print("Enter A or B: ");
							
							while (true) {
								try {
								decision = scan.next(); //Scans the decision
								decision = decision.toUpperCase(); //Converts decision to upper case
								
								if (decision.charAt(0) =='A'|| decision.charAt(0)=='B') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter A or B: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter A or B: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							if (decision.charAt(0) == 'A') {
								System.out.println("\nYou went off path to look for food."
										+ "  The terrain is tough, lots of roots and bushes you need to navigate around.");
								System.out.println("At last, you come across some berries.  There are plenty of them.");
								System.out.println("You're starving and desperate for food, but you never know what can happen when you eat wild food.");
								System.out.println("A - Eat the berries");
								System.out.println("B - Don't eat the berries");
								System.out.print("Enter A or B: ");
								
								while (true) {
									try {
									decision = scan.next(); //Scans the decision
									decision = decision.toUpperCase(); //Converts decision to upper case
									
									if (decision.charAt(0) =='A'|| decision.charAt(0)=='B') {
										break;
									} //End of if statement to verify that input is correct
										
									else {
										System.out.print("Invalid entry.  Enter A or B: ");
									} //End of else to give an error message if input is incorrect 
								
									} catch (Exception e) {
									
									System.out.print("Error.  Enter A or B: ");
									scan.next(); //Clears scanner
									
									} //End of try catch to detect errors
									
								}//End of while loop to detect errors
								
								if (decision.charAt(0) == 'A') {
									System.out.println("\nYou decided to take the risk and eat the berries.  If they turn out to be poisonous,"
											+ " you could die from poison.");
									System.out.println("At the same time, if you didn't eat the berries, you could die of starvation.");
									System.out.println("The berries really energized you and you feel refreshed."
											+ "  You make your way back to the path and go in the same direction as before.");
									System.out.println("3 hours later...");
									System.out.println("It's been 3 hours and there haven't been any forks in the path.  The path has gone on forever.");
									System.out.println("But you aren't giving up, you can feel it that you'll get out of the forest soon.");
									System.out.println("You see some light towards the end of the path.  You already know what that means,"
											+ " it's the end of the forest!");
									System.out.println("You start running towards the light.  You're out of the forest.  Finally!");
									System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");
									
									while (true) {
										try {
										playAgain = scan.next(); //Scans the decision
										playAgain = playAgain.toUpperCase(); //Converts decision to upper case
										
										if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
											break;
										} //End of if statement to verify that input is correct
											
										else {
											System.out.print("Invalid entry.  Enter Y or N: ");
										} //End of else to give an error message if input is incorrect 
									
										} catch (Exception e) {
										
										System.out.print("Error.  Enter Y or N: ");
										scan.next(); //Clears scanner
										
										} //End of try catch to detect errors
										
									} //End of while loop to detect errors
									
									decision = "D";
																
								} //End of if statement for when the user decides to eat the berries (Level 6)
								
								if (decision.charAt(0) == 'B') {
									System.out.println("\nYou decided that it's too much of a risk to eat the berries.  They could be poisonous, you never know.");
									System.out.println("As you walk along the path you start to feel very tired."
											+ "  You're still starving since you didn't eat the berries.");
									System.out.println("You start to feel very dizzy.  You stop walking and lie down next to a tree."
											+ "  You instantly fall asleep, but you don't wake up.");
									System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
									
									while (true) {
										try {
										playAgain = scan.next(); //Scans the decision
										playAgain = playAgain.toUpperCase(); //Converts decision to upper case
										
										if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
											break;
										} //End of if statement to verify that input is correct
											
										else {
											System.out.print("Invalid entry.  Enter Y or N: ");
										} //End of else to give an error message if input is incorrect 
									
										} catch (Exception e) {
										
										System.out.print("Error.  Enter Y or N: ");
										scan.next(); //Clears scanner
										
										} //End of try catch to detect errors
										
									} //End of while loop to detect errors
									
									decision = "D";

								} //End of if statement for when the user decides not to eat the berries (Level 6)
								
							} //End of if statement for when the user decides to go off path to look for food (Level 5)
							
							if (decision.charAt(0) == 'B') {
								System.out.println("\nYou decided not to go off path.  It's a bad idea,"
										+ " there could be bears and wolves if you go deep into the forest.");
								System.out.println("As you walk along the path, you start to notice that there are a ton of leaves along the path."
										+ "  You think nothing of this.");
								System.out.println("All of a sudden, you step on something metallic.  All of a sudden, you can't feel your leg."
										+ "  You look down and you see your leg covered in blood.");
								System.out.println("You stepped in a bear trap!  You shriek in pain, but you can't do anything about it,"
										+ " the trap won't come off.");
								System.out.println("You can't keep walking with it on you, the weight is too heavy.  You're losing even more blood now,"
										+ " and you start to feel light headed.  You pass out and don't wake up.");
								System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
								
								while (true) {
									try {
									playAgain = scan.next(); //Scans the decision
									playAgain = playAgain.toUpperCase(); //Converts decision to upper case
									
									if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
										break;
									} //End of if statement to verify that input is correct
										
									else {
										System.out.print("Invalid entry.  Enter Y or N: ");
									} //End of else to give an error message if input is incorrect 
								
									} catch (Exception e) {
									
									System.out.print("Error.  Enter Y or N: ");
									scan.next(); //Clears scanner
									
									} //End of try catch to detect errors
									
								} //End of while loop to detect errors
								
								decision = "D";
								
							} //End of if statement for when the user decides to keep going in the same direction (Level 5)
							
							break;
						case "S":
							System.out.println("\nYou decided to go straight because you feel like you're going in the right direction.");
							System.out.println("1 hour later...");
							System.out.println("You're not feeling very good about continuing on this path.  You could turn around and go on another path,"
									+ " or you could keep going on the same path.");
							System.out.println("A - Turn around");
							System.out.println("B - Keep going on the same path");
							System.out.print("Enter A or B: ");
							
							while (true) {
								try {
								decision = scan.next(); //Scans the decision
								decision = decision.toUpperCase(); //Converts decision to upper case
								
								if (decision.charAt(0) == 'A' || decision.charAt(0) == 'B') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter A or B: ");
								} //End of else to give an error message if input is incorrect
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter A or B: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							if (decision.charAt(0) == 'A') {								
								
								System.out.println("\nYou decided to go back to the fork in the path so that you can go left or right instead of going straight.");
								System.out.println("You have a big decision to make, so choose wisely.");
								System.out.println("L - Left");
								System.out.println("R - Right");
								System.out.print("Enter L or R: ");
								
								while (true) {
									try {
										decision = scan.next(); //Scans the decision
										decision = decision.toUpperCase(); //Converts decision to upper case
										
										if (decision.charAt(0) == 'L'|| decision.charAt(0) == 'R') {
											break;
										} //End of if statement to verify that input is correct
										
										else {
											System.out.print("Invalid entry.  Enter L or R: ");
										} //End of else to give an error message if input is incorrect
										
									} catch (Exception e) {
										System.out.print("Error.  Enter L or R");
										scan.next(); //Clears scanner
									} //End of try catch to detect errors
									
								} //End of while loop to detect errors
								
								if (decision.charAt(0) == 'L') {
									System.out.println("\nYou had a good feeling about the left path so you went left.");					
									System.out.println("You've been walking for an hour on this path and you start to feel very hungry."
											+ "  You haven't seen any food on the path.");
									System.out.println("There probably won't be food on the path if you keep walking in the same direction."
											+ "  You might have to go off path if you want food.");
									System.out.println("You could also keep going in the same direction and hope that the end of the forest"
											+ " in nearby.  You should be able to find food i fyou get out of the forest.");
									System.out.println("A - Go off path to look for food");
									System.out.println("B - Keep going in the same direction.");
									System.out.print("Enter A or B: ");
									
									while (true) {
										try {
										decision = scan.next(); //Scans the decision
										decision = decision.toUpperCase(); //Converts decision to upper case
										
										if (decision.charAt(0) == 'A' || decision.charAt(0) == 'B') {
											break;
										} //End of if statement to verify that input is correct
											
										else {
											System.out.print("Invalid entry.  Enter A or B: ");
										} //End of else to give an error message if input is incorrect
									
										} catch (Exception e) {
										
										System.out.print("Error.  Enter A or B: ");
										scan.next(); //Clears scanner
										
										} //End of try catch to detect errors
										
									} //End of while loop to detect errors
									
									if (decision.charAt(0) == 'A') {
										System.out.println("\nYou went off path to look for food.  The terrain is tough,"
												+ " lots of roots and bushes you need to navigate around.");
										System.out.println("At last, you come across some berries.  There are plenty of them.");
										System.out.println("A - Eat the berries");
										System.out.println("B - Don't eat the berries");
										System.out.print("Enter A or B: ");
										
										while (true) {
											try {
											decision = scan.next(); //Scans the decision
											decision = decision.toUpperCase(); //Converts decision to upper case
											
											if (decision.charAt(0) =='A' || decision.charAt(0) == 'B') {
												break;
											} //End of if statement to verify that input is correct
												
											else {
												System.out.print("Invalid entry.  Enter A or B: ");
											} //End of else to give an error message if input is incorrect 
										
											} catch (Exception e) {
											
											System.out.print("Error.  Enter A or B: ");
											scan.next(); //Clears scanner
											
											} //End of try catch to detect errors
											
										} //End of while loop to detect errors
										
										if (decision.charAt(0) == 'A') {
											System.out.println("\nYou decided to take the risk and eat the berries.  If they turn out to be poisonous,"
													+ " you could die from poison.");
											System.out.println("At the same time, if you didn't eat the berries, you could die of starvation.");
											System.out.println("The berries really energized you and you feel refreshed."
													+ "  You make your way back to the path and go in the same direction as before.");
											System.out.println("3 hours later...");
											System.out.println("It's been 3 hours and there haven't been any forks in the path.  The path has gone on forever.");
											System.out.println("But you aren't giving up, you can feel it that you'll get out of the forest soon.");
											System.out.println("You see some light towards the end of the path.  You already know what that means,"
													+ " it's the end of the forest!");
											System.out.println("You start running towards the light.  You're out of the forest.  Finally!");
											System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");																		
											
											while (true) {
												try {
												playAgain = scan.next(); //Scans the decision
												playAgain = playAgain.toUpperCase(); //Converts decision to upper case
												
												if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
													break;
												} //End of if statement to verify that input is correct
													
												else {
													System.out.print("Invalid entry.  Enter Y or N: ");
												} //End of else to give an error message if input is incorrect 
											
												} catch (Exception e) {
												
												System.out.print("Error.  Enter Y or N: ");
												scan.next(); //Clears scanner
												
												} //End of try catch to detect errors
												
											} //End of while loop to detect errors
											
											decision = "D";
											
										} //End of if statement for when the user decides to eat the berries (Level 7)
										
										if (decision.charAt(0) == 'B') {
											System.out.println("\nIt's too much of a risk to eat the berries, so you don't eat them."
													+ "  You walk back to the path and continue walking in the same direction as before.");
											System.out.println("You're starving but you need to keep going.  You're trying to stay on your feet,"
													+ " but the hunger is taking you over.");
											System.out.println("You collapse to the ground, exhausted.  You try to get up off the ground, but you can't."
													+ "  You hear a roar very close by, and that's the last thing you hear.");
											System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
											
											while (true) {
												try {
												playAgain = scan.next(); //Scans the decision
												playAgain = playAgain.toUpperCase(); //Converts decision to upper case
												
												if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
													break;
												} //End of if statement to verify that input is correct
													
												else {
													System.out.print("Invalid entry.  Enter Y or N: ");
												} //End of else to give an error message if input is incorrect 
											
												} catch (Exception e) {
												
												System.out.print("Error.  Enter Y or N: ");
												scan.next(); //Clears scanner
												
												} //End of try catch to detect errors
												
											} //End of while loop to detect errors
											
											decision = "D";
											
										} //End of if statement for when the user decides not to eat the berries (Level 8)
										
									} //End of if statement for when the user decides to go off path to look for food (Level 7)
									
									if (decision.charAt(0) == 'B') {
										System.out.println("\nYou keep going in the same direction, you can't get distracted by food.");
										System.out.println("A few hours later, you're feeling hungry, but this time, you can't resist."
												+ "  You go off path into the forest to look for some food.  You don't see any fruits.");
										System.out.println("You don't see any food except for some deer off in the distance."
												+ "  If you had a weapon and supplies for a fire, you could kill a deer, cook it and eat it.");
										System.out.println("You have no choice but to go back to the path and keep walking."
												+ "  You're feeling very hungry and tired and you're having a tough time staying on your feet.");
										System.out.println("You collapse to the ground after a few minutes of walking.");
										System.out.println("You can't get off the ground because of all the pain.");
										System.out.println("You begin to drift off into sleep, but you don't wake up.");
										System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
										
										while (true) {
											try {
											playAgain = scan.next(); //Scans the decision
											playAgain = playAgain.toUpperCase(); //Converts decision to upper case
											
											if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
												break;
											} //End of if statement to verify that input is correct
												
											else {
												System.out.print("Invalid entry.  Enter Y or N: ");
											} //End of else to give an error message if input is incorrect 
										
											} catch (Exception e) {
											
											System.out.print("Error.  Enter Y or N: ");
											scan.next(); //Clears scanner
											
											} //End of try catch to detect errors
											
										} //End of while loop to detect errors
										
										decision = "D";
										
									} //End of if statement for when the user decides to go in the same direction (Level 7)
									
								} //End of if statement for when the user decides to left (Level 6)
								
								if (decision.charAt(0) == 'R') {
									System.out.println("\nYou had a good feeling about the right path so you went right.");					
									System.out.println("You've been walking for half an hour on this path and you are really thirsty.");
									System.out.println("As you keep walking you see some water up the path as you run to the water you realize it is a swamp and"
											+ " the water is really dirty, before you tried to man up and drink the dirty water a green, tall, incredibly"
											+ " handsome man approaches you, He had a white muscle shirt to show off his bulging biceps");
									System.out.println("This beautiful creature provides you with a home cooked stew and some fresh water, he asks what you"
											+ " were doing in the forest all alone. You explain how you are lost and are trying to get out of the forest");
									System.out.println("This kind devilishly handsome man directs you out of the forest and asks you to visit next time you"
											+ " get lost.");
									System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");
									
									while (true) {
										try {
										playAgain = scan.next(); //Scans the decision
										playAgain = playAgain.toUpperCase(); //Converts decision to upper case
										
										if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
											break;
										} //End of if statement to verify that input is correct
											
										else {
											System.out.print("Invalid entry.  Enter Y or N: ");
										} //End of else to give an error message if input is incorrect 
									
										} catch (Exception e) {
										
										System.out.print("Error.  Enter Y or N: ");
										scan.next(); //Clears scanner
										
										} //End of try catch to detect errors
										
									} //End of while loop to detect errors
									
									decision = "D";
									
								} //End of if statement for when the user decides to go right (Level 6)
								
							} //End of if statement for when the user decides to turn around (Level 5)
							
							if (decision.charAt(0) == 'B') {
								System.out.println("\nYou're confident about the path you're on so you keep following it.");
								System.out.println("The path is very rough and you're feeling tired from all the walking.  You decide to sit down for a rest.");
								System.out.println("As you rest, you think about life.  Why are you in the forest?  Who even are you?");
								System.out.println("Nothing makes sense anymore.  You drift off into sleep.  When you wake up you start to feel very itchy."
										+ "  There are a ton of red ants and mosquitoes all over you.");
								System.out.println("You get them all off you and you can already tell that you've lost a lot of blood.  You already know you"
										+ " don't have enough.  If you move, you feel light headed.");
								System.out.println("You feel sleepy so you lie down.  You hope this is all a dream.  You drift off and don't wake up again.");
								System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
								
								while (true) {
									try {
									playAgain = scan.next(); //Scans the decision
									playAgain = playAgain.toUpperCase(); //Converts decision to upper case
									
									if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
										break;
									} //End of if statement to verify that input is correct
										
									else {
										System.out.print("Invalid entry.  Enter Y or N: ");
									} //End of else to give an error message if input is incorrect 
								
									} catch (Exception e) {
									
									System.out.print("Error.  Enter Y or N: ");
									scan.next(); //Clears scanner
									
									} //End of try catch to detect errors
									
								} //End of while loop to detect errors
								
								decision = "D";
								
							} //End of if statement for when the user decides to keep going on the same path (Level 5)
							
							break;	
						case "R":
							System.out.println("\nYou had a good feeling about the right path so you went right.");					
							System.out.println("You've been walking for half an hour on this path and you are really thirsty.");
							System.out.println("As you keep walking you see some water up the path as you run to the water you realize it is a swamp"
									+ " and the water is really dirty, before you tried to man up and drink the dirty water a green, tall, incredibly handsome"
									+ " man approaches you, He had a white muscle shirt to show off his bulging biceps");
							System.out.println("This beautiful creature provides you with a home cooked stew and some fresh water,"
									+ " he asks what you were doing in the forest all alone. You explain how you are lost and are trying to get out of the forest");
							System.out.println("This kind devilishly handsome man directs you out of the forest and asks you to visit next time you get lost.");
							System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");
							
							while (true) {
								try {
								playAgain = scan.next(); //Scans the decision
								playAgain = playAgain.toUpperCase(); //Converts decision to upper case
								
								if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter Y or N: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter Y or N: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							decision = "D";
							
							break;
						default:
							System.out.println("You should not be seeing this message.  If you do, please contact Nathan Philippon or Guntaas Mangat.");
							break;							
						} //End of case statement for when the user has to decide between left, straight and right (Level 4)
						
					} //End of if statement for when the user decides to go in the other direction and find their own way out (Level 3)
					
					if (decision.charAt(0) == 'B') {
						System.out.println("\nThe hooded figure seems creepy, but you take a chance and approach it.");
						System.out.println("It's tall and skinny.  As you get closer, you can see that it's an old man.");
						System.out.println("He sees you and you see him.  You say hello, but he doesn't say anything,"
								+ " so you sit down on a log next to the fire.");
						System.out.println("You notice food on the fire and that reminds you of how hungry you are.  You want to ask to eat some,"
								+ " but you haven't even talked to the man yet.");
						System.out.println("After a few minutes of warming up by the fire, you ask the man if he can guide you out of the forest."
								+ "  The man says yes and he guides you out.");
						System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");
						
						while (true) {
							try {
							playAgain = scan.next(); //Scans the decision
							playAgain = playAgain.toUpperCase(); //Converts decision to upper case
							
							if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
								break;
							} //End of if statement to verify that input is correct
								
							else {
								System.out.print("Invalid entry.  Enter Y or N: ");
							} //End of else to give an error message if input is incorrect 
						
							} catch (Exception e) {
							
							System.out.print("Error.  Enter Y or N: ");
							scan.next(); //Clears scanner
							
							} //End of try catch to detect errors
							
						} //End of while loop to detect errors
						
						decision = "D";
						
					} //End of if statement for when the user decides to approach the hooded figure (Level 3)
					
				} //End of if statement for when the user decides to go towards the smoke (Level 2)
				
				if (decision.charAt(0) == 'B') {
					System.out.println("\nYou start walking towards the edge of the forest, but you hear wolves howling in the distance.");
					System.out.println("They will be in your way if you keep going in the same direction.  You might be able to sneak past them,"
							+ " but who knows how many there are?");
					System.out.println("If you stay where you are, the wolves might see you and attack.");
					System.out.println("You could go back to the tree and climb up to avoid the wolves.");
					System.out.println("A - Try to sneak past the wolves");
					System.out.println("B - Stay where you are");
					System.out.println("C - Go back to the tree");
					System.out.print("Enter A, B or C: ");
					
					while (true) {
						try {
						decision = scan.next(); //Scans the decision
						decision = decision.toUpperCase(); //Converts decision to upper case
						
						if (decision.charAt(0) =='A' || decision.charAt(0) == 'B' || decision.charAt(0) == 'C') {
							break;
						} //End of if statement to verify that input is correct
							
						else {
							System.out.print("Invalid entry.  Enter A, B or C: ");
						} //End of else to give an error message if input is incorrect 
					
						} catch (Exception e) {
						
						System.out.print("Error.  Enter A, B or C: ");
						scan.next(); //Clears scanner
						
						} //End of try catch to detect errors
						
					} //End of while loop to detect errors
					
					switch (decision) {
					case "A":
						randomNumber = (int) (Math.random() * ((2 - 1) + 1)) + 1; //Generates a random number which is used to make the decision
						
						if (randomNumber == 1) {
							System.out.println("\nYou're feeling brave today and you decide to try and sneak past the wolves");
							System.out.println("You know you're coming close to the wolves, when all of a sudden, they attack you.");
							System.out.println("You try to fight back, but there are too many of them.");
							System.out.println("You faint from the pain, but you never wake up again.");
							System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
							
							while (true) {
								try {
								playAgain = scan.next(); //Scans the decision
								playAgain = playAgain.toUpperCase(); //Converts decision to upper case
								
								if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter Y or N: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter Y or N: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							decision = "D";
							
						} //End of if statement for when the program decides that the user will die from sneaking past the wolves (Level 4)
						
						if (randomNumber == 2) {
							System.out.println("\nYou're close to the edge of the forest, you can see it up ahead.  But you can also see the wolves.");
							System.out.println("There are about 10 of them, and they don't seem to be moving."
									+ "  You see a rock on the ground and you get an idea.");
							System.out.println("You throw the rock as far as you can to distract the wolves.  It works,"
									+ " they hear it hit the ground and run towards it.");
							System.out.println("The path is clear, you run to the end of the forest and you make it out.");
							System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");
							
							while (true) {
								try {
								playAgain = scan.next(); //Scans the decision
								playAgain = playAgain.toUpperCase(); //Converts decision to upper case
								
								if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter Y or N: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter Y or N: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							decision = "D";
							
						} //End of if statement for when the program decides that the user will survive sneaking past the wolves (Level 4)
						
						break;
						
					case "B":
						System.out.println("\nYou decided to stay where you are.  Once you can't hear the wolves, you'll run towards the edge of the forest.");
						System.out.println("You've been waiting for a long time now and the wolves are still howling.  The howls aren't getting quieter,"
								+ " but they aren't getting louder either.");
						System.out.println("All of a sudden, the howls start getting louder.  You start to wonder if they know you're there.");
						System.out.println("You take a look across the forest and you see the wolves.  There are about 10 of them and they're getting closer.");
						System.out.println("You need to decide what to do.  You can't run, because they'll outrun you."
								+ "  You could play dead and hope they don't eat you.");
						System.out.println("You could also try to fight them,"
								+ " you see a heavy branch that you can swing around and you could have a chance in a fight.");
						System.out.println("You need to choose now, they're coming even closer.");
						System.out.println("A - Play dead");
						System.out.println("B - Fight the wolves");
						System.out.print("Enter A or B: ");
						
						while (true) {
							try {
							decision = scan.next(); //Scans the decision
							decision = decision.toUpperCase(); //Converts decision to upper case
							
							if (decision.charAt(0) =='A' || decision.charAt(0) == 'B') {
								break;
							} //End of if statement to verify that input is correct
								
							else {
								System.out.print("Invalid entry.  Enter A or B: ");
							} //End of else to give an error message if input is incorrect 
						
							} catch (Exception e) {
							
							System.out.print("Error.  Enter A or B: ");
							scan.next(); //Clears scanner
							
							} //End of try catch to detect errors
							
						} //End of while loop to detect errors
						
						if (decision.charAt(0) == 'A') {
							System.out.println("\nYou decided to play dead.  You're now lying on the ground and the wolves are very close.");
							System.out.println("They approach you and are looking at you.  You're trying not to move even the slightest bit.");
							System.out.println("Because if you do, they'll attack and you'll have no chance.");
							System.out.println("All of a sudden, you hear howls in the distance.  There must be other wolves off in the distance.");
							System.out.println("The wolves run away towards the howls.  You get up off the ground and you can see them running away.");
							System.out.println("The path is clear, you can go now.  You see the edge of the forest and run towards it.");
							System.out.println("You've escaped the forest now.");
							System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");
							
							while (true) {
								try {
								playAgain = scan.next(); //Scans the decision
								playAgain = playAgain.toUpperCase(); //Converts decision to upper case
								
								if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter Y or N: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter Y or N: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							decision = "D";
							
						} //End of if statement for when the user decides to play dead (Level 4)
						
						if (decision.charAt(0) == 'B') {
							System.out.println("\nYou're feeling brave so you take a chance and fight the wolves.  They approach and surround you."
									+ "  You make the first move and hit one in the head.");
							System.out.println("Once you hit the one, they all start attacking you.  You have no chance at winning this fight, but you try your hardest.  You still lose the fight.  You die from your injuries.");
							System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
							
							while (true) {
								try {
								playAgain = scan.next(); //Scans the decision
								playAgain = playAgain.toUpperCase(); //Converts decision to upper case
								
								if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter Y or N: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter Y or N: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							decision = "D";
							
						} //End of if statement for when the user decides to fight the wolves (Level 4)
						
						break;
						
					case "C":
						System.out.println("\nYou decided to go back to the tree where you woke up.  Probably a good decision,"
								+ " as you won't get attacked by the wolves.");
						System.out.println("Once you get back to the tree, you realize that it's getting late and you're feeling tired."
								+ "  You decide to call it a night and sleep in the tree that you climbed after you woke up this morning");
						System.out.println("It's morning now, and you're not feeling very good.  You're hungry and thirsty and that's making you feel sick.");
						System.out.println("You also want to get out of the forest.");
						System.out.println("You have a choice to make."
								+ "  You can look for food and water before you get out of the forest or you can go straight to finding a way out of the forest.");
						System.out.println("A - Look for food and water, then find a way out of the forest.");
						System.out.println("B - Go straight to finding a way out of the forest.");
						System.out.print("Enter A or B: ");
						
						while (true) {
							try {
							decision = scan.next(); //Scans the decision
							decision = decision.toUpperCase(); //Converts decision to upper case
							
							if (decision.charAt(0) =='A' || decision.charAt(0) == 'B') {
								break;
							} //End of if statement to verify that input is correct
								
							else {
								System.out.print("Invalid entry.  Enter A or B: ");
							} //End of else to give an error message if input is incorrect 
						
							} catch (Exception e) {
							
							System.out.print("Error.  Enter A or B: ");
							scan.next(); //Clears scanner
							
							} //End of try catch to detect errors
							
						} //End of while loop to detect errors
						
						if (decision.charAt(0) == 'A') {
							System.out.println("\nYou decided to look for food.  You set off from the tree on your search.");
							System.out.println("You see some berries, they look delicious!  But wait, you can't just eat them.  They could be poisonous.");
							System.out.println("You're starving and you're not sure if you should take the risk.  This could be a live or die decision.");
							System.out.println("A - Eat the berries");
							System.out.println("B - Don't eat the berries");
							System.out.print("Enter A or B: ");
							
							while (true) {
								try {
								decision = scan.next(); //Scans the decision
								decision = decision.toUpperCase(); //Converts decision to upper case
								
								if (decision.charAt(0) =='A' || decision.charAt(0) == 'B') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter A or B: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter A or B: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							if (decision.charAt(0) == 'A') {
							System.out.println("\nYou ate the berries.  There were plenty of them and you ate them all.  You're now feeling full and energized.");
							System.out.println("Now it's time to escape.  You're walking around and you see some daylight.  You go towards it.");
							System.out.println("It's the edge of the forest!  You run as fast as you can, you can't wait to get out.");
							System.out.println("You start to feel exhausted so you walk instead, but this is a different kind of exhausted."
									+ "  You start feeling like you can't breathe.");
							System.out.println("You drop to the ground, gasping for air.  You start to pass out because you can't breathe."
									+ "  You're regretting eating those berries now.");
							System.out.println("You're dying, it's all over now.");
							System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
							
							while (true) {
								try {
								playAgain = scan.next(); //Scans the decision
								playAgain = playAgain.toUpperCase(); //Converts decision to upper case
								
								if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter Y or N: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter Y or N: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							decision = "D";
							
						} //End of if statement for when the user decides to eat the berries (Level 5)
						    
							if (decision.charAt(0) == 'B') {
						    	System.out.println("\nYou don't eat the berries, and you have mixed feelings about your decision.  You're way too hungry so you look for a house somewhere.  Maybe you'll be able to get non poisonous food there.");
						    	System.out.println("After plenty of searching, you see a house in the distance.  By now you're close to dropping dead.  You're walking slower than ever.  You're simply too exhausted to get to the house");
						    	System.out.println("You fall to the ground because you can't even hold your own body weight up.  You drift off into sleep.  You finally wake up after what seemed like days of sleeping,"
						    			+ " but you're still exhausted and it looks like the house is abandoned.  You've given up, you have no food and no water.  You hope someone finds you, but no one does.");
						    	System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
						    	
						    	while (true) {
									try {
									playAgain = scan.next(); //Scans the decision
									playAgain = playAgain.toUpperCase(); //Converts decision to upper case
									
									if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
										break;
									} //End of if statement to verify that input is correct
										
									else {
										System.out.print("Invalid entry.  Enter Y or N: ");
									} //End of else to give an error message if input is incorrect 
								
									} catch (Exception e) {
									
									System.out.print("Error.  Enter Y or N: ");
									scan.next(); //Clears scanner
									
									} //End of try catch to detect errors
									
								} //End of while loop to detect errors
						    	
						    	decision = "D";
						    	
						    } //End of if statement for when the user decides not to eat the berries (Level 5)
						
						} //End of if statement for when the user decides to look for food and water (Level 4)
						
						if (decision.charAt(0) == 'B') {
							
						} //End of if statement for when the user decides to look for a way out of the forest (Level 4)
						
						break;
					default:
						System.out.println("You didn't enter an A, B or C");
						break;
					} //End of case statement for when the user decides to start walking and sees wolves (Level 3)
					
				} //End of if statement for when the user decides to go towards the edge of the forest (Level 2)
				
			} //End of if statement for when the user decides to start climbing the tree (Level 1)
			
			if (decision.charAt(0) == 'B') {
				randomNumber = (int) (Math.random() * ((3 - 1) + 1)) + 1; //Generates a random number which is used to make the decision
				
				switch ( (int) randomNumber) {
				case 1:
					System.out.println("\nYou're walking in the forest and you see a river in your path.  If you want to cross you'll have to swim.");
					System.out.println("At the same time, you have no idea if you are walking in the right direction.");
					System.out.println("You could swim across the river and continue in the same direction, or go in a different direction.");
					System.out.println("A - Swim across the river");
					System.out.println("B - Go in a different direction");
					System.out.print("Enter A or B: ");
					
					while (true) {
						try {
						decision = scan.next(); //Scans the decision
						decision = decision.toUpperCase(); //Converts decision to upper case
						
						if (decision.charAt(0) =='A' || decision.charAt(0) == 'B') {
							break;
						} //End of if statement to verify that input is correct
							
						else {
							System.out.print("Invalid entry.  Enter A or B: ");
						} //End of else to give an error message if input is incorrect 
					
						} catch (Exception e) {
						
						System.out.print("Error.  Enter A or B: ");
						scan.next(); //Clears scanner
						
						} //End of try catch to detect errors
						
					} //End of while loop to detect errors
					
					if (decision.charAt(0) == 'A') {
						System.out.println("\nYou decide to swim across the river.  You have nothing to lose so why not?");
						System.out.println("You get in the water and it's very cold.  You start to swim across the river.");
						System.out.println("You're halfway across the river and the river starts to speed up.  You swim faster,"
								+ " but the river is pushing you away.");
						System.out.println("You look towards the way you are being pushed and you see a waterfall in the distance."
								+ "  You don't want to be pushed off that.");
						System.out.println("You start swimming as fast as you can towards the land, but it's too late.  You're very close to the waterfall.");
						System.out.println("You scream as you fall down the waterfall."
								+ "  You look down and you don't see water to land in at the bottom of the waterfall.");
						System.out.println("You only see rock at the bottom.  You're going to hit it and likely die.  You accept your fate.");
						System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
						
						while (true) {
							try {
							playAgain = scan.next(); //Scans the decision
							playAgain = playAgain.toUpperCase(); //Converts decision to upper case
							
							if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
								break;
							} //End of if statement to verify that input is correct
								
							else {
								System.out.print("Invalid entry.  Enter Y or N: ");
							} //End of else to give an error message if input is incorrect 
						
							} catch (Exception e) {
							
							System.out.print("Error.  Enter Y or N: ");
							scan.next(); //Clears scanner
							
							} //End of try catch to detect errors
							
						} //End of while loop to detect errors
						
						decision = "D";
						
					} //End of if statement for when the user decides to swim across the river (Level 3)
					
					if (decision.charAt(0) == 'B') {
						System.out.println("\nYou decide that it's not a good idea to swim across the river."
								+ "  You don't want to go backwards so you can either walk west along the river or east along the river.");
						System.out.println("W - Go west");
						System.out.println("E - Go east");
						System.out.print("Enter W or E: ");
						
						while (true) {
							try {
							decision = scan.next(); //Scans the decision
							decision = decision.toUpperCase(); //Converts decision to upper case
							
							if (decision.charAt(0) =='W' || decision.charAt(0) == 'E') {
								break;
							} //End of if statement to verify that input is correct
								
							else {
								System.out.print("Invalid entry.  Enter W or E: ");
							} //End of else to give an error message if input is incorrect 
						
							} catch (Exception e) {
							
							System.out.print("Error.  Enter W or E: ");
							scan.next(); //Clears scanner
							
							} //End of try catch to detect errors
							
						} //End of while loop to detect errors
						
						if (decision.charAt(0) == 'W') {
							System.out.println("\nYou start walking west."
									+ "  You see that the river is starting to speed up and you're very glad you chose not to swim across.");
							System.out.println("You can see off in the distance that the river gets narrower as it gets further west."
									+ "  You decide to keep walking west so that you can find a safe place to cross.");
							System.out.println("After a half hour, you come across a bridge.  How convenient!  You won't even need to get your clothes wet."
									+ "  You cross the bridge and see that there is a fork in the path.");
							System.out.println("You see a sign where the path splits.");
							System.out.println("Both paths lead to the end of the forest.");
							System.out.println("Left path: 6 km to end of forest.  Beware of bears.");
							System.out.println("Right path: 20 km to end of forest.  No bears on path.");
							System.out.println("You need to think hard about this decision.  You could take a risk and face the bears,"
									+ " or you can take the long way but get out safely.");
							System.out.println("L - Left path");
							System.out.println("R - Right path");
							System.out.print("Enter L or R: ");
							
							while (true) {
								try {
								decision = scan.next(); //Scans the decision
								decision = decision.toUpperCase(); //Converts decision to upper case
								
								if (decision.charAt(0) =='L' || decision.charAt(0) == 'R') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter L or R: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter L or R: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							if (decision.charAt(0) == 'L') {
								System.out.println("\nYou decide to risk it all and face a bear.  Your main goal is to avoid it and get around it,"
										+ " but you don't even know where it is.");
								System.out.println("You start walking and keeping an eye out for any signs of a bear."
										+ "  If you see any bear prints or hear any roars, you'll have to hide somewhere.");
								System.out.println("You've walked about 2 km now and there are no signs of any bear so far.");
								System.out.println("But just as you start to doubt if there is really a bear, you hear a roar off in the distance."
										+ "  That is definitely a bear.");
								System.out.println("You hear a rumbling in the ground.  The rumbling starts to get louder, and you start running."
										+ "  The bear might know you're here.");
								System.out.println("The bear emerges from the bushes behind you.  You have a large gap, but no one can outrun a bear."
										+ "  You immediately regret your decision to take the left path.");
								System.out.println("The bear is gaining on you now, and you've accepted your fate.  The bear closes in and tackles you.");
								System.out.println("You're getting mauled by the bear.  You can already feel your severe bleeding.  You die.");
								System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
								
								while (true) {
									try {
									playAgain = scan.next(); //Scans the decision
									playAgain = playAgain.toUpperCase(); //Converts decision to upper case
									
									if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
										break;
									} //End of if statement to verify that input is correct
										
									else {
										System.out.print("Invalid entry.  Enter Y or N: ");
									} //End of else to give an error message if input is incorrect 
								
									} catch (Exception e) {
									
									System.out.print("Error.  Enter Y or N: ");
									scan.next(); //Clears scanner
									
									} //End of try catch to detect errors
									
								} //End of while loop to detect errors
								
								decision = "D";
								
							}//End of if for when the user decides to start walking left (Level 5)
							
							if (decision.charAt(0) == 'R') {
								System.out.println("\nYou decide to take the right path, the long way.  It might be boring, but you hope it'll keep you safe.");
								System.out.println("A couple hours later, you're about 10 km away from the end of the forest.");
								System.out.println("Night is approaching soon, but you keep walking anyways.");
								System.out.println("You see a campfire in the distance with people sitting around it.  You decide to approach them.");
								System.out.println("One of them seems so happy to see you, but you don't know why."
										+ "  There are five of them and they all hug you and tell you how much they missed you.");
								System.out.println("It finally dawns upon you, you were exploring the forest with this group."
										+ "  You remember going out to look for food one day and not coming back to the group.");
								System.out.println("They tell you about how they looked for you for an entire day and couldn't find you,"
										+ " so they kept going without you.");
								System.out.println("Now you remember getting hit in the head by a falling tree.  That's why you woke up on the ground.");
								System.out.println("You finally regain all your old memories and remember everyone in the group."
										+ "  You talk all evening around the fire about all your adventures, and they let you sleep in their tent.");
								System.out.println("The next morning you leave the woods with your group."
										+ "  You can't believe all that's happened in the last few days.  You return home.");
								System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");
								
								while (true) {
									try {
									playAgain = scan.next(); //Scans the decision
									playAgain = playAgain.toUpperCase(); //Converts decision to upper case
									
									if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
										break;
									} //End of if statement to verify that input is correct
										
									else {
										System.out.print("Invalid entry.  Enter Y or N: ");
									} //End of else to give an error message if input is incorrect 
								
									} catch (Exception e) {
									
									System.out.print("Error.  Enter Y or N: ");
									scan.next(); //Clears scanner
									
									} //End of try catch to detect errors
									
								} //End of while loop to detect errors
								
								decision = "D";
								
							} //End of if statement for when the user decides to start walking right (Level 5)
							
						} //End of if for when the user decides to start walking west (Level 4)
						
						if (decision.charAt(0) == 'E') {
							System.out.println("\nYou walk east for a minute or so when you realize that there's a waterfall in that direction."
									+ "  You can't go that way.");
							System.out.println("You start walking in the other direction."
									+ "  You see that the river is starting to speed up and you're very glad you chose not to swim across.");
							System.out.println("You can see off in the distance that the river gets narrower as it gets further west."
									+ "  You decide to keep walking west so that you can find a safe place to cross.");
							System.out.println("After a half hour, you come across a bridge.  How convenient!  You won't even need to get your clothes wet."
									+ "  You cross the bridge and see that there is a fork in the path.");
							System.out.println("You see a sign where the path splits.");
							System.out.println("Both paths lead to the end of the forest.");
							System.out.println("Left path: 6 km to end of forest.  Beware of bears.");
							System.out.println("Right path: 20 km to end of forest.  No bears on path.");
							System.out.println("You need to think hard about this decision.  You could take a risk and face the bears,"
									+ " or you can take the long way but get out safely.");
							System.out.println("L - Left path");
							System.out.println("R - Right path");
							System.out.print("Enter L or R: ");
							
							while (true) {
								try {
								decision = scan.next(); //Scans the decision
								decision = decision.toUpperCase(); //Converts decision to upper case
								
								if (decision.charAt(0) =='L' || decision.charAt(0) == 'R') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter L or R: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter L or R: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							if (decision.charAt(0) == 'L') {
								System.out.println("\nYou decide to risk it all and face a bear.  Your main goal is to avoid it and get around it,"
										+ " but you don't even know where it is.");
								System.out.println("You start walking and keeping an eye out for any signs of a bear."
										+ "  If you see any bear prints or hear any roars, you'll have to hide somewhere.");
								System.out.println("You've walked about 2 km now and there are no signs of any bear so far.");
								System.out.println("But just as you start to doubt if there is really a bear, you hear a roar off in the distance."
										+ "  That is definitely a bear.");
								System.out.println("You hear a rumbling in the ground.  The rumbling starts to get louder, and you start running."
										+ "  The bear might know you're here.");
								System.out.println("The bear emerges from the bushes behind you.  You have a large gap, but no one can outrun a bear."
										+ "  You immediately regret your decision to take the left path.");
								System.out.println("The bear is gaining on you now, and you've accepted your fate.  The bear closes in and tackles you.");
								System.out.println("You're getting mauled by the bear.  You can already feel your severe bleeding.  You die.");
								System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
								
								while (true) {
									try {
									playAgain = scan.next(); //Scans the decision
									playAgain = playAgain.toUpperCase(); //Converts decision to upper case
									
									if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
										break;
									} //End of if statement to verify that input is correct
										
									else {
										System.out.print("Invalid entry.  Enter Y or N: ");
									} //End of else to give an error message if input is incorrect 
								
									} catch (Exception e) {
									
									System.out.print("Error.  Enter Y or N: ");
									scan.next(); //Clears scanner
									
									} //End of try catch to detect errors
									
								} //End of while loop to detect errors
								
								decision = "D";
								
							} //End of if statement for when the user decides to go left (Level 5)
							
							if (decision.charAt(0) == 'R') {
								System.out.println("\nYou decide to take the right path, the long way.  It might be boring, but you hope it'll keep you safe.");
								System.out.println("A couple hours later, you're about 10 km away from the end of the forest.");
								System.out.println("Night is approaching soon, but you keep walking anyways.");
								System.out.println("You see a campfire in the distance with people sitting around it.  You decide to approach them.");
								System.out.println("One of them seems so happy to see you, but you don't know why."
										+ "  There are five of them and they all hug you and tell you how much they missed you.");
								System.out.println("It finally dawns upon you, you were exploring the forest with this group."
										+ "  You remember going out to look for food one day and not coming back to the group.");
								System.out.println("They tell you about how they looked for you for an entire day and couldn't find you,"
										+ " so they kept going without you.");
								System.out.println("Now you remember getting hit in the head by a falling tree.  That's why you woke up on the ground.");
								System.out.println("You finally regain all your old memories and remember everyone in the group."
										+ "  You talk all evening around the fire about all your adventures, and they let you sleep in their tent.");
								System.out.println("The next morning you leave the woods with your group."
										+ "  You can't believe all that's happened in the last few days.  You return home.");
								System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");
								
								while (true) {
									try {
									playAgain = scan.next(); //Scans the decision
									playAgain = playAgain.toUpperCase(); //Converts decision to upper case
									
									if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
										break;
									} //End of if statement to verify that input is correct
										
									else {
										System.out.print("Invalid entry.  Enter Y or N: ");
									} //End of else to give an error message if input is incorrect 
								
									} catch (Exception e) {
									
									System.out.print("Error.  Enter Y or N: ");
									scan.next(); //Clears scanner
									
									} //End of try catch to detect errors
									
								} //End of while loop to detect errors
								
								decision = "D";
								
							}//End of if for when the user decides to go right (Level 5)
							
						} //End of if for when the user decides to start walking east (Level 4)
												
					} //End of if statement for when the user decides to go in a different direction (Level 3)
					
					break;
				case 2:
					System.out.println("\nYou come across some berries.  They look tasty, and you're very hungry.  They could be poisonous as well.");
					System.out.println("You have a choice.  Do you eat the berries and take a chance at being poisoned, or do you not eat them and be hungry.");
					System.out.println("A - Eat the berries");
					System.out.println("B - Don't eat the berries");
					System.out.print("Enter A or B: ");
					
					while (true) {
						try {
						decision = scan.next(); //Scans the decision
						decision = decision.toUpperCase(); //Converts decision to upper case
						
						if (decision.charAt(0) =='A' || decision.charAt(0) == 'B') {
							break;
						} //End of if statement to verify that input is correct
							
						else {
							System.out.print("Invalid entry.  Enter A or B: ");
						} //End of else to give an error message if input is incorrect 
					
						} catch (Exception e) {
						
						System.out.print("Error.  Enter A or B: ");
						scan.next(); //Clears scanner
						
						} //End of try catch to detect errors
						
					} //End of while loop to detect errors
					
					if (decision.charAt(0) == 'A') {
						
						randomNumber = (int) (Math.random() * ((2 - 1) + 1)) + 1; //Generates a random number which is used to make the decision
						
						if (randomNumber == 1) {
							System.out.println("\nYou ate the berries and you feel great.  You feel replenished and energized.  You start walking again,"
									+ " but you have no sense of direction, so you go on a random path and hope for the best.");
							System.out.println("After hours of frustration, you try climbing some trees to get an aerial view of the forest,"
									+ " but all the trees are the same height and you can't see very far.");
							System.out.println("Feeling even more frustrated, you just walk in a random direction.  You think you're going nowhere,"
									+ " but you're in luck, you see both a house and a campfire in opposite directions off in the distance.");
							System.out.println("What will you do?  You can go to the house, or go to the campfire.");
							System.out.println("A - House");
							System.out.println("B - Campfire");
							System.out.print("Enter A or B: ");
							
							while (true) {
								try {
								decision = scan.next(); //Scans the decision
								decision = decision.toUpperCase(); //Converts decision to upper case
								
								if (decision.charAt(0) =='A' || decision.charAt(0) == 'B') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter A or B: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter A or B: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							if (decision.charAt(0) == 'A') {
								System.out.println("\nYou walk up to the house and knock on the front door."
										+ "  An old woman answers the door and is happy to let you in.");
								System.out.println("She offers you food and water.  You accept, the berries didn't keep you full for very long.");
								System.out.println("She makes you a big plate of chicken, potatoes and vegetables.  You gobble it down fast.");
								System.out.println("After you finish eating, you ask the old woman how to get out of the forest.  She gives you directions,"
										+ " she says to go west and you'll be there in half an hour.");
								System.out.println("You're about to leave the house when the old woman offers you a bed for the night."
										+ "  You accept, as it wouldn't be a good idea to travel alone at night.");
								System.out.println("In the morning, she offers you breakfast before you leave."
										+ "  You thank her what seen a million times before you leave");
								System.out.println("You can see the end of the forest, but you don't feel excited to get out for some reason."
										+ "  Something is missing, but you don't know what it is.");
								System.out.println("You still feel glad you got out, but you could be better.");
								System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");
								
								while (true) {
									try {
									playAgain = scan.next(); //Scans the decision
									playAgain = playAgain.toUpperCase(); //Converts decision to upper case
									
									if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
										break;
									} //End of if statement to verify that input is correct
										
									else {
										System.out.print("Invalid entry.  Enter Y or N: ");
									} //End of else to give an error message if input is incorrect 
								
									} catch (Exception e) {
									
									System.out.print("Error.  Enter Y or N: ");
									scan.next(); //Clears scanner
									
									} //End of try catch to detect errors
									
								} //End of while loop to detect errors
								
								decision = "D";
								
							} //End of if statement for when the user goes to the house (Level 3)
							
							if (decision.charAt(0) == 'B') {
								System.out.println("\nYou get to the campfire but no one else is there.  You sit down and warm up for a while.");
								System.out.println("You see some rabbits hopping around and at the same time notice a knife next to the fire."
										+ "  You get a craving for meat and you gotta do what you gotta do.");
								System.out.println("You put the rabbit meat in the pot above the fire.");
								System.out.println("It'll take a while to cook, so you rest for a bit.");
								System.out.println("You wake up to the sound of wolves howling.  The howls start to get closer."
										+ "  The smell of rabbit meat must've attracted them.");
								System.out.println("The wolves approach and surround you, there are about 10 of them.  You try to distract them, but they think you're threatening them.");
								System.out.println("They start attacking you, and that's the end of your adventure.");
								System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
								
								while (true) {
									try {
									playAgain = scan.next(); //Scans the decision
									playAgain = playAgain.toUpperCase(); //Converts decision to upper case
									
									if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
										break;
									} //End of if statement to verify that input is correct
										
									else {
										System.out.print("Invalid entry.  Enter Y or N: ");
									} //End of else to give an error message if input is incorrect 
								
									} catch (Exception e) {
									
									System.out.print("Error.  Enter Y or N: ");
									scan.next(); //Clears scanner
									
									} //End of try catch to detect errors
									
								} //End of while loop to detect errors
								
								decision = "D";
								
							} //End of if statement for when the user goes to the camp fire (Level 3)
							
						} //End of if statement for when the berries are okay (Level 4)
						
						if (randomNumber == 2) {
							System.out.println("\nYou ate the berries and they taste a little weird.  But you're still glad you ate them, now you have more energy to escape the forest.");
							System.out.println("You set off on a path that looks promising.  After a half hour you start to see the edge of the forest.  You must have good luck.");
							System.out.println("You picked a random path and somehow found a way out.  You're feeling great as you exit the forest.  You look up at the clear sky and scream \"I'm fr-!\"");
							System.out.println("Your screams are interrupted by a cough.  That's funny.  You start coughing heavily now, gasping for air.  \"It was the berries,\" you think to yourself.");
							System.out.println("The cough is only getting worse now, you can barely breathe.  You had some good luck with getting out, now you're having bad luck surviving.");							
							System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
							
							while (true) {
								try {
								playAgain = scan.next(); //Scans the decision
								playAgain = playAgain.toUpperCase(); //Converts decision to upper case
								
								if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter Y or N: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter Y or N: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							decision = "D";
							
						} //End of if statement for when the berries are poisonous (Level 4)
						
					} //End of if statement for when the user eats the berries (Level 3)
					
					if (decision.charAt(0) == 'B') {
						System.out.println("\nEating the berries could be dangerous, potenially fatal.  It would be better to wait and find food that won't be poisonous.  You figure you'll find food at some point soon,"
								+ " so you aren't worried.");
						System.out.println("You set off in a random direction, hoping to find some sort of way out.  You come across an apple tree and the apples look delicious.");
						System.out.println("You fit as many of them as you can in your pockets and continue searching for a path that leads to the end of the forest.");
						System.out.println("You come across an abandoned campsite.  There are logs around a burning fire, so someone was here recently.  You sit down for a break.");
						System.out.println("You see a honeycomb hanging off a tree and you get a brilliant idea.  You could make honey glazed apples.  There's a pot on the fire so it's totally possible.");
						System.out.println("What will you do, make honey glazed apples, or eat the apples straight up?");
						System.out.println("A - Make honey glazed apples");
						System.out.println("B - Eat the apples straight up");
						System.out.print("Enter A or B: ");
						
						while (true) {
							try {
							decision = scan.next(); //Scans the decision
							decision = decision.toUpperCase(); //Converts decision to upper case
							
							if (decision.charAt(0) =='A' || decision.charAt(0) == 'B') {
								break;
							} //End of if statement to verify that input is correct
								
							else {
								System.out.print("Invalid entry.  Enter A or B: ");
							} //End of else to give an error message if input is incorrect 
						
							} catch (Exception e) {
							
							System.out.print("Error.  Enter A or B: ");
							scan.next(); //Clears scanner
							
							} //End of try catch to detect errors
							
						} //End of while loop to detect errors
						
						if (decision.charAt(0) == 'A') {
							System.out.println("\nYou get some honey from the honeycomb, although it was a struggle.  You're now covered in honey.");
							System.out.println("As you wait for the honey glazed apples to finish cooking, you hear footsteps.  You hope that it's a person, you would love to know how to get out.");
							System.out.println("The footsteps get louder and you doubt that they're a person's.  That's when you realize, it has to be a bear.  What were you thinking when you made honey glazed apples?");
							System.out.println("You leave the apples and honey in the pot and run for your life.  You look back and see the bear checking out the pot.  It doesn't want any apples, it wants honey.");
							System.out.println("You're still covered in honey and the bear notices.  The bear is too fast for you.  It catches up to you and pushes you to the ground.");
							System.out.println("You're thinking that it'll kill you first, but it only licks the honey off of you.  You're glad that the bear isn't provoked, but you're still panicking.");
							System.out.println("The bear sees this and thinks you're threatening it.  It starts attacking you and you have no way to fight back.");
							System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
							
							while (true) {
								try {
								playAgain = scan.next(); //Scans the decision
								playAgain = playAgain.toUpperCase(); //Converts decision to upper case
								
								if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter Y or N: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter Y or N: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							decision = "D";
							
						} //End of if statement for when the user decides to make honey glazed apples (Level 4)
						
						if (decision.charAt(0) == 'B') {
							System.out.println("\nWho cares about honey glazed apples right?  All you care about is getting out of here.  You relax by the fire and eat apples.");
							System.out.println("You hear footsteps approach and you hope that it's someone who can help you out.  It is!  In exchange for some apples, the kind traveller guides you out of the forest.");
							System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");
							
							while (true) {
								try {
								playAgain = scan.next(); //Scans the decision
								playAgain = playAgain.toUpperCase(); //Converts decision to upper case
								
								if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter Y or N: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter Y or N: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
							
							decision = "D";
							
						} //End of if statement for when the user decides to eat the apples straight up (Level 4)
					
					} //End of if statement for when the user decides not to eat the berries (Level 3)
					
					break;
				case 3:
					System.out.println("\nYou see a bear but it doesn't see you.  The bear is slowly heading in your direction.  You panic internally,"
							+ " but you stay calm on the outside.  You see a tree that looks like you can climb it.");
					System.out.println("That could be an option on what to do.  The bear is getting closer now, you need to make a decision quickly."
							+ "  What else can you do?  You see a hollow tree trunk.  You should be able to fit in it.");
					System.out.println("The bear is super close now, make a decision.");
					System.out.println("A - Climb up the tree");
					System.out.println("B - Go in the hollow tree trunk");
					System.out.print("Enter A or B: ");
					
					while (true) {
						try {
						decision = scan.next(); //Scans the decision
						decision = decision.toUpperCase(); //Converts decision to upper case
						
						if (decision.charAt(0) =='A' || decision.charAt(0) == 'B') {
							break;
						} //End of if statement to verify that input is correct
							
						else {
							System.out.print("Invalid entry.  Enter A or B: ");
						} //End of else to give an error message if input is incorrect 
					
						} catch (Exception e) {
						
						System.out.print("Error.  Enter A or B: ");
						scan.next(); //Clears scanner
						
						} //End of try catch to detect errors
						
					} //End of while loop to detect errors
					
					if (decision.charAt(0) == 'A') {
					    System.out.println("\nYou make your way up the tree without the bear seeing you.  Success!"
					    		+ "  The bear doesn't look up to the tree and crawls away.  You wait a few minutes to be safe and then you descend from the tree. ");
					    System.out.println("You still have no idea where you are.  You have no sense of direction, how will you escape?"
					    		+ "  You could look for someone to give you directions, that would help a lot.  Or you could walk around and hope for the best.");
					    System.out.println("A - Find someone to give you directions");
					    System.out.println("B - Walk around and hope to find a way out");
					    System.out.print("Enter A or B: ");
					    
					    while (true) {
							try {
							decision = scan.next(); //Scans the decision
							decision = decision.toUpperCase(); //Converts decision to upper case
							
							if (decision.charAt(0) =='A' || decision.charAt(0) == 'B') {
								break;
							} //End of if statement to verify that input is correct
								
							else {
								System.out.print("Invalid entry.  Enter A or B: ");
							} //End of else to give an error message if input is incorrect 
						
							} catch (Exception e) {
							
							System.out.print("Error.  Enter A or B: ");
							scan.next(); //Clears scanner
							
							} //End of try catch to detect errors
							
						} //End of while loop to detect errors
					    
					    if (decision.charAt(0) == 'A') {
					    	System.out.println("\nYou start to walk around and look for someone to give you directions.  You miraculously end up finding a cabin.  You knock on the cabin door and a kind young boy answers.");
					    	System.out.println("He doesn't want to leave his cabin, but he happily gives you directions and you make your way out of the forest with ease.");
					    	System.out.println("What can you say, sometimes luck is just on your side.");					    	
					    	System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");
					    	
					    	while (true) {
								try {
								playAgain = scan.next(); //Scans the decision
								playAgain = playAgain.toUpperCase(); //Converts decision to upper case
								
								if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter Y or N: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter Y or N: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
					    	
					    	decision = "D";
					    	
					    } //End of if statement for when the user decides to look for someone to give them directions (Level 4)
					    
					    if (decision.charAt(0) == 'B') {
					    	System.out.println("\nYou walk for a very long time before you see an exit to the forest.  You have it in sight!  You run towards the edge, but you fall in quicksand, oh no!");
					    	System.out.println("You're stuck and there's no way to get out.  You'll have to hope someone walks by and helps you out.  The only things that pass by are bugs.  Within 10 minutes you're covered in mosquito bites.");
					    	System.out.println("The worst part is that your arms are stuck and you can't scratch your bites.");
					    	System.out.println("1 hour later...");
					    	System.out.println("It's the dead of night and finally someone has come to help you.  He was also lost.  He pulls you out and you both exit the forest together.");
					    	System.out.print("\n\nYou win!  Play again?  Enter Y for yes or N for no: ");
					    	
					    	while (true) {
								try {
								playAgain = scan.next(); //Scans the decision
								playAgain = playAgain.toUpperCase(); //Converts decision to upper case
								
								if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
									break;
								} //End of if statement to verify that input is correct
									
								else {
									System.out.print("Invalid entry.  Enter Y or N: ");
								} //End of else to give an error message if input is incorrect 
							
								} catch (Exception e) {
								
								System.out.print("Error.  Enter Y or N: ");
								scan.next(); //Clears scanner
								
								} //End of try catch to detect errors
								
							} //End of while loop to detect errors
					    	
					    	decision = "D";
					    	
					    } //End of if statement for when the user decides to walk around (Level 4)
					    
					} //End of if statement for when the user decides to climb the tree (Level 3)
					
					if (decision.charAt(0) == 'B') {
						System.out.println("\nYou hide in the tree trunk, hoping the bear won't look there.  You're not in luck.  The bear grabs you and throws you out of the trunk.  You hit your head on the trunk and you pass out.");
						System.out.println("The bear attacks you and injures you badly.  You die from your injuries.");
						System.out.print("\n\nGame over.  Play again?  Enter Y for yes or N for no: ");
						
						while (true) {
							try {
							playAgain = scan.next(); //Scans the decision
							playAgain = playAgain.toUpperCase(); //Converts decision to upper case
							
							if (playAgain.charAt(0) =='Y' || playAgain.charAt(0) == 'N') {
								break;
							} //End of if statement to verify that input is correct
								
							else {
								System.out.print("Invalid entry.  Enter Y or N: ");
							} //End of else to give an error message if input is incorrect 
						
							} catch (Exception e) {
							
							System.out.print("Error.  Enter Y or N: ");
							scan.next(); //Clears scanner
							
							} //End of try catch to detect errors
							
						} //End of while loop to detect errors
						
						decision = "D";
						
					} //End of if statement for when the user decides to hide in the tree trunk (Level 3)
					break;
				default:
					System.out.println("Something went wrong.  Not your fault.  If you see this message, please contact Nathan Philippon or Guntaas Mangat immediately."); //Thought I'd include this for laughs
					break;
					
				} //End of case statement for when the user decides to start walking (Level 2)
				
			} //End of if statement for when the user decides to start walking (Level 1)
		
		} while (playAgain.charAt(0) == 'Y'); //End of the while loop for the game (plays game again if the user wants to)
				
		System.out.println("Thanks for playing.");
		scan.close(); //Closes scanner

	} //End of main

} //End of class

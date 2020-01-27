import java.util.Random;
import java.util.Scanner;

/*
 * Authors are Sean and Kyle Warchuck, the coding brothers
 */

public class diceRoll {

	public static void main(String[] args) {
		
		
		
		Scanner scnr = new Scanner(System.in);

		boolean goAgain = true;
		
		while (goAgain) {
					
			System.out.print("How many sides should each die have?: ");
			
			int a = scnr.nextInt();
			int b = a;
			
			int a1 = generateRandDieRoll(a);
			int b1 = generateRandDieRoll(b); 
			
			if (a1 + b1 == 2) {
				System.out.println("You rolled snake eyes!");
				
			} else if (a1 == 6 && b1 == 6) {
				System.out.println("You rolled boxcars");			
				
			} else if ((a1 + b1 == 3) || (a1 + b1 == (2 * a))) {
				System.out.println("You rolled craps with a " + a1 + "and a " + b1);
				
			} else
			System.out.println("You rolled " + a1 + " and " + b1);

			System.out.println("Do you want to roll again? (y/n)");
			goAgain = scnr.next().toLowerCase().startsWith("y");
			
		}
		
		System.out.println("Thank you for using the program!");
		scnr.close();
		
	}
	
	public static int generateRandDieRoll(int a) {
		
		Random rand = new Random();
		
		a = rand.nextInt(a);
		
	return a;
	}
}

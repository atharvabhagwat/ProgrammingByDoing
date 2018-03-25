import java.util.*;

public class KeepGuessing {

	public static void main(String[] args) {
		
		System.out.println("Want to play a guessing game?");
		System.out.print("How high would you like the numbers to go? ");
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();
		System.out.println("Okay the numbers will go between 1 and " + range + ".");
		System.out.println("I'm thinking of a number between 1-" + range + ", try to guess it.");
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		int rand = 1 + rnd.nextInt(range), guess = keyboard.nextInt(), tries = 1;
		
		while ( guess != rand )
			{
				System.out.println("\nSorry that was incorrect.");
				System.out.println("Try again.");
				guess = keyboard.nextInt();
				tries++;
			}
		System.out.println("\nThat's correct. It only took you " + tries + " tries.");
	}

}

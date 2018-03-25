import java.util.Random;
import java.util.Scanner;

public class DoWhileKeepGuessing {

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
		
		do
			{
			
			}
		while ( guess != rand );
		
	}

}

import java.util.Scanner;
import java.util.Random;

public class AnActualGuessingGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("I'm thinking of a number between 1 and 10.");
		System.out.print("What's your guess?: ");
		int guess = 1 + input.nextInt(10);
		
		if ( guess == rnd )
			System.out.println("That's right!");
		else
			System.out.println("Sorry, the number was " + rnd);
	}

}

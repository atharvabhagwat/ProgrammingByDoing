import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner keyboard = new Scanner(System.in);
		int w, x, y, z, rand;
		boolean do_you_want_to_play_a_game;
		
		System.out.println("Would you like to play a game? (Say \"True\" for Yes, or \"False\" for No)");
		do_you_want_to_play_a_game = keyboard.nextBoolean();
		
		if(do_you_want_to_play_a_game==true)
		{
			System.out.println("Guess a number between 0 and (Enter a Number)");
			w = keyboard.nextInt();
			rand = rnd.nextInt(w);
			System.out.println("How many guesses would you like?");
			x = keyboard.nextInt();
			System.out.println("Let's begin.");
			System.out.println("Guess a number:");
			y = keyboard.nextInt();
			while (x>1)
			{
				if (y==rand)
				{
					System.out.println("YOU WIN!");
				}
				else
				{
					if (y>rand)
					{
						System.out.println("Guess lower.");
						x--;
						System.out.println("You have " + x + " guesses left.");
					}
					else
					{
						System.out.println("Guess higher.");
						x--;
						System.out.println("You have " + x + " guesses left.");
					}
				y = keyboard.nextInt();
				}
			}
			if(x==1)
			{
				System.out.println("YOU LOST!");
				System.out.println("The number was " + rand + ". Thanks for playing!");
			}
		}
		else
		{
			System.out.println("Fine, don't play then.");
		}
	}

}

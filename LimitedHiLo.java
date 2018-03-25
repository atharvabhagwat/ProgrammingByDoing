import java.util.*;

public class LimitedHiLo {

	public static void main(String[] args) {

		Random rnd = new Random();
		int number = 1 + rnd.nextInt(100);
		System.out.println("I'm thinking of a number between 1 and 100, try to guess it.");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		int tries = 7;
		
		while ( guess != number && tries <= 7 )
		{
			if ( guess > number )
			{
				System.out.println("Sorry, the number is too high.");
				System.out.println("You have " + tries-- + " tries remaining.");
				guess = input.nextInt();
			}
			if ( guess < number )
			{
				System.out.println("Sorry, the number is too low.");
				System.out.println("You have " + tries-- + " tries remaining.");
				guess = input.nextInt();
			}
			if ( tries == 0 )
			{
				System.out.println("Sorry you're out of tries! The number was " + number);
			}
		}
		System.out.println("That's right! The number was " + number);
	}

}
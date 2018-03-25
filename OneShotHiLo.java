import java.util.*;

public class OneShotHiLo {

	public static void main(String[] args) {

		Random rnd = new Random();
		int number = 1 + rnd.nextInt(100);
		System.out.println("I'm thinking of a number between 1 and 100, try to guess it.");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		
		if ( guess == number )
			System.out.println("You are correct!");
		if ( guess > number )
			System.out.println("Sorry you were too high, the number was " + number );
		if ( guess < number )
			System.out.println("Sorry you were too low, the number was " + number );
		
	}

}

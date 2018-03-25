import java.util.*;

public class DiceDoubles {

	public static void main(String[] args) {

		System.out.println("HERE COME THE DICE, PART TWO!");
		Random rnd = new Random();
		
		int roll1 = 1 + rnd.nextInt(6), roll2 = 1 + rnd.nextInt(6);
		
		while ( roll1 != roll2 )
		{
			roll1 = 1 + rnd.nextInt(6);
			roll2 = 1 + rnd.nextInt(6);
			System.out.println( "\nRoll #1: " + roll1 );
			System.out.println( "Roll #2: " + roll2 );
		}
		System.out.println( "\nWe finally got doubles!");
		
	}

}

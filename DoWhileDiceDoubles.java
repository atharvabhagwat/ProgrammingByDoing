import java.util.Random;

public class DoWhileDiceDoubles {

	public static void main(String[] args) {

		System.out.println("HERE COME THE DICE, PART 3!");
		Random rnd = new Random();
		
		int roll1 = rnd.nextInt(6), roll2 = rnd.nextInt(6);
		
		do
		{
			roll1 = 1 + rnd.nextInt(6);
			roll2 = 1 + rnd.nextInt(6);
			System.out.println( "\nRoll #1: " + roll1 );
			System.out.println( "Roll #2: " + roll2 );
			System.out.println( "The total is: " + ( roll1 + roll2 ));
		}
		while (roll1 != roll2);
		
	}

}

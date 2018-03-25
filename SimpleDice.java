import java.util.*;

public class SimpleDice {

	public static void main(String[] args) {
		System.out.println("HERE COMES THE DICE!");
		
		Random r = new Random();
		int roll  = 1 + r.nextInt(6), roll2 = 1 + r.nextInt(6);
		
		System.out.println("Roll #1: " + roll);
		System.out.println("Rolls #2: " + roll2);
		System.out.println("The total for the roll is: " + (roll + roll2));
		
	}

}

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("SQUARE ROOTS!");
		System.out.print("Enter a number: ");
		int n = keyboard.nextInt();
		
		while ( n <= 0 )
		{
			System.out.println("You can't take the square root of a negative number, silly.");
			System.out.print("Try again: ");
			n = keyboard.nextInt();
		}
		
		System.out.println("The square root of " + n + " is " + Math.sqrt(n) + ".");
		
	}

}
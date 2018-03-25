import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What's your last name?");
		String name = input.next();

		if (name.compareTo("Carswell") <= 0)
		{
			System.out.println( "You don't have to wait long." );
		}
		else if (name.compareTo("Jones") <= 0)
		{
			System.out.println( "The wait isn't that bad.");
		}
		else if (name.compareTo("Smith") <= 0)
		{
			System.out.println("It looks like there's going to be a bit of a wait.");
		}
		else if (name.compareTo("Young") <= 0)
		{
			System.out.println("It's going to be a while before we get to you.");
		}
		else if (name.compareTo("Young") > 0)
		{
			System.out.println("You're not going to be going anywhere for a while!");
		}
			
	}

}

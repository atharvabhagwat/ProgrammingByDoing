import java.util.Scanner;
import java.util.Random;

public class FortuneCookie {

	public static void main(String[] args) {

		Random rnd = new Random();
		int r = 1 + rnd.nextInt(6);
		String response;
		
		if ( r == 1 )
			response = "Be careful or you could fall for some tricks today.";
		else if ( r == 2 )
			response = "Like the river flow into the sea. Somethings are just meant to be.";
		else if ( r == 3 )
			response = "Time is precious, but truth is more precious than time";
		else if ( r == 4 )
			response = "Depart not from the path which fate has you assigned.";
		else if ( r == 5 )
			response = "The change you started already have far-reaching effects. Be ready.";
		else if ( r == 6 )
			response = "You are soon going to change your present line of work.";
		else
			response = "ERROR_404 idk what's going to happen with your life";
		
		System.out.println("The fortune cookie has spoken:");
		System.out.print(response);
		
		
	}
}
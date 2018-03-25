import java.util.Scanner;

public class WorstNumberGuessingGameEver {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("THIS IS THE WORST NUMBER GUESSING GAME EVER");
		System.out.print("I'M THINKING OF A NUMBER BETWEEN 1 TO 10. TRY TO GUESS IT: ");
		int guess = number.nextInt();
		
		if (guess==7)
		{
			System.out.println("HAHA YOU GOT IT RIGHT. HOW DID YOU KNOW IT WAS 7?? cheater.");
		}
		else
		{
			System.out.println("HAHA THE NUMBER WAS 7 LOSER. YOU LOSE!! AHAHA.");
		}

	}

}

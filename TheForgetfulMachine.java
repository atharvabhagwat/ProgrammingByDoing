import java.util.Scanner;

public class TheForgetfulMachine {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me a word!");
		keyboard.next();
		
		System.out.println("Give me another word!");
		keyboard.next();
		
		System.out.println("What's your favorite number?!");
		keyboard.nextInt();
		
		System.out.println("What's your second favorite number?!");
		keyboard.nextInt();
		
		System.out.println("That was fun. I'm not going to do anything with that information, but yeah. Fun.");
	
	}

}

import java.util.Scanner;

public class HowOldAreYouSpecifically {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("Hello, what's your name?");
		name = in.next();
		
		System.out.println("Okay, " + name + ", what is your age?");
		age = in.nextInt();
		
		if (age < 16)
		{
			System.out.println("You can't drive.");
		}
		else if (age < 18)
		{
			System.out.println("You can drive, but can't vote.");
		}
		else if (age <= 24)
		{
			System.out.println("You can vote, but can't rent a car.");
		}
		else if (age >= 25)
		{
			System.out.println("You can pretty much do anything.");
		}

	}

}

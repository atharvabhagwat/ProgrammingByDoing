import java.util.Scanner;

public class HowOldAreYou {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Hello, what is your name?");
		name = in.next();
		
		System.out.println("Okay, " + name + ", how old are you?");
		age = in.nextInt();
		
		if(age < 16)
		{
			System.out.println("You can't drive, " + name + ".");
			System.out.println("You can't vote, " + name + ".");
			System.out.println("You can't rent a car, " + name + ".");
		}
		else if (age < 18)
		{
			System.out.println("You can't vote, " + name + ".");
			System.out.println("You can't rent a car, " + name + ".");
		}
		else if (age < 25)
		{
			System.out.println("You can't rent a car, " + name + ".");
		}
		else
		{
			System.out.println("You can do anything, " + name + ".");
		}

	}

}

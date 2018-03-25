import java.util.Scanner;

public class AgeMessages {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Your name: ");
		String name = keyboard.next();
		
		System.out.println("Your age: ");
		int age = keyboard.nextInt();
		
		if(age < 16)
		{
			System.out.println("You can't drive, " + name);
		}
		if(age >= 16 && age <= 17)
		{
			System.out.println("You can drive but can't vote, " + name);
		}
		if(age > 17 && age <= 24)
		{
			System.out.println("You can vote but can't rent a car, " + name);
		}
		if(age >= 25)
		{
			System.out.println("You can pretty much do everything, " + name);
		}

	}

}

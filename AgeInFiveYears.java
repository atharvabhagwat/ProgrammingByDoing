import java.util.Scanner;

public class AgeInFiveYears {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Hello, what is your name?");
		name = keyboard.next();
		
		System.out.println("Hello, " + name + "! What is your age?");
		age = keyboard.nextInt();
		
		System.out.println("Did you know that in five years you'll be " + (age + 5) + " years old?");
		System.out.println("And, did you known that five years ago you were " + (age - 5) + " years old?");
		
	}

}

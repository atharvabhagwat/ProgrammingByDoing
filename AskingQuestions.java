import java.util.Scanner;

public class AskingQuestions {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String height, name;
		double weight;
		
		System.out.println( "Hello! I'd love to get to know you. What's your name?" );
		name = keyboard.next();
		
		System.out.println( "How old are you?" );
		age = keyboard.nextInt();
		
		System.out.println( "How tall are you?" );
		height = keyboard.next();
		
		System.out.println( "How much do you weight?" );
		weight = keyboard.nextDouble();
		
		System.out.println( "So your name is " + name + ". You are " + age + " years old, " + height + " tall and " + weight + " pounds. Nice to meet you!");

	}

}

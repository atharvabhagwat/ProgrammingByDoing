import java.util.Scanner;

public class TwentyQuestions_ButActuallyJustTwo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");
		System.out.println();
		System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
		String answer1 = keyboard.next();
		
		if(answer1.equals("animal"))
		{
			System.out.println("Question 2) Is it bigger than a breadbox?");
			String answer2 = keyboard.next();
			
			if(answer2.equals("yes"))
			{
				System.out.println("Is it a moose?");
				System.out.println("Actually, I don't care. I'm guessing moose.");
			}
			else if(answer2.equals("no"))
			{
				System.out.println("Is it a squirrel?");
				System.out.println("Actually, I don't care. I'm guessing squirrel.");
			}
		}
		if(answer1.equals("vegetable"))	
		{
			System.out.println("Question 2) Is it bigger than a breadbox?");
			String answer2 = keyboard.next();
			
			if(answer2.equals("yes"))
			{
				System.out.println("Is it a watermelon?");
				System.out.println("Actually, I don't care. I'm guessing watermelon.");
			}
			else if(answer2.equals("no"))
			{
				System.out.println("Is it a carrot?");
				System.out.println("Actually, I don't care. I'm guessing carrot.");
			}
		}
		if(answer1.equals("mineral"))
		{
			System.out.println("Question 2) Is it bigger than a breadbox?");
			String answer2 = keyboard.next();
			
			if(answer2.equals("yes"))
			{
				System.out.println("Is it a Lamborghini?");
				System.out.println("Actually, I don't care. I'm guessing Lamborghini.");
			}
			else if(answer2.equals("no"))
			{
				System.out.println("Is it a paper clip?");
				System.out.println("Actually, I don't care. I'm guessing paper clip.");
			}
		}
	}

}

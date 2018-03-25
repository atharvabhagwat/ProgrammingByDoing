import java.util.Scanner;

public class TwoMoreQuestions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Think of something!");
		System.out.println("Does it belong inside or outside or both?");
		String answer1 = input.next();
		System.out.println("Is it a living thing?");
		String answer2 = input.next();
		
		if(answer1.equals("inside") && answer2.equals("yes"))
		{
			System.out.println("Is it a houseplant?");
			System.out.println("Honestly, I don't care. Just pretend you were thinking of a houseplant.");
		}
		if(answer1.equals("inside") && answer2.equals("no"))
		{
			System.out.println("It has to be a shower curtain, of course!");
			System.out.println("No? Oh. I don't care. Pretend it's a shower curtain or something.");
		}
		if(answer1.equals("outside") && answer2.equals("yes"))
		{
			System.out.println("What else could you be thinking of besides a bison!");
			System.out.println("Let's hope you were thinking of a bison, if not, then, oh well.");
		}
		if(answer1.equals("outside") && answer2.equals("no"))
		{
			System.out.println("Has to be a billboard.");
		}
		if(answer1.equals("both") && answer2.equals("yes"))
		{
			System.out.println("You must be thinking of a dog.");
		}
		if(answer1.equals("both") && answer2.equals("no"))
		{
			System.out.println("A cellphone!");
		}
	}

}

import java.util.Scanner; // import Scanner utility from java library

public class EvenOrOdd {

	public static void main(String[] args) {
		
		System.out.println("You can use this tool to find out whether a number is even or odd.");
		// system output telling user what this tool does
		System.out.print("Enter an integer: ");
		// system output prompting user to type an integer
		Scanner integer = new Scanner(System.in);
		// assigning variable to scanner system
		int num = integer.nextInt();
		// assigning int variable to next inputted integer
		if(num % 2 == 0)
		// if the remainder of the integer divided by two is equal to zero
		{
			System.out.println("The number you entered is even.");
			// state the number is even
		}
		else
		// if the remainer is not zero
		{
			System.out.println("The entered number is odd.");
			// state the number is odd
		}
	}
}

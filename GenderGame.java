import java.util.Scanner;

public class GenderGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("First name: ");
		String firstname = input.next();
		System.out.println("Last name: ");
		String lastname = input.next();
		System.out.println("What is your gender? (M or F)");
		String gender = input.next();
		System.out.println("Age: ");
		int age = input.nextInt();
		
		if(gender.equals("M") && age >= 20)
		{
			System.out.println("Then I shall call you Mr. " + firstname + " " + lastname);
		}
		if(gender.equals("M") && age < 20)
		{
			System.out.println("Then I shall call you " + firstname + " " + lastname);
		}
		
		if(gender.equals("F") && age >= 20)
		{
			System.out.println("Are you married, " + firstname + "? (Y or N)");
			String maritalstatus = input.next();
			{
				if(maritalstatus.equals("Y"))
				{
					System.out.println("Then I shall call you Mrs. " + firstname + " " + lastname);
				}
				if(maritalstatus.equals("N"))
				{
					System.out.println("Then I shall call you Ms. " + firstname + " " + lastname);
				}
			}
		}
		if(gender.equals("F") && age < 20)
		{
			System.out.println("Then I shall call you " + firstname + " " + lastname);
		}
	}
}

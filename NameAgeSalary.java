import java.util.Scanner;

public class NameAgeSalary {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		double salary;
		boolean give_me_money;
		
		System.out.println("Hello, what is your name?");
		name = keyboard.next();
		
		System.out.println("Hello, " + name + "! How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("AH! That's so old! Didn't the dinosaurs exist " + age + " years ago?! How much do you make?");
		salary = keyboard.nextDouble();
		
		System.out.println("$" + salary + " is pretty good. Want to give that money to me? (State \"True\" for Yes or \"False\" for No)");
		give_me_money = keyboard.nextBoolean();
		
		if(give_me_money==true) {
			System.out.println("HAHAHAHAHAHA. Money is mine.");
		}
		else
		{
			System.out.println("No I think you should give me the money.");
		}
	}

}

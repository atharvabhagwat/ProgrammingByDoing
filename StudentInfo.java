import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String firstname, lastname, login;
		int grade;
		long studentID;
		double GPA;
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		
		System.out.println("First Name:");
		firstname = keyboard.next();
		
		System.out.println("Last Name:");
		lastname = keyboard.next();
		
		System.out.println("Grade (9-12):");
		grade = keyboard.nextInt();
		
		System.out.println("Student ID:");
		studentID = keyboard.nextLong();
		
		System.out.println("Login:");
		login = keyboard.next();
		
		System.out.println("GPA (0.0 - 4.0):");
		GPA = keyboard.nextDouble();
		
		System.out.println("Your Information:");
			System.out.println("Name: " + firstname + " " + lastname);
			System.out.println("Login: " + login);
			System.out.println("Grade: " + grade);
			System.out.println("Student ID: " + studentID);
			System.out.println("GPA: " + GPA);
	}

}

import java.util.*;	// import required libraries
public class students_marks {

	public static void main(String[] args) {
		int maths, physics, chem, eng, compsci,studentnumber;	// variables that are to be integers
		double finalscore;	// variables that are to be doubles
		
		Scanner marks = new Scanner(System.in);	// variable for user input using Scanner
		System.out.println("How many students do you have?");	// system output to user
		studentnumber = marks.nextInt();	// user input is assigned to a variable
		
	for(int i=0;i<studentnumber;i++)
		{
			System.out.println("Enter Marks for Maths:");	// system output to user
			maths = marks.nextInt();	// user input is assigned to a variable
			System.out.println("Enter Marks for Physics:");	// system output to user
			physics = marks.nextInt();	// user input is assigned to a variable
			System.out.println("Enter Marks for Chemistry:");	// system output to user
			chem = marks.nextInt();	// user input is assigned to a variable
			System.out.println("Enter Marks for English:");	// system output to user
			eng = marks.nextInt();	// user input is assigned to a variable
			System.out.println("Enter Marks for Computer Science:");	// system output to user
			compsci = marks.nextInt();	// user input is assigned to a variable
			finalscore = (maths+physics+chem+eng+compsci)/5;	// variable assigned to average of test scores
			
			if(finalscore > 90)	// if the final score is greater than 90
			{
				System.out.println("Excellent");	// state "Excellent"
			}
			else if (finalscore > 80)
			{
				System.out.println("Very Good");
			}
			else if (finalscore > 60)
			{
				System.out.println("Good");
			}
			else if (finalscore > 40)
			{
				System.out.println("Average");
			}
			else
			{
				System.out.println("Poor");
			}
						
		}

	}

}

import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double height, mass, BMI;
		
		System.out.println("What is your height (in meters)?");
		height = keyboard.nextDouble();
		
		System.out.println("What is your mass (in kilograms)?");
		mass = keyboard.nextDouble();
		
		BMI = (mass / (height*height));
		System.out.println("Your BMI is " + BMI);
		if(BMI<=15)
		{
			System.out.println("Very severely underweight.");
		}
		else if(BMI<=16)
		{
			System.out.println("Severely underweight.");
		}
		else if(BMI<=18.5)
		{
			System.out.println("Underweight.");
		}
		else if(BMI<=25)
		{
			System.out.println("Normal (healthy weight).");
		}
		else if(BMI<=30)
		{
			System.out.println("Overweight.");
		}
		else if(BMI<=35)
		{
			System.out.println("Obese Class I (Moderately Obese).");
		}
		else if (BMI<=40)
		{
			System.out.println("Obese Class II (Severely Obese).");
		}
		else
		{
			System.out.println("Obese Class III (Very Severely Obese).");
		}
	}

}

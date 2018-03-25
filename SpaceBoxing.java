import java.util.Scanner;

public class SpaceBoxing {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int weight; 
		String planet;
		
		System.out.println("Please enter your current weight on earth:");
		weight = in.nextInt();
		
		System.out.println("I have information for the following planets:");
		System.out.println("Venus		Mars		Jupiter");
		System.out.println("Saturn		Uranus		Neptune");
		
		System.out.println("Which planet are you visiting?");
		planet = in.next();
		
		if(planet.equalsIgnoreCase("venus"))
		{
			System.out.println("Your weight on Venus would be " + (weight*0.78) + " pounds.");
		}
		if(planet.equalsIgnoreCase("mars"))
		{
			System.out.println("Your weight on Mars would be " + (weight*0.39) + " pounds.");
		}
		if(planet.equalsIgnoreCase("jupiter"))
		{
			System.out.println("Your weight on Jupiter would be " + (weight*2.65) + " pounds.");
		}
		if(planet.equalsIgnoreCase("saturn"))
		{
			System.out.println("Your weight on Saturn would be " + (weight*1.17) + " pounds.");
		}
		if(planet.equalsIgnoreCase("uranus"))
		{
			System.out.println("Your weight on Uranus would be " + (weight*1.05) + " pounds.");
		}
		if(planet.equalsIgnoreCase("neptune"))
		{
			System.out.println("Your weight on Neptune would be " + (weight*1.23) + " pounds.");
		}
	}

}

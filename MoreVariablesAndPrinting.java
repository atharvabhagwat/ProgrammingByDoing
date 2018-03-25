
public class MoreVariablesAndPrinting {

	public static void main(String[] args) {
		// state variables that are to be strings
		String myName, myEyes, myTeeth, myHair;
		
		// state variables that are to be integers
		int myAge, myHeight, myWeight;
		
		// provide values for variables
		myName = "Atharva Bhagwat";
		myAge = 15;
		myHeight = 73;
		myWeight = 200;
		myEyes = "Dark Brown";
		myTeeth = "White";
		myHair = "Black";
		
		// create system outputs using variables
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " inches tall and " + myWeight + " pounds.");
		System.out.println("He has " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("His teeth should be " + myTeeth + ", assuming he brushes his teeth daily.");
		
		// create one sentence with all variables
		System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight
	            + " I get " + (myAge + myHeight + myWeight) + "." );
	}

}

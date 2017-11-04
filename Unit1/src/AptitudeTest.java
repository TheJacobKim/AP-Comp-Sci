import java.util.Scanner;

public class AptitudeTest 
{

	public static void main(String[] args) 
	{
		boolean bothHigh = false;	//Initialize boolean variables to false
		boolean oneHigh = false;
		boolean Moderate = false;
		
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please enter first score: ");	//Input scores
		int firstScore = Keyboard.nextInt();
		System.out.print("Please enter second score: ");
		int secondScore = Keyboard.nextInt();
		
		if(firstScore >= 90 && secondScore >= 90)	//both scores are high
			bothHigh = true;
		else if(firstScore >= 90 || secondScore >= 90)	//either one of the score is high
			oneHigh = true;
		else if((firstScore >= 70 && secondScore >= 50) || (firstScore >= 50 && secondScore >= 70))	//both scores are moderate
			Moderate = true;
		
		if(bothHigh == true)									//Print results
			System.out.print("Qualified to be a manager");
		else if(oneHigh == true)
			System.out.print("Qualified to be a supervisor");
		else if(Moderate == true)
			System.out.print("Qualified to be a clerk");
		else													//If all the boolean variables stay false, no job :(
			System.out.print("Not qualified for any postion");

	}

}

import java.util.Scanner;

public class WhileLoopPractice 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many scores do you want to enter? (No negative number plz)");  //enter the number of scores
		double num = keyboard.nextDouble();
		
		int n = 0;
		double TotalScore = 0;
		int temp = 0;
		
		while(n < num)
		{
			System.out.print("Enter a score : "); //Enter the individual scores
			temp = keyboard.nextInt();		      // temporary
			if(temp < 0)
				break; 							  // break if the score is negative
			TotalScore += temp;
			n++;								  // increase the count
		}
		
		if(temp < 0)
			System.out.print("Do not enter a negative score plz."); //Print warning
		else
			System.out.print("The average is : " + TotalScore/num); //Print the average
		
		keyboard.close();
	}

}

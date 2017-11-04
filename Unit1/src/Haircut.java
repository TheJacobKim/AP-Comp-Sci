import java.util.Scanner;

public class Haircut 
{

	public static void main(String[] args) 
	{
		Scanner Keyboard = new Scanner(System.in);

		while(true)
		{
			//Input gender and age
			System.out.print("Please enter your gender(M or F) and age in order");
			System.out.println();
			String Gender = Keyboard.nextLine();
			int Age = Keyboard.nextInt();
			
			//Male haircut price
			if(Gender.equals("M"))
			{
				if(Age <= 13)
					System.out.println("Your cost of haircut is $10");
				else
					System.out.println("Your cost of haircut is $15");
			}
			
			//Female haircut price
			else if(Gender.equals("F"))
			{
				if(Age <= 13)
					System.out.println("Your cost of haircut is $12");
				else
					System.out.println("Your cost of haircut is $25");
			}
			
			//Invalid input
			else
				System.out.println("INVALID INPUT!");
			
			//Do you want to proceed
			System.out.println("Do you want to get the price of another customer? (Y or N)");
			Keyboard.nextLine();	//hate this Java bug
			String Repeat = Keyboard.nextLine();
			
			//We are done here
			if(Repeat.equals("N"))
				break;
		}
	}
/*
 * Well, it's about damn time Jacob Kim
 * You do well with not having invalid inputs mess up your program
 * Ignoring casing is a very good idea, but you should have done it at Male or Female too
 * 
 */
}

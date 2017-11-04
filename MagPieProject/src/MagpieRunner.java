import java.util.Scanner;

/**
 * This is a simple "test class" used to run a Magpie object.
 * Based on program written by @author Laurie White
 * Updated by Ms. Thompson November 2016
 */

public class MagpieRunner
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner (System.in);
		Magpie maggie = new Magpie();	
		System.out.println (maggie.getGreeting());
		String statement = reader.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = reader.nextLine();
		}
	}

}

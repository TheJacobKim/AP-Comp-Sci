import java.text.DecimalFormat;
import java.util.*;

public class KeepTheChange 
{
	public static void main(String[] args) 
	{

		DecimalFormat df = new DecimalFormat("0.00");
		Scanner keyboard = new Scanner(System.in);
		int Again = 1;
		double Total = 0;

		while (Again == 1)
		{
			System.out.print("Please enter a dollar amount: ");
			double Amount = keyboard.nextDouble();

			System.out.println("Total charge to credit is : $" + Math.ceil(Amount));

			int Charge = (int) (Math.ceil(Amount));

			System.out.println("Amount transferred to saving is : $" + df.format(Charge - Amount));
			Total += (Charge - Amount);
			
			System.out.print("Do you want to proceed? (y or n) : ");
			keyboard.nextLine();
			String Proceed = keyboard.nextLine();

			if (Proceed.equals("y")) 
			{
				Again = 1;
			} 
			else if(Proceed.equals("n"))
			{
				Again = 0;
			}
			else
			{
				System.out.print("plz type y or n!");
				Again = 0;
			}
			
		}
		
		System.out.println();
		System.out.println("Your total saving is : "+ df.format(Total));
		keyboard.close();
	}

}

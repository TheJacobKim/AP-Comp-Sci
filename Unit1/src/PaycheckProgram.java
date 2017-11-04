import java.text.DecimalFormat;
import java.util.Scanner;

public class PaycheckProgram 
{

	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner keyboard = new Scanner(System.in);
		
		//Input Data
		System.out.print("Regular hours worked: ");		//Input Regular hours worked
		int RegHour = keyboard.nextInt();
		
		System.out.print("Overtime hours worked: ");	//Input Overtime hours worked
		int OvrHour = keyboard.nextInt();
		
		System.out.print("Wage: ");						//Input Wage
		Double Wage = keyboard.nextDouble();
		
		System.out.print("Percent (1~100) to put in savings: : ");	//Input Percent Saving
		Double PercentSav = keyboard.nextDouble();
		
		System.out.println("---------------------------------");
		
		//Math for the results
		double Normpay = RegHour*Wage;								//Normal pay
		double Overpay = OvrHour*Wage*1.5;							//Over pay
		double Saving = (Normpay+Overpay)*(PercentSav/100);			//Saving
		double Tax = ((Normpay+Overpay)-Saving)*0.2;				//Tax
		double Paycheck = ((Normpay + Overpay) - Saving)*0.8;		//Paycheck
		
		//Output
		System.out.println("You earned $" + df.format(Normpay) + " from normal working hours.");
		System.out.println("You earned $" + df.format(Overpay) + " from overtime hours.");
		System.out.println("You put $" + df.format(Saving) + " into your savings");
		System.out.println("You payed $" + df.format(Tax) + " in taxes");
		System.out.println("Your paycheck is $" + df.format(Paycheck));
		
		keyboard.close();
		
	}

}

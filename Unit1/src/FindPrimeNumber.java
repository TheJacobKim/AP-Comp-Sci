import java.util.Scanner;

public class FindPrimeNumber
{
	public static void main(String[] args)
	{

		Scanner Keyboard = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = Keyboard.nextInt();					//Input Value
		int PrimeCheck = 0;
		
		for(int i=2; i < num; i++)
		{
			int Remainder = num % i;									//Divide the number
			if(Remainder == 0)											//If remainder equals 0
			{
				System.out.println(num + " is NOT a prime number.");	//It is not a prime number
				System.out.println(num + " is divisible by " + i);
				PrimeCheck++;
				break;
			}
		}
		
		if(PrimeCheck == 0)
		{
			System.out.print(num + " is a prime number.");				// It is a prime number
		}
		
	}
}

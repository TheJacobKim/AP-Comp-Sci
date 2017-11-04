
public class ShortMethods 
{
	public static void main(String[] args) 
	{
//		An integer is “near” a number if it is within 10. Given an integer, return true if it is “near” 100 or 200. 
//		Given two integers, return true if one of them is between 10 and 30 and the other one is not. 
//		Given an integer, return the last digit. For example, if the number is 15332, return 2. 
//		Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. 
//		Given three integers, return the smallest.

	// Print everything in the main method
	 System.out.println("Near Method: " + Near(111));
	 System.out.println("Between 10 and 30 Method : " + Between(10, 30));
	 System.out.println("Last Digit Method : " + LastDigit(10));
	 System.out.println("EitherSix : " + EitherSix(10, 6));
	 System.out.println("Smallest : " + Smallest(10, 6, 1));
	}
	
	static boolean Near(int x)
	{
		if(Math.abs(x-100) <= 10 || Math.abs(x-200) <= 10)
			return true;
		else
			return false;
	}
	static boolean Between(int x, int y)
	{
		return((x>=10 && x<=30 || !(y>=10 && y<=30)) || (y>=10 && y<=30 || !(x>=10 && x<=30)));
	}
	
	static int LastDigit(int x)
	{
		return(x%10);
	}
	
	static boolean EitherSix(int a, int b)
	{
		if(a==6 || b==6)
			return true;
		else if((a-b)==6 || (a+b)==6)
			return true;
		else
			return false;
	}
	
	static int Smallest(int a, int b, int c)
	{
		if(a<=b && a<=c)
			return a;
		else if(b<=a && b<=c)
			return b;
		else
			return c;
	}
}

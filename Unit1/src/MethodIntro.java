/*
 * Introduction to Methods
 * Created by Ms. Thompson
 * Use  this code to learn how methods communicate with each other
 */ 

public class MethodIntro 
{
	public static void main(String[] args)
	{ 
		System.out.println("Program starts here.");
		boolean isPositive = method3(-4.5);
		System.out.println(isPositive);
		System.out.println("Program ends here." + method2());
	}
	
	static void yolo()
	{
		System.out.println("Printing in method1");
	}
	
	static int method2()
	{
		int x = 2+3;
		return x;
	}
	
	static boolean method3(double a)
	{
		//return true if a is positive, return false otherwise
		if(a>0)
			return true;
		else
			return false;
	}
}

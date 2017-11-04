
public class IntroRecursion {

	public static void main(String[] args) 
	{
		//calculate the sum of the numbers 1 to 4
		System.out.println(sum1());
		
		//calculate the sum recursively
		System.out.println(recursiveSum(4));
	}
	
	public static int sum1()
	{
		System.out.println("In sum1");
		return 1 + sum2();
	}
	public static int sum2()
	{
		System.out.println("In sum2");
		return 1+sum3();
	}
	public static int sum3()
	{
		System.out.println("In sum3");
		return 1+sum4();
	}
	public static int sum4()
	{
		System.out.println("In sum4");
		return 1;
	}
	
	public static int recursiveSum(int x)
	{
		if(x == 1)
		{
			System.out.println("x is now 1, now go back up!");
			return 1;
		}
		else
		{
			System.out.println("x is now " + x);
			int answer = 1 + recursiveSum(x-1);
			System.out.println("answer is now " + answer);
			return answer;
		}
	}

}

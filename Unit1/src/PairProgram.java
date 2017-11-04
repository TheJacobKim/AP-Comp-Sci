import java.util.Scanner;
public class PairProgram 
{
	public static void main(String[] args) 
	{
//		int x = 100;
//		while(x >= 1)
//		{
//			System.out.println(x);
//			x-=2;
//		}
//		int x=0;
//		while(x<=100){
//			x++;
//			if(x%7==0){
//				System.out.println(x);
//			}
//		}
//		long sum = 0;
//		int x = 0;
//		do
//		{
//			x++;
//			sum += x;
//			
//		}
//		while(sum < 1000000);
//		System.out.println(x);
		
		System.out.print("What is the number you want to find factorial of? : ");
		Scanner Keyboard = new Scanner(System.in);
		int num = Keyboard.nextInt();
		int x = 0;
		int product = 1;
		while(x<num)
		{
			x++;
			product *= x;
		}
		System.out.println(num + "! = " + product);
		
	}
}

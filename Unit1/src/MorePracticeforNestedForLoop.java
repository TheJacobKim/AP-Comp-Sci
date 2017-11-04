public class MorePracticeforNestedForLoop 
{

	public static void main(String[] args) 
	{
		// First
		System.out.println("First");
		for(int i = 5; i > 0; i--)
		{
			for(int j = i; j > 0; j--)
			{
				System.out.print("😂");
			}
			System.out.println();
		}	// Set i = 5 and decrease it by one
		
		System.out.println();
		System.out.println("Second");

		//Second
		
		for(int i=0; i<5; i++)
		{
			for(int k=0; k<i; k++)
				System.out.print(" ");
			for(int j=5; j>i; j--)
				System.out.print("😂 "); //this space after * was the key
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Third");
		
		//Third
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < i; j++)
				System.out.print(" ");
			for(int k = 5; k > i; k--)
				System.out.print("😂");
			System.out.println();
		}		//Same thing as the first one, but with the space
		
		System.out.println();
		System.out.println("Fourth");
		//Fourth
		for(int i = 0; i < 7; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if((i+j)%2 == 0)	// Use if statements to find odd and even numbers
					System.out.print("😂 ");
				else if((i+j)%2 == 1)	//Even number = 0, Odd number = #
					System.out.print("# ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Fifth");
		//Fifth
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if((i+j)%2==0)		// Same thing as the fourth one
					System.out.print("😂 ");
				else if((i+j)%2==1)
					System.out.print("😴 ");
			}
			System.out.println();
		}
		
		//Sixth
		System.out.println();
		System.out.println("Sixth");

		for(int i=7; i>=-7; i--)			
		{
			for(int k=0; k<Math.abs(i); k++)	//Absolute value was the key
				System.out.print("- ");
			for(int j=7; j>=Math.abs(i); j--)
			{
				System.out.print("😂");
				if(j<7)
					System.out.print("😂");
			}
			for(int k=0; k<Math.abs(i); k++)
				System.out.print("- ");
			System.out.println();
		}
	}
}

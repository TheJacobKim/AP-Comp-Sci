import java.util.Scanner;

public class StringPractice 
{
	public static void main(String[] args) 
	{
		Scanner k = new Scanner(System.in);
		System.out.print("Please enter a word at least 3 characters long: ");
		String word1 = k.nextLine();
		String word2 = k.nextLine();
			
		System.out.println(Comparisons(word1, word2));
			
	}

	public static String Comparisons (String a, String b)
	{
		if(a.compareTo(b) < 0)
			return a;
		else if(a.compareTo(b) > 0)
			return b;
		else
			return a;
	}
}

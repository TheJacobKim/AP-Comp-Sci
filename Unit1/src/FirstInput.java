import java.util.*;
public class FirstInput 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		/*
		System.out.print("Please enter a word: ");
		String word = keyboard.nextLine();
		System.out.println("The word is " + word);
		
		System.out.print("Please enter an integer: ");
		int num = keyboard.nextInt();
		System.out.println("The number is " + num);
		*/
		
		//What's your name?
		//birthday
		
		System.out.print("What is your name? : ");
		String Name = keyboard.nextLine();
		System.out.println("I love your name " + Name + "!");

		System.out.println();
		
		//"eat up" the enter key that came after the 67
		System.out.print("How old are you? : ");
		int Age = keyboard.nextInt();
		System.out.println("I am " + (Age+3));
	}

}

import java.util.Scanner;

public class WhatShouldIDo 
{

	public static void main(String[] args) 
	{
		boolean before7 = false;
		boolean likeRead = false;
		boolean niceOut = false;
		
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("What time is it? ");
		int Time = Keyboard.nextInt();
		if(Time < 19)
			before7 = true;
		
		System.out.print("Do you like to read? ");
		int Read = Keyboard.nextInt();
		if(Read == 1)
			likeRead = true;
		
		System.out.print("Is it nice outside? ");
		int Weather = Keyboard.nextInt();
		if(Weather == 1)
			niceOut = true;
		
		if(niceOut && before7)
			System.out.print("Go for a walk!");
		else if((!niceOut || before7) && likeRead)
			System.out.print("Read a book");
		else
			System.out.print("Watch TV");
	}

}

import java.util.*;
public class Geometry 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi! I can find a cicumference and area for a circle \\ What do you want to find?");
		System.out.print("(circumference = c / area = a)");
		String Find = keyboard.nextLine();
		
		System.out.print("What is the radius of your circle?");
		double Radius = keyboard.nextDouble();
		
		if(Find.equals("c"))
		{
			double Answer = Radius*2*Math.PI;
			System.out.print("The circumference of your circle is "+ Answer);
		}
			
		else if(Find.equals("a"))
		{
			double Answer = Math.PI * Radius * Radius;
			System.out.println("The area of your circle is " + Answer +"!");			
		}

		else
		{
			System.out.println("You should type either 'c' or 'a'!" );
		}
	}
}
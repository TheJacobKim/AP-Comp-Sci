import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What it your pyramid made of? (press an alphabet or a symbol): ");
		String shape = keyboard.nextLine();
		System.out.println("The pyramid is made of " + "'" + shape + "'");
		System.out.println("");

		System.out.print("How high is your pyramid? : ");
		int height = keyboard.nextInt();
		System.out.println("The height is " + height);
		System.out.println("");

		for (int i = height; i > 0; i--) 
		{
			for (int k = height; k > height - i; k--) 
			{
				System.out.print(" ");
			}
			for (int j = i; j < height; j++) 
			{
				System.out.print(shape);
			}
			for (int j = i - 1; j < height; j++) 
			{
				System.out.print(shape);
			}
			System.out.println("");
		}
		System.out.print("Illuminati confirmed. ಠ_ಠ ");
	}
}

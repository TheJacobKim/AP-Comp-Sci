import java.util.Scanner;

public class PasseordChecker {

	public static String CreatePassword() 
	{
		String whydothis = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String password= "";
		int i,length;
		length = (int) (10*Math.random()+1);
		for(int j=0; j<length; j++)
		{
			i = (int) (52*Math.random() +1)-1;
			password += whydothis.charAt(i);
		}
		return password;
	}

	public static void main(String[] args)
	{
		String psw = CreatePassword();
		String SwitchedPsw = "";
		Scanner k = new Scanner(System.in);
		System.out.println("Length of the password: " + psw.length());
		//System.out.println(psw);
		System.out.println("Guess the password five times.");
		String guess1 = k.nextLine();
		String guess2 = k.nextLine();
		String guess3 = k.nextLine();
		String guess4 = k.nextLine();
		String guess5 = k.nextLine();
		
		for(int i=0; i<psw.length(); i++)
		{
			if(Character.isUpperCase(psw.charAt(i)))
			{
				SwitchedPsw += (psw.substring(i,i+1)).toLowerCase();
			}
			else if(Character.isLowerCase(psw.charAt(i)))
			{
				SwitchedPsw += (psw.substring(i,i+1)).toUpperCase();
			}
		}
		if(guess1.equals(psw) || guess2.equals(psw) || guess3.equals(psw) || guess4.equals(psw) || guess5.equals(psw) || guess1.equals(SwitchedPsw) || guess2.equals(SwitchedPsw) || guess3.equals(SwitchedPsw) || guess4.equals(SwitchedPsw) || guess5.equals(SwitchedPsw))
			System.out.println("Your guess is correct! \nThe password is: " + psw);
		
		else
			System.out.println("All your guesses are incorrect! \nThe password is: " + psw);
		
		System.out.println("\nSwitched Password: " + SwitchedPsw);

	}

}

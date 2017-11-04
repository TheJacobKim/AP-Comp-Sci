import java.util.ArrayList;
public class PirateParrot extends Parrot
{
	public static void main(String[] args)
	{
		Parrot p = new PirateParrot("P");
		PirateParrot p1=new PirateParrot("P1");
		Parrot p2=new PirateParrot("P2");
		PirateParrot p3=new PirateParrot("P3");
		ArrayList<Parrot> parrots=new ArrayList<Parrot>();
		parrots.add(p);
		parrots.add(p1);
		parrots.add(p2);
		parrots.add(p3);
		for (Parrot i:parrots)
		{
			i.train("Hello");
			i.train("Who am I");
			System.out.println(i.speak());
			if (i instanceof PirateParrot)
				((PirateParrot) i).stealSouls(12);
		}
	}

	public PirateParrot(String name)
	{
		super("pete");
		train("Polly want a cracker");
	}
	
	public void stealSouls(int a)
	{
		setAge(a+getAge());
	}
	
	public void otherMethod()
	{
		System.out.println("Other!");
	}

}

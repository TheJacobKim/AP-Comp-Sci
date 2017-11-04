
public class robotArmy 
{
	private Robot[] bots;
	private int numRobots;
	
	public robotArmy()
	{
		bots = new Robot[10];
		numRobots = 0;
	}
	public void addRobots()
	{
		bots[numRobots] = new Robot(numRobots);
		numRobots++;
	}
	public void makeEivlArmy()
	{
		for(int i=0; i<numRobots; i++)
		{
			bots[i].setAttackMode(true);
			bots[i].act();
		}
	}
	public static void main(String[] args)
	{
		robotArmy r = new robotArmy();
		r.addRobots();
		r.addRobots();
		r.addRobots();

		r.makeEivlArmy();
	}
}

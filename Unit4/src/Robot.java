public class Robot 
{
	private int id; //identification number for each robot
	private boolean attackMode; //can be true or false
	
	public Robot(int num) //parameter num is the id number
	{
		id = num;
		attackMode = false;
	}
	
	public void setAttackMode(boolean b) //set to true or false
	{
		attackMode = b;
	}
	
	public void act() //act depending on what attackMode is set to
	{
		if(attackMode)
		{
			System.out.println("Death to humans!");
		}
		else
			System.out.println("How may I help you?");
	}

}

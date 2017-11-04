
public class SoccerPlayer 
{
	private String name;
	private String position;
	private int goals;
	private int gamesWon;

	//Constructor
	public SoccerPlayer(String Name, String Position) 
	{
		name = Name;
		position = Position;
		gamesWon = 0;
		goals = 0;
	}

	//get method for four instance variable
	public String getName()
	{
		return name;
	}
	public String getPosition()
	{
		return position;
	}
	public int getGoals()
	{
		return goals;
	}
	public int getGamesWon()
	{
		return gamesWon;
	}
	
	//This is where you play soccer.
	public void PlayGame(SoccerPlayer other)
	{
		String str;
		int p1goal =0, p2goal = 0;
		
		p1goal = 1 + (int)(Math.random()*5); // get goals for players
		p2goal = 1 + (int)(Math.random()*5);
		
		str = "Score: " + this.name + " " + p1goal +" "+ other.name +" "+ p2goal;
		System.out.println(str);

		this.goals += p1goal;
		other.goals += p2goal;
		
		//add gameswon to each player's score
		if(p1goal > p2goal) 
		{
			this.gamesWon ++;
			System.out.println(this.name + " won the game!\n");
		}
		else if(p1goal < p2goal)
		{
			other.gamesWon++;
			System.out.println(other.name + " won the game!\n");
		}
		else
			System.out.println("There was a tie.\n");
		
	}
}

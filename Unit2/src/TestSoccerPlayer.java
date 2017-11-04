
public class TestSoccerPlayer 
{
	public static void main(String[] args) 
	{
		SoccerPlayer p1 = new SoccerPlayer("Jessie", "Forward");
		SoccerPlayer p2 = new SoccerPlayer("Amy", "Keeper");
		//run it four times
		for(int i=0; i<4; i++)
			p1.PlayGame(p2);
		
		//get player's goal and gameswon from SoccerPlayer class
		int p1goals = p1.getGoals();
		int p2goals = p2.getGoals();
		int p1wins = p1.getGamesWon();
		int p2wins = p2.getGamesWon();
		
		//check who scored more goals
		if(p1goals > p2goals)
			System.out.println(p1.getName() + " scored more goals. 👍");
		else if(p1goals < p2goals)
			System.out.println(p2.getName() + " scored more goals. 👍");
		else
			System.out.println("There was a tie. 👌");
		
		//check who won more games
		if(p1wins > p2wins)
			System.out.println(p1.getName() + " won more games. 🙌");
		else if(p1goals < p2goals)
			System.out.println(p2.getName() + " won more games. 🙌");
		else
			System.out.println("The players won the same number of games. 👌");
		
	}

}

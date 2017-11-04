
public class RacetrackRunner 
{
	public static void main(String[] args)
	{
		String[] names = {"Batmobile", "Herbie", "Delorean", "Optimus"};
		int [] positions = {0, 0, 0, 0};
		
		//make a new Racetrack object
		Racetrack track = new Racetrack(names, positions);
		
		//have all cars race two laps
		track.raceOneLap();
		track.raceOneLap();
		
		//determine winner and print the name and position of it
		Car win = track.determineWinner();
		System.out.println(win.getName() + "  " + win.getPosition());
		
		System.out.println(track);
	}

}


public class Racetrack 
{
	//instance variable that is an array of Cars
	private Car[] racer;
	
	//two parameters: an array of Strings (names) and array of positions
	public Racetrack(String[] name, int[] pos)
	{
		racer = new Car[name.length];
		for(int i = 0; i < racer.length; i++)
		{
			racer[i] = new Car(name[i], pos[i]);
			//name and position and racer are all PARALLEL ARRAYS
			//their indexes all get paired together
		}
	}
	
	//raceOneLap
	//choose a random value to accelerate each car
	//then have each car move at that speed
	public void raceOneLap()
	{
		for(int i = 0; i < racer.length; i++)
		{
			int rand = (int)(Math.random()*10);
			racer[i].accelerate(rand);
			racer[i].move();
		}
	}
	
	//determineWinner
	//return the car object that has the biggest position
	public Car determineWinner()
	{
		Car winner = racer[0];
		for(int i = 0; i < racer.length; i++)
		{			
			if(racer[i].getPosition() > winner.getPosition())
			{
				winner = racer[i];
			}
		}
		return winner; 
	}
	
	public String toString()
	{
		String str = "";
		for(Car x : racer)
		{
			str += x.getName() + " " + x.getPosition() + "\n";
		}
		
		return str;
	}
	
	
	
	
	
	
	
	
	
}

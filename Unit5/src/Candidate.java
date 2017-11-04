
public class Candidate 
{
	private int idNumber; //candidate's ID number
	private String position; //job position of candidate 
	private double score; //candidate's interview score
	
	public Candidate(int id, String pos, double sco)
	{
		idNumber = id;
		position = pos;
		score = sco;
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public double getScore()
	{
		return score;
	}
	
	public String toString()
	{
		return "\nID: " + idNumber + "\tPosition: " + position + "\tScore: " + score;
	}

}


public class Student 
{
	// Instance variables 
	// Each student object has a name and three test scores 
	// The "private" modifier means they cannot be accessed in another class
	public String name;	
	private boolean Lazy;
	private int test1; 	
	private int test2; 		
	private int test3; 		
	
	// Constructor method
	public Student()  // their names have to match
	{
		// Initialize a new student's name to the null string and the scores to zero.
		name = "";
		test1 = 0;
		test2 = 0;
		test3 = 0; 
	}
	
	public Student(String n)  // secondary constructor , sets name when you create the student.
	{
		name = n;
		test1 = 0;
		test2 = 0;
		test3 = 0; 
	}
	
	public Student(String n, int t1, int t2, int t3)  // secondary constructor , sets name when you create the student.
	{
		name = n;
		test1 = t1;
		test2 = t2;
		test3 = t3; 
	}
	
	//Laziness method
	public void setLaziness(boolean a)
	{
		Lazy = a;
	}
	
	// change a student's name 
	public void setName (String nm)
	{
		name = nm; 
	}
	
	// access a student's name
	public String getName ()
	{
		return name;
	}
	
	//set test i to score
	public void setScore (int i, int score)
	{ 
		if (i == 1) 
		    test1 = score;
		else if	(i == 2) 
		    test2 = score;
		else			 
		    test3 = score;
		}
	
	//retrieve score i
	public int getScore (int i)
	{
		if (i == 1) 
		    return test1;
		else if (i == 2) 
		    return test2;
		else	 
		    return test3;
	}
	
	//compute and return the average of the 3 scores
	public double getAverage()
	{
		double average; 
		average = (test1 + test2 + test3)/3.0; 
		return average;
	}
	
	//determine and return the highest of the 3 scores
	public int getHighScore()
	{
		int highScore;
		highScore = test1; //assume highest is test1
		if (test2 > highScore) 
		    highScore = test2;
		if (test3 > highScore) 
		    highScore = test3;
		return highScore;
	}
	
	//construct and return a string representation of the student
	public String toString()
	{
		String str; 
		str = 	"Name: " + name + "\n" + 	//"\n" denotes a newline
				"Test 1: " + test1 + "\n" +
				"Test 2: " + test2 + "\n" +
				"Test 3: " + test3 + "\n" +
				"Average: " + getAverage() +"\n" +
				"Lazy?: " + Lazy + "\n";
		
		return str;
	}
	public String Talk()
	{
		if(Lazy)
			return "I don't wanna do anything!";
		else
			return "I want to do my homeworks!";
	}
}
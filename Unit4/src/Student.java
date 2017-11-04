/*
 * This is the original Student class as it was created in Unit 2
 * Note that this version has three test scores as instance variables
 * Also note there is a constructor which takes four parameters
 *  
 * Use this class for the SeatingChart program
 * DO NOT CHANGE THE CODE IN THIS CLASS!
 */

public class Student {
	// Instance variables 
	// Each student object has a name and three test scores 
	private String name;	//Student name 
	private int test1; 		//Score on test 1
	private int test2; 		//Score on test 2
	private int test3; 		//Score on test 3
	
	// Constructor method
	
	public Student() {
		// Initialize a new student's name to the null string and the scores to zero.
		name = "";
		//test1 = 0;
		test2 = 0;
		test3 = 0;
		name
	}
	
	public Student(String n, int t1, int t2, int t3) {
		// Initialize a new student's name to the null string and the scores to zero.
		name = n;
		test1 = t1;
		test2 = t2;
		test3 = t3; 
	}
	
	// Set a student's name
	public void setName (String name)
	{
		this.name = name; 
	}
	
	// access student's name
	public String getName ()
	{
		return name;
	}
	
	public void setScore (int i, int score){ 
		// Set test i to score 
		if		(i == 1) test1 = score;
		else if	(i == 2) test2 = score;
		else			 test3 = score;
		}
	
	public int getScore (int i){
		//Retrieve score i
		if		(i == 1) return test1;
		else if (i == 2) return test2;
		else			 return test3;
	}
	
	public double getAverage(){
		//Compute and return the average 
		double average; 
		average = (test1 + test2 + test3)/4.0; 
		return average;
	}
	
	public int getHighScore(){
		//Determine and return the highest score
		int highScore;
		highScore = test1;
		if (test2 > highScore) highScore = test2;
		if (test3 > highScore) highScore = test3;
		return highScore;
	}
	
	public String toString()
	{
	// Construct and return a string representation of the student 
		String str; 
		str = 	"Name: " + name + "\n" + 	//"\n" denotes a newline
				"Test 1: " + test1 + "\n" +
				"Test 2: " + test2 + "\n" +
				"Test 3: " + test3 + "\n" +
				"Average: " + getAverage();
		return str;
	}
}
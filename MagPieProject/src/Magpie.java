public class Magpie
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * @param statement is the user statement 
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		//Initializing
		String response = "";
	
		//Call findKeyword method
		if(findKeyword(statement, "no") >= 0)
			response = "Why so negative?";
		
		else if(findKeyword(statement, "cat") >= 0 ||findKeyword(statement, "dog") >= 0 ||findKeyword(statement, "bat") >= 0 ||findKeyword(statement, "pig") >= 0 ||findKeyword(statement, "cow") >= 0)
			response = "I love animals!";
		
		else if(findKeyword(statement, "family") >= 0 ||findKeyword(statement, "mother") >= 0 ||findKeyword(statement, "father") >= 0 ||findKeyword(statement, "brother") >= 0 ||findKeyword(statement, "sister") >= 0 ||findKeyword(statement, "aunt") >= 0 ||findKeyword(statement, "uncle") >= 0 ||findKeyword(statement, "cousin") >= 0)
			response = "Tell me more about your family";
		
		else if(findKeyword(statement, "pray") >= 0 ||findKeyword(statement, "temple") >= 0 ||findKeyword(statement, "angel") >= 0 ||findKeyword(statement, "god") >= 0 ||findKeyword(statement, "church") >= 0)
			response = "Do you believe in God?";
		
		else if(findKeyword(statement, "yes") >= 0 ||findKeyword(statement, "happy") >= 0 ||findKeyword(statement, "love") >= 0)
			response = "I like your positivity!";
		
		else if(findKeyword(statement, "hate") >= 0)
			response = "Hate is a strong word.";
		
		else if(findKeyword(statement, "tennis") >= 0 ||findKeyword(statement, "bowling") >= 0 ||findKeyword(statement, "football") >= 0 ||findKeyword(statement, "baseball") >= 0 ||findKeyword(statement, "basketball") >= 0 ||findKeyword(statement, "soccer") >= 0)
			response = "I love sports!";
		
		//Call RandomResponse, IWantTo and IWant methods.
		else
		{
			if(findKeyword(statement, "I want to") >=0)				//If there is "I want to", call transformIWantToStatement method.
				response = transformIWantToStatement(statement);
			
			else if(findKeyword(statement, "I want") >=0)			//If there is "I want to", call transformIWantStatement method.
				response = transformIWantStatement(statement);
			
			else													//If you got nothing to say, call RandomResponse.
				response = getRandomResponse();
		}
		
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		int i = (int) (4*Math.random()+1);					//Pick a random number
		String response = "";
		
		//According to the random number generated, get a response.
		if(i==1)
			response = "It sounds interesting! Tell me more.";
		if(i==2)
			response = "How's your life?";
		if(i==3)
			response = "Your responses are being monitored by FBI.";
		if(i==4)
			response = "Tell me something interesting.";
		return response;
	}
	
	
	//FOR USE IN ACTIVITY 3
	/**
	 * Search for one word in phrase, making sure it's not part of another word. 
	 * 
	 * @param statement is the string to search
	 * @param goal is the string to search for
	 * @param startPos is the character of the string to begin the search at
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{	
		//lowercase statement and goal.
		statement = statement.toLowerCase() +" ";
		goal = goal.toLowerCase();	
		
		//Finding position of the keyword: goal.
		int where = statement.indexOf(goal);
		
		//Check a character before and after the keyword.
		String after = "";
		String before = "";

		while(where >= 0)
		{
			//If the keyword exists, store 'before' string.
			if(where>0)
				before=statement.substring((where-1),where);
			
			//If the keyword is not at the end of the statement, store 'after' string.
			if((where)+(goal.length())<statement.length())
				after=statement.substring((where)+(goal.length()), (where)+goal.length()+1);
			
			//If before and after string are not characters, the keyword is good.
			if(((before.compareTo("a") < 0 || before.compareTo("z") > 0)) && ((after.compareTo("a") < 0 || after.compareTo("z") > 0)))
				return where;
			
			//Increase the position of the keyword by one.
			where=statement.indexOf(goal, where+1);
		}
		return -1;
	}
	
	//FOR USE IN ACTIVITY 4
	/**
	 * Take a statement with "I want to <something>." and transform it into 
	 * "What would it mean to <something>?"
	 * @param statement the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
	private String transformIWantToStatement(String statement)	//If the statement contains "I want to"
	{
		int where = findKeyword(statement, "I want to");				//Position of "I want to"
		char punctuation = statement.charAt(statement.length() -1 );    //Check if there is a punctuation at the end of the statement.
		
		String something = "";
		
		//If the statement does contain a punctuation, do not add that to 'something'
		if(punctuation == '.' || punctuation == '!' || punctuation == '?' || punctuation == '!' || punctuation == ' ')
			something = statement.substring(where + 9, statement.length()-1);

		else
			something = statement.substring(where + 9, statement.length());

		return "What would it mean to" + something + "?";
	}
	
	
	//FOR USE IN ACTIVITY 4
	/**
	 * Take a statement with "I want <something>." and transform it into 
	 * "Would you really be happy if you had <something>?"
	 * @param statement the user statement, assumed to contain "I want"
	 * @return the transformed statement
	 */
	private String transformIWantStatement(String statement)
	{
		int where = findKeyword(statement, "I want");					 //Position of "I want"
		char punctuation = statement.charAt(statement.length() -1 );	 //Check if there is a punctuation at the end of the statement.
		String something = "";

		//If the statement does contain a punctuation, do not add that to 'something'
		if(punctuation == '.' || punctuation == '!' || punctuation == '?' || punctuation == '!' || punctuation == ' ')
			something = statement.substring(where + 6, statement.length()-1);

		else
			something = statement.substring(where + 6, statement.length());
		
		return "Would you really be happy if you had" + something + "?";
	}
}

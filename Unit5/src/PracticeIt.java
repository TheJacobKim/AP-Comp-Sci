import java.util.*;
public class PracticeIt {

	public static void main(String[] args) 
	{
		ArrayList<String> num = new ArrayList<String>();
		num.add("A");
		num.add("B");
		num.add("C");
		num.add("D");
		num.add("E");
		num.add("F");
		
		//swapPairs(num);
		stutter(num,3);
		System.out.println(num);
	}
	
	public static void swapPairs (ArrayList<String> A)
	{
	    String temp = "";
	    for(int i=0; i<A.size(); i++)
	    {
	        if(i%2==1)
	        {
	            temp = A.get(i-1);
	            A.set(i-1,A.get(i));
	            A.set(i, temp);
	        }
	    }
	}
	public static void stutter (ArrayList<String> A, int k)
	{
	    for(int i=0; i<A.size(); i++)
	    {
	    	int count=0;
	        for(int j=0; j<k-1; j++)
	        {
	        	A.add(i, A.get(i));
	        	count++;
	        }	        	
	    }
	}

}

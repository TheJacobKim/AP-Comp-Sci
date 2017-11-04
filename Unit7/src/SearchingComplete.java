
public class SearchingComplete {
	//code for these searching algorithms taken from APCS Course Outline
	public static void main(String[] args)
	{
		//list of integers in increasing order
		int[] arr = {1, 3, 5, 7, 9, 11, 30, 30, 32, 45};

		//target value (the number we're looking for) is 7
		int tar = 7;

		//call sequential search and store the index in result
		int result = sequentialSearch(arr, tar);

		System.out.println("Target is located at index " + result);
	}

	public static int sequentialSearch(int[] elements, int target) 
	{
		for (int j = 0; j < elements.length; j++) 
		{
			if (elements[j] == target) 
			{
				return j; 
			}
		}
		return -1; 
	}

	public static int binarySearch(int[] elements, int target) 
	{ 
		int left = 0;
		int right = elements.length - 1; 
		while (left <= right) 
		{ 
			int middle = (left + right) / 2; 
			if (target < elements[middle])
				right = middle - 1; 

			else if (target > elements[middle])
				left = middle + 1;

			else
				return middle;
		} 
		return -1; 
	} 


}

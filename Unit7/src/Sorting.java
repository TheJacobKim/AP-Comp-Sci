//code for these sorting algorithms taken from APCS Course Outline
public class Sorting 
{

	public static void main(String[] args) 
	{
		//array of unsorted integers
		int[] arr = {2, 6, 3, 8, 6, 1, 0, 9};
		
		//call insertion sort method 
		//note it doesn't need to return anything because arr is an object
		//so when arr is changed in the method, it's changed everywhere
		insertionSort(arr);
		
		//print all elements on a single line
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}
	
	public static void insertionSort(int[] elements) 
	{
		for (int j = 1; j < elements.length; j++) 
		{
			int temp = elements[j];	//temporary variable to store the value at index j
			int possibleIndex = j;
			while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) 
			{
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--; 
			}
			elements[possibleIndex] = temp; 
		}
	}
	
	public static void selectionSort(int[] elements) 
	{
		for (int j = 0; j < elements.length - 1; j++) 
		{
			int minIndex = j;
			for (int k = j + 1; k < elements.length; k++) 
			{
				if (elements[k] < elements[minIndex]) 
				{
					minIndex = k; 
				}
			}
			int temp = elements[j]; 
			elements[j] = elements[minIndex]; 
			elements[minIndex] = temp;
		}
	}
}
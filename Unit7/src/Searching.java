public class Searching 
{
	public static void main(String[] args)
	{
		int[] arr = {-1, 1, 3, 5, 7, 9, 11, 30, 30, 32, 45};
		
		int tar = 45 ;
		
		//int result = sequentialSearch(arr, tar);
		int result = binarySearch(arr, tar);
		
		System.out.println("Target is located at index " + result);
	}
	
	public static int sequentialSearch(int[] nums, int target) 
	{
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]==target)
				return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[] nums, int target) 
	{ 	
		int max = nums.length;
		int min = 0;
		for(int i=0; i<(Math.log(nums.length)/Math.log(2)); i++)
		{			
			int j=(max+min)/2;
			
			if(nums[j]<target)
				min=j;
			
			if(nums[j]>target)
				max=j;
			
			if(nums[j]==target)
				return j;
		}
		return -1;
	} 
}

import java.util.*;

public class IntroToArrays {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//make a new array called nums, with 5 elements
		int[] nums = new int[5];
		
		//store a 10 in the elemebt at index 2
		nums[2]=10;
		
		//print the LAST element
		System.out.println(nums[2]);
		
		//print the last element, pretending we didn't know length
		System.out.println(nums[nums.length-1]);
		
		nums[0] = keyboard.nextInt();
		nums[1] = keyboard.nextInt();
		nums[3] = keyboard.nextInt();
		nums[4] = keyboard.nextInt();

		
		nums[4] = (nums[0]+nums[1])/2;
		int temp = nums[2];
		nums[2] = nums[3];
		nums[3] = temp;
		
		for(int j=0; j<nums.length; j++)
			System.out.println("nums["+ j +"] = " + nums[j]);
	}

}

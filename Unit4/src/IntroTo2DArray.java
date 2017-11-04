public class IntroTo2DArray 
{

	public static void main(String[] args) 
	{
		int[][] matrix = new int[4][5];
		
		//print all
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length; j++)
			{
				matrix[i][j] = (int)(Math.random() * (24) + 8);
				
				System.out.print((matrix[i][j]) + " ");
			}
			System.out.println();
		}
		
		int[][] stuff ={{1,2,3},{4,5,6}};
		int sum = 0;
		
		for(int[] x : stuff)
		{
			for(int y : x)
			{
				sum+=y;
			}
		}
		System.out.println(sum);
		
	}
	
}

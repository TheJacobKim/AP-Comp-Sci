
public class Array2DMethodPractice 
{
	public static void main(String[] args)
	{
		int[][] basic = new int[][] { {1,2,3}, {4,5,6}, {7,8,9} };
		int[][] allneg = new int[][] { {-10,-12,-3}, {-4,-5,-6,-8}, {-7,-8} }; //all neg and ragged
		int[][] nonsquare = new int[][] { {1,2,3}, {4,5}, {6,7,8,9} };
		int[][] negatives = new int[][] { {1,-2,3}, {4,5,6}, {-7,8,-9} };
		int[][] rowmagic = new int[][] { {1,2,3}, {-1,5,2}, {4,0,2} };
		int[][] colmagic = new int[][] { {1,-1,4,10}, {3,5,0,-6} };
		int[][] latin = new int[][] { {1,2,3}, {2,3,1}, {3,1,2} };
		int[][] notlatin = new int[][] { {1,1,3}, {2,3,1}, {3,1,2} };
		int[][] magic = new int[][] { {2,2,2}, {2,2,2}, {2,2,2}   };
		int[][] notmagic1 = new int[][] { {1,2,3}, {4,5,6}, {6,8,9} }; //diag sums are not equal
		int[][] notmagic2 = new int[][] { {1,5,3}, {4,5,6}, {7,8,9} }; //diag sums are equal but rows are not
        int[][] sequence = new int[][] {{4,7,8},{1,5,9},{2,3,6}};
        
        //This will send the "basic" array to the "max" method and print
        //the result. You can change the method name and the array name 
        //to test different methods on different arrays
        System.out.println("max           " + max(basic));
        System.out.println("rowSum        " + rowSum(basic, 1));
        System.out.println("columnSum     " + columnSum(basic, 1));
        
        System.out.print("allRowSums    ");
        for(int i=0; i<basic.length; i++)
        	System.out.print(allRowSums(basic)[i] +" ");
        System.out.println();

        System.out.print("allColSums    ");
        for(int i=0; i<colmagic.length; i++)
        	System.out.print( allColSums(colmagic)[i] +" ");
        System.out.println();

        System.out.println("isRowMagic    " + isRowMagic(rowmagic));
        System.out.println("isColumnMagic " + isColumnMagic(colmagic));
        System.out.println("isSquare      " + isSquare(nonsquare));
        System.out.println("isMagic       " + isMagic(magic));
        System.out.println("isLatin       " + isLatin(notlatin));
        System.out.println("isSequence       " + isSequence(sequence));

	}
	
	//returns the maximum value in the 2d parameter array a
	public static int max (int[][] a)
	{
		int max = a[0][0];
		for(int[] x : a)
		{
			for(int element : x)
			{
				max=Math.max(element, max);
			}
		}
		return max;
	}
	
	//returns the sum of the elements in Row x of a
	public static int rowSum(int[][] a, int x)
	{
		int sum = 0;
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[i].length; j++)
				if(i==x)
					sum+=a[i][j];

		return sum;
	}
	
	//returns the sum of the elements in Column x of a 
	//(be careful with rows of different lengths!)
	public static int columnSum(int[][] a, int x)
	{
		int sum = 0;
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[i].length; j++)
				if(j==x)
					sum+=a[i][j];

		return sum;
	}
	
	//calculates the row sum for every row and returns each of the 
	//values in an array. Index i of the return array contains the 
	//sum of elements in row i.
	public static int[] allRowSums(int[][] a)
	{
		int[] RowSum = new int[a.length];
		for(int i=0; i<a.length; i++)
			RowSum[i]=rowSum(a,i);

		return RowSum;
	}
	
	//calculates the column sum for every column and returns each of the 
	//values in an array. Index i of the return array contains the 
	//sum of elements in column i.
	public static int[] allColSums(int[][] a)
	{
		int[] ColSum = new int[a.length];
		for(int i=0; i<a.length; i++)
			ColSum[i]=columnSum(a,i);
		
		return ColSum;
	}
	
	//checks if the array is row-magic 
	//(this means that every row has the same row sum)
	//HINT: use a method you already wrote!
	public static boolean isRowMagic(int[][] a)
	{
		int[] RowSum = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			int sum = 0;
			for(int j=0; j<a[i].length; j++)
			{
				sum+=a[i][j];
			}
			RowSum[i]=sum;
		}
		int yo = RowSum[0];
		for(int i=0; i<RowSum.length; i++)
	        if(!(RowSum[i] == yo))
	        	return false;
		return true;
	}
	
	//checks if the array is column-magic 
	//(this means that every column has the same column sum)
	//HINT: use a method you already wrote!
	public static boolean isColumnMagic(int[][] a)
	{
		int[] ColSum = new int[a.length];
		ColSum=allColSums(a);
		
		int yo = ColSum[0];
		for(int i=0; i<ColSum.length; i++)
	        if(!(ColSum[i] == yo))
	        	return false;
		return true;
	}
	
	//checks if the array is square 
	//(i.e. every row has the same length as a itself)
	public static boolean isSquare(int[][] a)
	{
		int yo = a[0].length;
		for(int i=0; i<a.length; i++)
		{
			if(yo!=a[i].length)
				return false;
		}
		return true;
			
	}
	
	//checks if the array is a magic square. 
	//This means that it must be square, and that all row sums, 
	//all column sums, and the two diagonal-sums must all be equal
	public static boolean isMagic(int[][] a)
	{
		if(!(isSquare(a)))
			return false;
		
		int[] RowSum = new int[a.length];
		int[] ColSum = new int[a.length];
		int[] Diag1Sum = new int[a.length];
		int[] Diag2Sum = new int[a.length];

		for(int i=0; i<a.length; i++)
		{
			int Rowsum = 0;
			int Colsum = 0;
			for(int j=0; j<a[i].length; j++)
			{
				Rowsum+=a[j][i];
				Colsum+=a[i][j];
				if(i==j)
					Diag1Sum[i] = a[i][j];
				if(j==(a.length-i-1))
					Diag2Sum[i] = a[i][j];
			}
			RowSum[i]=Rowsum;
			ColSum[i]=Colsum;
		}
		
		int yoyo = RowSum[0], yoyoyo = ColSum[0], yoyoyoyo = Diag1Sum[0], yoyoyoyoyo = Diag2Sum[0];
		for(int i=0; i<RowSum.length; i++)
	        if(!(RowSum[i] == yoyo) || !(ColSum[i]==yoyoyo) || !(Diag1Sum[i]==yoyoyoyo) || !(Diag2Sum[i]==yoyoyoyoyo))
	        	return false;
		
		return true;
	}
	
	//checks to see if the array is a Latin square. 
	//This means that it must be square (suppose it is n x n), 
	//and that each row and each column must contain the 
	//values 1, 2, ..., n with no repeats
	public static boolean isLatin(int[][] a)
	{
		if(!(isSquare(a)))
			return false;
		//assuming array is a perfect square
		//didn't figure this out yet
		int n = a.length;
		int check = 0;

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				for(int k=0; k<n; k++)
				{
					if(a[i][j]==(k+1))
						check++;
				}
				if((check == 1))
					return false;
				else
					check = 0;
			}
		}
		check=0;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				for(int k=0; k<n; k++)
				{
					if(a[i][j]==(k+1))
						check++;
				}
				if(!(check == 1))
					return false;
				else
					check = 0;
			}
		}
		return true;
	}
	
	//checks to see if the array is square (suppose it is n x n), 
	//and contains each of the digits from 1 to n*n
	//Example: 1, 2, ..., 16 for a 4 x 4 array
	public static boolean isSequence(int[][] a)
	{
		int n = a.length;
		for(int i=1; i<n; i++)
		{
			int check = 0;
			for(int j=0; j<n; j++)
			{
				for(int k=0; k<a[j].length; k++)
				{
					if(a[j][k]==(k+1))
						check++;
				}
				if((check == 1))
					return false;
				else
					check = 0;
			}
		}
		return true;

	}
	

}

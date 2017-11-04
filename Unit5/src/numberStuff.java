import java.util.*;
public class numberStuff {

	public static void main(String[] args) {
		int n = 0, sum=0, min=9999999;
		ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner k = new Scanner(System.in);
		
		while(n!=-1)
		{
			System.out.println("Input");
			n = k.nextInt();
			num.add(n);
			sum += n;										//Find Sum
			if(min>n && n!=-1)								//Find Minimum
				min=n;
		}
		
		System.out.println("Original:        " + num);				//Print ArrayList
		System.out.println("Average:         " + sum/(num.size()));	//Get Average

		int index = num.indexOf(min);
		num.set(index, 100);								//Replace Minimum to 100
		
		System.out.println("Replace Minimum: " + num);

		for(int i=0;i<num.size();i++)						//Remove Even
		{
			if(num.get(i)%2==0)
			{
				num.remove(i);
				i--;
			}
		}
		System.out.println("Remove Even:     " + num);
		
		k.close();
	}
}

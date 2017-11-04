
public class printRhythm extends Poem{
	super();
	int lines = getNumLines();
	int syl;
	
	for(int i=0; i<lines; i++)
	{
		for(int j=0; j<syl; j++)
			System.out.print("ta ");
		syl = getSyllables(i);
		System.out.println();
	}
	
}

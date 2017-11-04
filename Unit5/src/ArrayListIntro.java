import java.util.*;
public class ArrayListIntro 
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Sean");
		names.add("Tom");
		names.add("Leo");
		System.out.println(names);
		System.out.println(names.size());
		
		names.add(3,"Carly");
		names.add(0, "Ethan");
		names.add(2,"Jimmy");
		names.set(4,"Kyle");
		names.add(3,"Ryan");
		names.remove(5);

		System.out.println(names);

	}
	
}

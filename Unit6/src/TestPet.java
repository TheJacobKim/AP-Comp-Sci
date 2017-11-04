import java.util.ArrayList;

public class TestPet {

	public static void main(String[] args)
	{
		Cat c1 = new Cat(); 
		Dog d1 = new Dog();
		Pet p1 = new Cat();
		Pet p2 = new Dog();	
		//Which methods can be called on c1?
		c1.talk();
		//Which methods can be called on d1?
		d1.eat();
		//Which methods can be called on p1?
		p1.eat();
		//Which methods can be called on p2?
		p2.talk();
		
		ArrayList<Pet> pets = new ArrayList<Pet>();
		
		pets.add(c1);
		pets.add(d1);
		pets.add(p1);
		pets.add(p2);
		
		Pet p3 = new Cat();
		pets.add(p3);
		//How do I make these in to one line??
		
		for(int i=0; i<pets.size(); i++)
		{
			pets.get(i).talk();
		}
		
//		for (int i : pets.size()) {
//			pets.talk();
//		}
	}


}

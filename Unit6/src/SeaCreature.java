public abstract class SeaCreature {
	
	//private instance variables
	//subclasses can't access them!
	private String name;
	private int numberOfLegs;
		
	//constructor, gives values to name and numberOfLegs
	public SeaCreature(String n, int l){
		name = n;
		numberOfLegs = l;
	}
	
	//abstract move method, must be defined in all subclasses
	public abstract void move();
	
	//abstract eat method, must be defined in all subclasses
	public abstract void eat();
		
	//all subclasses of sea creatures can sleep the same way
	//they will use this method unless the subclass overrides it by writing its own sleep method
	public void sleep(){
		System.out.println(name + " is sleeping.");
	}
	
	public abstract void color();
	
	//print information about the SeaCreature
	//this can be the same for all SeaCreatures
	public String toString(){
		String str = "";
		str = "Sea Creature's name is " + name + " and number of legs is " + numberOfLegs;
		return str;
	}
	
	public static void main(String[] args)
	{
		SeaCreature c = new Octupus("Peter", 8, "red");
		((Octupus)c).poop();
		Lobster Piper = new Lobster("Piper", 12);
		Piper.move();
	}

}

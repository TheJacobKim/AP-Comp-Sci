
public class Octupus extends SeaCreature{
	
	private String color;
	
	public Octupus(String nm, int legs, String c){
		super(nm, legs);
		color = c;
	}

	@Override
	public void move() {
		System.out.println("Octupus moves by pumping water out of his body");
	}

	@Override
	public void eat() {
		System.out.println("Octupus eats small fish."); 
	}
	
	@Override
	public void poop(){
		System.out.println("Poooop"); 
	}
}

public class Lobster extends SeaCreature {
	
	public Lobster(String nm, int legs){
		super(nm, legs);
	}

	@Override
	public void move() {
		System.out.println("Lobster moves by walking along the ocean floor");
	}

	@Override
	public void eat() {
		System.out.println("Lobster eats small fish."); 
	}

}

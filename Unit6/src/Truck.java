public class Truck implements Vehicle {

	public Truck(){
		System.out.println("Truck object has been created.");
	}
	
	public void accelerate() {
		System.out.println("Truck is accelerating.");
	}

	public void brake() {
		System.out.println("Truck is braking.");
	}

	public void steer() {
		System.out.println("Truck is steering.");
	}

}

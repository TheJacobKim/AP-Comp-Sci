import java.util.ArrayList;

public class TestVehicle {

	public static void main(String[] args) {
		Truck t1 = new Truck();
		Sedan s1 = new Sedan();
		Vehicle v1 = new Sedan();

		t1.brake();
		s1.brake();
		v1.brake();
		
		ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

		cars.add(t1);
		cars.add(s1);
		cars.add(v1);
		for(int i=0; i<cars.size(); i++)
			cars.get(i).accelerate();
	}

}

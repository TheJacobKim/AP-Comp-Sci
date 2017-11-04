
public class CarTest 
{

	public static void main(String[] args) 
	{
		Car c1 = new Car("Honda", 5);
		System.out.println(c1.toString());
		
//		c1.accelerate(4);
//		c1.move();
//		System.out.println(c1);
//		
//		c1.brake(1);
//		c1.move();
//		System.out.println(c1);
//		
//		c1.setFacingRight(false);
//		c1.move();
//		System.out.println(c1);
		
		Car c2 = new Car("Toyota", 3);
		System.out.print(c2.comparePosition(c1));
	}

}

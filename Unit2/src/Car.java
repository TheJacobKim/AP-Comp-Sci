
public class Car 
{

	private String name;
	private int speed;
	private int position;
	//private String actualPosition;
	private boolean facingRight;

	public Car(String Name, int Position)   //  constructor 
	{
		name = Name;
		position = Position;
		facingRight = true;
		speed = 0;
	//	actualPosition = "";
	}
	
	public void accelerate(int Acc)  // increase speed
	{
		speed += Acc;
	}
	
	public void brake(int Brk)  // decrease speed
	{
		speed -= Brk;
	}
	
	public void setFacingRight(boolean a) // direction
	{
		facingRight = a;
	}
	public void move() // where is it heading?
	{
		if(facingRight)
		{
			position += speed;
		}
		else
		{
			position -= speed;
		}
	}
	public String toString()
	{
		String str;
//		for(int i=0; i<position; i++)
//		{
//			actualPosition += "-";
//		}
//		actualPosition += "x";
		str = "Name: " + name + "\n" +
				"Speed: " + speed + "\n" +
				"Position: " + position + "\n";
		//		actualPosition;
		
		return str;
	}
	
	public int comparePosition(Car other)
	{
		return this.position - other.position;
	}
}

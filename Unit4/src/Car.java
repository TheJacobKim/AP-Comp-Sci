public class Car 
{
	//instance variables
	private String name;
	private int speed;
	private int position;
	private boolean facingRight;
	
	//constructor
	public Car(String startName, int startPosition)
	{
		name = startName;
		position = startPosition;	
		speed = 0;
		facingRight = true;
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public void setFacingRight(boolean b)
	{
		facingRight = b;
	}
	
	public String getName(){
		return name;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public int getPosition(){
		return position;
	}
	
	public boolean getFacingRight()
	{
		return facingRight;
	}
	
	public void move()
	{
		if(facingRight)
			position += speed;
		else
			position -= speed;
	}
	
	public void accelerate(int amount)
	{
		speed += amount;
	}
	
	public void brake(int amount)
	{
		speed -= amount;
	}
	
	//returns this distance minus other distance
	//positive if this car is ahead, negative if other car is ahead
	public int compareDistance(Car other)
	{
		return this.getPosition() - other.getPosition();
	}
	
	public String toString()
	{
		String str = "Name : " + name + "\nSpeed: " + speed + 
				"\nPosition: " + position + "\n";
		for(int i = 1; i < position; i ++)
			str += "-";
		str += "x";
		return str;
	}
}

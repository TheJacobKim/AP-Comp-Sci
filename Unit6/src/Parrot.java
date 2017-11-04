import java.util.ArrayList;
public abstract class Parrot
{
	private String name;
	private int age;
	private ArrayList<String> sounds;
	
	public Parrot(String n)
	{
		name=n;
		age=0;
		sounds=new ArrayList<String>();
	}
	
	public void setAge(int a)
	{
		age=a;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void train(String sound)
	{
		sounds.add(sound);
	}
	
	public String getName()
	{
		return name;
	}
	
	public String speak()
	{
		return sounds.get((int) (Math.random()*sounds.size()));
	}
	
}
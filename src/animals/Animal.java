package animals;

public abstract class Animal implements Fly
{
	private String name;
	private String color;
	private int countEyes;
	
	public Animal(String name, String color, int countEyes)
	{
		this.name = name;
		this.color = color;
		this.countEyes = countEyes;
	}
	
	public abstract void walk();
	/*{
		System.out.println("walk");
	}*/
	
	public abstract void makeNoise();
	/*{
		System.out.println("noise");
	}*/
	
	@Override
	public String toString()
	{
		return "name = " + name;
	}
	
	public void fly()
	{
		System.out.println("Fliegen ist schön");
	}

}

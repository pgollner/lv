package animals;

public class  Dog extends Animal implements Fly {

	public Dog(String name, String color, int countEyes) {
		super(name, color, countEyes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Wuff Wuff");
	}

	@Override
	public void fly()
	{
		System.out.println("Eigentlich kann ich garnicht fliegen");
	}
	
}

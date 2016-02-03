package animals;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Bird("Vogel", "gelb", 2);
		
		a.makeNoise();
		
		Animal d = new Dog("Nik", "Schwarz", 2);
		d.makeNoise();

		a.fly();
		d.fly();
		
		Fly f = d;
		d.fly();

		
	}

}

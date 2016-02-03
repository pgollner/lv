package animals;

public class Bird 
extends Animal 
implements Fly
{

public Bird(String name, String color, int countEyes) {
super(name, color, countEyes);
}

public void walk() {
System.out.println("step by step");
}

public void makeNoise() {
System.out.println("piep piep");
}
@Override
public void fly() {
	// TODO Auto-generated method stub
}




}



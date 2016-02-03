package logistic;

import java.util.ArrayList;

public class LogisticManager
{

private ArrayList<Moveable> moveables = new ArrayList<Moveable>();



public LogisticManager() {
	super();

}

	public void addMoveable(Moveable m)
	{
		moveables.add(m);
	}
	
	public void moveAll(String Destination)
	{
		for (Moveable moveableitems : moveables) {
			moveableitems.move(Destination);
		}
	}
}

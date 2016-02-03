package uebung.fuer.Klausur;

public class Dice extends Figure {
	protected double lane;
	
	
	public Dice(double lane) {
		super();
		this.lane = lane;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 6*(this.lane*this.lane);
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	double getVolume()
	{
		return this.lane*this.lane*this.lane;
	}

}

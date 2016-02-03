package uebung.fuer.Klausur;

public class Rectangle extends Figure {
	protected double lenght,width;
	
	
	public Rectangle(double lenght, double width) {
		super();
		this.lenght = lenght;
		this.width = width;
	}
	
	public double getLenght() {
		return lenght;
	}


	public double getWidth() {
		return width;
	}


	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return this.lenght * this.width;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(this.lenght + this.width);
	}

}

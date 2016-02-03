package uebung.fuer.Klausur;

public class Circle extends Figure {
protected double radius;


	public Circle(double radius) {
	super();
	this.radius = radius;
}
	
	public double getRadius() {
		return radius;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return this.radius*this.radius*3.1415;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*this.radius*3.1415;
	}

}

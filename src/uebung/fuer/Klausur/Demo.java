package uebung.fuer.Klausur;

public class Demo {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(10, 5);
		System.out.println("R1-Länge " + R1.getLenght());
		System.out.println("R1-Breite " + R1.getWidth());
		System.out.println("R1-Fläche " + R1.getArea());
		System.out.println("R1-Umfang " + R1.getPerimeter());
	
		Circle C1 = new Circle(5);
		System.out.println("C1-Radius " +C1.getRadius());
		System.out.println("C1-Umfang " +C1.getPerimeter());
		System.out.println("C1-Fläche " +C1.getArea());
		
		Figure_Manager fm1 = new Figure_Manager();
		fm1.add(R1);
		fm1.add(C1);
		
		System.out.println(fm1.getMaxPerimeter());
		System.out.println(fm1.getAverageAreaSize());
		System.out.println(fm1.getAreabySizeCategory());
	}
	

}

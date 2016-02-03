package logistic;

import java.util.ArrayList;
import java.util.HashMap;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car fiesta = new Car("Ford Fiesta", "Frostwhite", 980);
		Car Focus = new Car("Ford Focus", "Black", 1500);
		fiesta.move("Milano");
		Shirt Shirt1 = new Shirt("Addidas", "Black", "M");
		
		Shirt1.move("Pompeii");
		
		LogisticManager l1 = new LogisticManager();
		
		l1.addMoveable(fiesta);
		l1.addMoveable(Shirt1);

		l1.moveAll("Junkyard");
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(fiesta);
		cars.add(Focus);
		
		System.out.println(getCarsByColor(cars));
	}
	public static HashMap<String, Integer>
		getCarsByColor(ArrayList<Car> cars)
		{
		HashMap<String, Integer> map = new HashMap<>();
		//Kontrolle ob Farbe exestiert
		
		for (Car car : cars) {
			
		if(!map.containsKey(car.getColor()))
		{
			map.put(car.getColor(), 1);
		}
		else
		{
			Integer temp = map.get(car.getColor());
			temp +=1;
			map.put(car.getColor(), temp);
		}
			
			
		}
		return map;

}

}

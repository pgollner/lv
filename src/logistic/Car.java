package logistic;

public class Car implements Moveable {
	private String Type,Color;
	private int Weight;
	public Car(String Type, String color, int weight) {
		super();
		this.Type = Type;
		this.Color = color;
		this.Weight = weight;
	}
	@Override
	public void move(String destination) {
		// TODO Auto-generated method stub
		System.out.println("A " + this.Color + " " + this.Type + " will be moved to " + destination);
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	
	
	
	
	
}

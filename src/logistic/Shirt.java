package logistic;

public class Shirt implements Moveable {
	private String Brand,Color,Size;
	public Shirt(String Brand, String color, String Size) {
		super();
		this.Brand = Brand;
		this.Color = color;
		this.Size = Size;
	}
	@Override
	public void move(String destination) {
		// TODO Auto-generated method stub
		System.out.println("A " + this.Color + " Shirt of " + this.Brand + " will be moved to " + destination);
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	
	

}

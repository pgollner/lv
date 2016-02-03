package lv;

public class DemoProduct {
	public static void main(String[] args) {
		
		Product Lumia = new Product("Lumia 640", 20);
		Parts Lumia_Bildschirm = new Parts("Bildschirm", 2);
		Parts Lumia_BMaterial = new Parts("Glas", 18);
		Parts Lumia_Sensor = new Parts("Sensor", 5);
		
		System.out.println(Lumia.getPrice());
		
	}
	
}

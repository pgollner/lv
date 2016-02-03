package lv;

import java.util.ArrayList;

public class Product {
	
	protected String Name;
	protected double Price;
	ArrayList<Product> Parts = new ArrayList();
	public Product(String name, double price) {
		super();
		Name = name;
		Price = price;
	}
	
	public double getPrice()
	{
		double sum = 0;
	for (Product product : Parts) {
		
	}
		return sum;
	}

}

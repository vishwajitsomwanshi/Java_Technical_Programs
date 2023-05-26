package incapsulation;

public class Bottle {
	private int capacity;
	private String brand;
	private String color;
	private double price;
	
	public void toStore()
	{
		System.out.println("it is use to store water");
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	public Bottle(int capacity, String brand, String color, double price) {
//		this.capacity = capacity;
//		this.brand = brand;
//		this.color = color;
//		this.price = price;
//	}
	
}

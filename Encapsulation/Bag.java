package incapsulation;

public class Bag {
	private String brand;
	private String color;
	private double price;
	
	public void toCarry()
	{
		System.out.println("it is use to carry");
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

//	public Bag(String brand, String color, double price) {
//		this.brand = brand;
//		this.color = color;
//		this.price = price;
//	}
	
}

package incapsulation;

public class Mobile {
	private String company;
	private String color;
	private double price;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
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
//	public Mobile(String company, String color, double price) {
//		super();
//		this.company = company;
//		this.color = color;
//		this.price = price;
//	}
	
}

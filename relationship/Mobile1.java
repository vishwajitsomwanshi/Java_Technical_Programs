package relationship;

public class Mobile1 {
	
	Sim s;
	
	String brand;
	double price;
	String color;
	
	public  Mobile1(String brand,double price,String color)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public void printAttributes( Sim s)
	{
		this.s=s;
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
		System.out.println(s.serviceProvider);
		System.out.println(s.simNo);
		System.out.println(s.color);
		
	
	}
	
	
}

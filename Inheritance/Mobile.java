package inheritance;

public class Mobile extends Sim {

	String brand="samsung";
	double price=50000;



public static void main(String[] args) {
	Mobile m1=new Mobile();
	
	System.out.println(m1.color);
	System.out.println(m1.serviceprovider);
	System.out.println(m1.brand);
	System.out.println(m1.price);
	
}
	}
	

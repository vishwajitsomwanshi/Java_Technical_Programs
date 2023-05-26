package relationship;

public class CarDriver {

	public static void main(String[] args) {
		 Car c=new Car("HYUNDAI","Black",50000,new Engine(112,221));
		 
		 System.out.println(c.company);
		 System.out.println(c.color);
		 System.out.println(c.price);
		 System.out.println(c.e.cc);
		 System.out.println(c.e.engineNo);
	}

}

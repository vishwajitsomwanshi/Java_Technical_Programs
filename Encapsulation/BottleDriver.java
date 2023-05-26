package incapsulation;

public class BottleDriver {

	public static void main(String[] args) {
		Bottle b=new Bottle();
		b.toStore();
		
		System.out.println(b.getBrand());
		System.out.println(b.getCapacity());
		System.out.println(b.getColor());
		System.out.println(b.getPrice());
		System.out.println("------------");
		
		b.setBrand("Milton");
		b.setCapacity(1);
		b.setColor("white");
		b.setPrice(200);
		
		System.out.println(b.getBrand());
		System.out.println(b.getCapacity());
		System.out.println(b.getColor());
		System.out.println(b.getPrice());
		
		}

}

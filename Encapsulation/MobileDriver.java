package incapsulation;

import java.util.Scanner;

public class MobileDriver {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Mobile m=new Mobile();
			
			
			System.out.println(m.getColor());
			System.out.println(m.getCompany());
			System.out.println(m.getPrice());
			
			String c=sc.next();
			String com=sc.next();
			double p=sc.nextDouble();
			
			
//		m.setColor("Black");
//		m.setCompany("Samsung");
//		m.setPrice(5000);
//		
			System.out.println("---------------");
			System.out.println(p);
			System.out.println(com);
			System.out.println(c);
		}
		
	}

}

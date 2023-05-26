package relationship;

import java.util.Scanner;

public class LaptopDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the brand");
		String b=sc.next();
		System.out.println("Enter the Price");
		double p=sc.nextDouble();
		System.out.println("Enter the comp");
		String c=sc.next();
		System.out.println("enter the price");
		double d=sc.nextDouble();
		System.out.println("---------------------");
		System.out.println(b);
		System.out.println(p);
		System.out.println(c);
		System.out.println(d);
				
		
		
		
//		
//		//Laptop l1=new Laptop(String brand,double price,new Pendrive(String company,double price));
//		
//		//Laptop l1=new Laptop("hp",1000,new Pendrive("abc",500));
//		
//		System.out.println(l1.brand);
//		System.out.println(l1.price);
//		System.out.println(l1.p.company);
//		System.out.println(l1.p.price);
	}

}

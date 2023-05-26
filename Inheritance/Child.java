package inheritance;

public class Child extends Parrent{

		String b="from child";
		
	public static void main(String[] args) {
		
		Child c1=new Child();
		
		System.out.println(c1.b);
		System.out.println(c1.a);
		
		Parrent p1=new Child(); // upcasting 
		
		System.out.println(p1.a);// 
		//ystem.out.println(p1.b); cte
		
	 Child c2=(Child) p1;// downcasting 
	 
	 System.out.println(c2.a);
	 System.out.println(c2.b);
	}

}

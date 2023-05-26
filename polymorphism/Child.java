package polymorphism;

public class Child  extends MethodShadowing{

	int a=78;			// If a subclass and superclass have static  method with same signature is knows as method shadowing.
	
	public static void m1()
	{
		System.out.println("m1() from child class");
	}
	public static void main(String[] args) {
		
		MethodShadowing p1=new MethodShadowing();
		
		p1.m1();
		
		MethodShadowing p2=new Child();
		
		p2.m1();
		
		Child c1=new Child();
		
		c1.m1();
				
		
	}
}

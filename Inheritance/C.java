package inheritance;

public class C extends A {
	
	String c="From c";

	public static void main(String[] args) {
		
		C c1=new C();
		
		System.out.println(c1.a);
		System.out.println(c1.c);
		
		B b1=new B();
		
		System.out.println(b1.a);
		System.out.println(b1.b);
		
		A a1=new A();
		
		System.out.println(a1.a);

	}

}

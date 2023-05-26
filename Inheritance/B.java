package inheritance;

public class B extends A{

	String b="From child";
	public static void main(String[] args) {
		
	 A a=new A();
	 B b=new B();
	 A a1=new B();
	 
	 System.out.println(a1.a);
	 
	 
	 A a2=(A) b;
	 System.out.println(a2.a);
	// System.out.println(a2.);
	 
	}
}

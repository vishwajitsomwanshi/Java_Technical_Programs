package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		
		add();   // if more than one method is created with dif.formal argument with same name in the same class is known as method overloading.
		add(10,10);
		add(10,10,10);
	}
	public static void add(int a,int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	public static void add(int a,int b,int c)
	{
		int res=a+b+c;
		System.out.println(res);
	}
	public static void add()
	{
		System.out.println("it ise use to add");
	}
}

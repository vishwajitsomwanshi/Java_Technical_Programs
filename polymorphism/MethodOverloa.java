package polymorphism;

public class MethodOverloa { //Method over loading 
							// if the class have more than one method with same name bt diff.formal argumet
							// then it is knows as method over loading 

	public  static void add (int a,int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	
	public static void add (int a,int b, int c)
	{
		int res=a+b+c;
		System.out.println(res);
	}
	public static void add()
	{
		System.out.println("From no argument");
	}
	public static void main(String[] args) {
		add(5,5);
		add(5,5,5);
		add();
	}
}

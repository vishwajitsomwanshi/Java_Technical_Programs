package wrap;

public class WrapperClass {
	public static void main(String[] args) {
		
		int a=5;
		
		Integer aa=new Integer (a); // Wrapping -Boxing
		
		 System.out.println(aa);
		 
		 int b=aa.intValue();//Unwrapping-Unboxing
		 
		Integer value=aa;//autoboxing
		
		int c=value;//autounboxing 
		
		System.out.println(value);
		
		
		
		
	}
}

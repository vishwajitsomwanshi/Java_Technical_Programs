package wrap;

public class WrappClasses {

	public static void main(String[] args) {
		
    int z=10;
    
    Integer ii=new Integer(z); //Boxing
    
    Integer i= Integer.valueOf(z); //direct autoboxing
    
    int k=i; //direct autounboxing 
    
    
    System.out.println(k);
	}
    
 
}

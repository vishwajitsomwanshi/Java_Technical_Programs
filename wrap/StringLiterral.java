package wrap;

public class StringLiterral {

	public static void main(String[] args) {
	
	String name1="Hello";
	String name2="Hello";
	System.out.println(name1==name2);// String Literral are in SCP because values are same If values are diff.it create new Object in SCP
	
	System.out.println(name1.equals(name2));//  comparing  values
	System.out.println("-------------------");
	
	String name3=new String("Hello");
	String name4=new String("Hello");
	
	System.out.println(name3==name4);//comparing memary lacation-Addresses
	System.out.println(name3.equals(name4));// comparing values
	
}
	
}

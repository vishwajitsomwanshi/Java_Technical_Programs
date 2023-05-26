package string;

public class Test {

	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer ("Hello");
		
		//System.out.println(s1.reverse());
		
		//System.out.println(s1.deleteCharAt(0));
		s1.setCharAt(0, 'C');
		
		System.out.println(s1);
		System.out.println(s1.replace(0, 1, "E"));
	}
}

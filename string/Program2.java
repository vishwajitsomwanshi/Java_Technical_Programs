package string;

public class Program2 {
	 public static void main(String[] args) {
		
		 String str="PROGRAMMING";
		 
		str=str.replace(str.charAt(str.length()-1), '*'); //replace start with last character
		System.out.println(str);

//		str= str.substring(1, 6);
//		 System.out.println(str);
	}
}

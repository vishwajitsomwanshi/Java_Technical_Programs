package string;

public class Program1 {
	
		public static void main(String[] args) {
			
			String str="Chandu";
			String revStr="";
			
			for (int i = str.length()-1;i>=0; i--) 
			{
				revStr=revStr+str.charAt(i);
			}
				if (str.equals(revStr)) 
				{
					System.out.println(" String is palindromes...!!");
				}
				else {
					System.out.println("string is not palindrome....!!");
				}
			
			System.out.print("REVERSE STRING :"+revStr);
		}
}

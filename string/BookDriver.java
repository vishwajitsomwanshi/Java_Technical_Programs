package string;

import java.util.Arrays;

public class BookDriver {
	public static void main(String[] args) {
		
	Book[] b1=new Book[5];
	b1 [0]=new Book("JAVA",1);
	b1 [1]=new Book("SQL",3);
	b1[2]=new Book("J2EE",4);
	b1[3]=new Book("c++",2);
	b1[4]=new Book("c",5);
	
	for (int i = 0; i < b1.length; i++) {
		System.out.println(b1[i]);
	}	
	System.out.println("---------------");
	
	Arrays.sort(b1);
	for (int i = 0; i < b1.length; i++) {
		System.out.println(b1[i]);
	}
	
	}
	
	
}

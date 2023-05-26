package inheritance;

import java.util.Scanner;

public class BagDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		Bag b1=new Bag();
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter the choice \n1.Add Ball\n2.Remove Ball\n3.Check Bag\n4.Show Game");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Which Ball ?? \n1.Tennis Ball \n2.Basket Ball");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
				{
					System.out.println("Enter the radiud of Tennis Ball");
					double radius =sc.nextDouble();
					b1.addBall(choice, radius);
				}
				break;
				case 2:
				{
				System.out.println("Enter the radiud of Basket Ball");
				double radius=sc.nextDouble();
				b1.addBall(choice, radius);
				}
				default:
				{
					System.out.println("Invalid choice");
					System.out.println("------------------------");
				}
				}
			}
			break;
			case 2:
			{
				b1.removeBall();
			}
			break;
			case 3:
			{
				b1.checkBag();
			}
			break;
			case 4:
			{
				b1.showgame();
			}
			break;
			}
		}

	}

}

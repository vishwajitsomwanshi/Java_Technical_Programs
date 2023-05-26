package inheritance;

import java.util.Scanner;

public class PassengerDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		Passenger p1=new Passenger();
		boolean exit=true;
		while(exit) {
			System.out.println("Enter the choice \n1.Book Ticket \n2.Cancle Ticket \n3.Check Ticket \n4.Show Ticket");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
			{
			System.out.println("Enter the choice \n1.Trujet \n2.Indigo");
			choice=sc.nextInt();
					switch(choice) {
					case 1:
					{
						System.out.println("Enter the Price ");
						double price=sc.nextDouble();
						p1.bookTicket(choice, price);
					}
					break;
					case 2:
					{
						System.out.println("Enter the price");
						double price=sc.nextDouble();
						p1.bookTicket(choice, price);
						
					}
					break;
					default:
					{
					System.out.println("Invalid choice");
					System.out.println("------------------");
					}
					}
			}
			break;
			case 2:
			{
				p1.cancleTicket();
			}
			break;
			case 3:
			{
				p1.checkTicket();
			}
			break;
			case 4:
			{
				p1.showTicket();
			}
			break;
			default:
			{
				System.out.println("Invalid choices");
			}
				break;
			}
		}

	}

}

package inheritance;

public class Passenger {

	
	Airplane a;
	
	public void bookTicket(int choice,double price)
	{
		if (this.a==null) 
		{
			if (choice==1) 
			{
				a=new Trujet(price);
				System.out.println("TruJet ticket is succesfully booked");
				System.out.println("-------------------");
			}
			else if (choice==2)
			{
			    a=new Indigo(price);	
			}
			else {
				System.out.println("Invalid choice");
			}
		}
		else {
			System.out.println("You Ticket is alredy book");
			System.out.println("-----------------------");
		}
	}
	public void cancleTicket()
	{
		if (this.a==null) {
			System.out.println("Your ticket is not booked");
			System.out.println("--------------------------");
		}
		else {
			this.a=null;
			System.out.println("Your ticket is succesully cancled");
			System.out.println("----------------------------");
					
		}
	}
	public void checkTicket()
	{
		if (this.a==null) {
			System.out.println("Your ticket is not booked");
			System.out.println("------------------------");
		}
		else {
			System.out.println("Your ticket is booked");
			System.out.println("--------------------");
		}
		
	}
	public void showTicket()
	{
		if (this.a==null) {
			System.out.println("Your ticket is not booked");
			System.out.println("--------------------");
		}
		else {
			if (a instanceof Trujet) {
				Trujet t=(Trujet) a;
				System.out.println("You can go in :"+t.getPlanename());
			}
			else {
				Indigo i=(Indigo)a;
				System.out.println("You can go with :"+i.getPlanename());
			}
		}
	}
}

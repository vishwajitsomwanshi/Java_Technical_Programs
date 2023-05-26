package inheritance;

public class Bag {

	
		Ball b;
		public void addBall(int choice,double radius)
		{
			if (this.b==null) {
				
				if (choice==1) {
					b=new TennisBall(radius); 
					System.out.println("Tenniss ball is succesfully addes");
					System.out.println("--------------------");
				}
				else if (choice==2) {
					b=new BasketBall(radius);
				}
				else {
					System.out.println("Invalid choice");
				}
				
			}
			else {
				System.out.println("Ball is already added");
				System.out.println("--------------");
			}
		}
		public void removeBall()
		{
			if (this.b==null) {
				System.out.println("You hav not addes ball in bag");
			}
			else {
				this.b=null;
				System.out.println("Ball is remove succesfully");
				System.out.println("-----------------");		
			}
		}
		public void checkBag()
		{
			if (this.b==null) {
				System.out.println("Bag is empty");
				System.out.println("---------------");
			}
			else
			{
				System.out.println("Bag is not empty");
				System.out.println("------------------");
			}
		}
		public void showgame()
		{
			if (this.b==null) {
				System.out.println("Ball is not added int the Bag");
				System.out.println("-----------------");
			}
			else {
				if (b instanceof TennisBall) {
					TennisBall t1=(TennisBall) b;
					System.out.println("You can play :"+t1.getgame());
				}
				else {
					BasketBall b1=(BasketBall)b;
					System.out.println("You can play :"+b1.getGame());
				}
			}
		}
}

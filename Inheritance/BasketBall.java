package inheritance;

public class BasketBall extends Ball{

		private String game="Basket Ball";
		
		public String getGame()
		{
			return game;
		}
		public BasketBall(double radius)
		{
			super(radius);
		}
}

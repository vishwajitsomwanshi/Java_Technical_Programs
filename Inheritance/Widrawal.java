package inheritance;

public class Widrawal extends Atm{

		private String transaction="Widdrwal Money";
		
		public String getTransaction()
		{
			return transaction;
		}
		
		public Widrawal (double limit)
		{
			super(limit);
		}
}

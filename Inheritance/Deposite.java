package inheritance;

public class Deposite extends Atm{
	
	private String transaction="Deposite Money";
	
	public String getTransaction()
	{
		return transaction;
	}
	
	public Deposite (double limit)
	{
		super(limit);
	}
	
}

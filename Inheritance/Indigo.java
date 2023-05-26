package inheritance;

public class Indigo extends Airplane{

	private String planename="Indigo";
	
	public String getPlanename()
	{
		return planename;
	}
	public Indigo(double price)
	{
		super(price);
	}
	
}

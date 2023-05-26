package inheritance;

public class Trujet extends Airplane {
	
	private String planename="TruJet";
	
	public String getPlanename()
	{
		return planename;
	}
	
	public Trujet(double price)
	{
		super(price);
	}
}

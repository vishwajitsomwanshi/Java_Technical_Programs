package inheritance;

public class TennisBall extends Ball {

	private String game ="Tennis";
	
	public String getgame()
	{
		return game;
	}
	public TennisBall(double radius) 
	{
		super(radius);
	}
}

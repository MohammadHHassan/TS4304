package day6.computerapplication;

public class Smartphone extends Portable
{
	boolean display;
	
	public Smartphone(String operatingSystem)
	{
		super(operatingSystem);
		switchOffDisplay();
	}
	
	public void switchOnDisplay()
	{
		display = true;
	}
	
	public void switchOffDisplay()
	{
		display = false;
	}
}

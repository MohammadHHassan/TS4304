package day6.computerapplication;

public class Computer
{
	String operatingSystem;		//Instance variable
	boolean powerState;			//Instance variable
	
	public Computer(String operatingSystem)		//Parameter variable
	{
		this.operatingSystem = operatingSystem;
		shutDown();
	}
	
	public void bootUp()
	{
		powerState = true;
	}
	
	public void shutDown()
	{
		powerState = false;
	}
}

package day6.computerapplication;

public class Portable extends Computer
{
	int batteryCapacity;
	
	public Portable(String operatingSystem)
	{
		super(operatingSystem);
	}
	
	public int getBatteryCapacity()
	{
		return batteryCapacity;
	}
	
	public void chargeBattery(int percentage)
	{
		if (percentage >= 0)
		{
			batteryCapacity = batteryCapacity + percentage;
			if (batteryCapacity > 100)
			{
				batteryCapacity = 100;
			}
		}
	}
	
	public void useBattery()
	{
		batteryCapacity = batteryCapacity - 10;
		if (batteryCapacity < 0)
		{
			batteryCapacity = 0;
		}
	}
}

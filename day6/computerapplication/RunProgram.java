package day6.computerapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Smartphone smartphone1 = new Smartphone("Android");
		System.out.println(smartphone1.batteryCapacity);
		smartphone1.chargeBattery(80);
		System.out.println(smartphone1.getBatteryCapacity());
		smartphone1.chargeBattery(100);
		System.out.println(smartphone1.getBatteryCapacity());
		
		System.out.println(smartphone1.powerState);
		smartphone1.bootUp();
		System.out.println(smartphone1.powerState);
		
	}
}

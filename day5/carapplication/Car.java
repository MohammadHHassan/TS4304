package day5.carapplication;

public class Car
{
	String brand;
	String model;
	String colour;
	int numberOfDoors;
	Wheels wheels;
	
	int currentSpeed = 0;
	
	public void pressAccelerator()
	{
		currentSpeed = currentSpeed + 10;
	}
	
	public void pressBrake()
	{
		currentSpeed = currentSpeed - wheels.brakeSpeed;
		if (currentSpeed<0)
		{
			currentSpeed=0;
		}
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", colour=" + colour + ", numberOfDoors=" + numberOfDoors
				+ ", wheels=" + wheels + ", currentSpeed=" + currentSpeed + "]";
	}
	
}

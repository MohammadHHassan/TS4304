package day5.carapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Wheels wheels1 = new Wheels();
		wheels1.brand = "LingLong";
		wheels1.size = 19;
		wheels1.brakeSpeed = 2;
		
		Wheels wheels2 = new Wheels();
		wheels2.brand = "Kumho";
		wheels2.size = 18;
		wheels2.brakeSpeed = 5;
		
		Wheels wheels3 = new Wheels();
		wheels3.brand = "Bridgestone";
		wheels3.size = 20;
		wheels3.brakeSpeed = 10;
		
		Car car1 = new Car();
		car1.brand = "Toyota";
		car1.model = "Super Kijang";
		car1.colour = "Red";
		car1.numberOfDoors = 2;
		car1.wheels = wheels1;
		car1.pressAccelerator();
		car1.pressBrake();
		//printText(car1);
		System.out.println("Car 1:" + car1);
		
		Car car2 = new Car();
		car2.brand = "Kia";
		car2.model = "Optima";
		car2.colour = "Black";
		car2.numberOfDoors = 4;
		car2.wheels = wheels2;
		car2.pressAccelerator();
		car2.pressBrake();
		//printText(car2);
		System.out.println("Car 2:" + car2);
		
		Car car3 = new Car();
		car3.brand = "BMW";
		car3.model = "M2";
		car3.colour = "White";
		car3.numberOfDoors = 2;
		car3.wheels = wheels3;
		car3.pressAccelerator();
		car3.pressBrake();
		//printText(car3);
		System.out.println("Car 3:" + car3);
		
	}
	
	/*
	public static void printText(Car car)
	{
		System.out.println("Brand = " + car.brand);
		System.out.println("Model = " + car.model);
		System.out.println("Colour = " + car.colour);
		System.out.println("Number of doors = " + car.numberOfDoors);
		System.out.println("=======================");
	}
	*/
}

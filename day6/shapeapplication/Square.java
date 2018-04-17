package day6.shapeapplication;

public class Square extends Shape
{
	double length;
	
	public Square(String colour, double length)
	{
		super(colour);
		this.length = length;
	}
	
	public double getArea()
	{
		return length*length;
	}
	
	public double getPerimeter()
	{
		return 4*length;
	}
}

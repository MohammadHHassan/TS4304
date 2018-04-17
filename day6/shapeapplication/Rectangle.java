package day6.shapeapplication;

public class Rectangle extends Shape
{
	double length;
	double base;
	
	public Rectangle(String colour, double length, double base)
	{
		super(colour);
		this.length = length;
		this.base = base;
	}
	
	public double getArea()
	{
		double area = length * base;
		return area;
	}
	
	public double getPerimeter()
	{
		double perimeter = (2*length) + (2*base);
		return perimeter;
	}
}

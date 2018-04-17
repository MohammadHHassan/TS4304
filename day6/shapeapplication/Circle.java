package day6.shapeapplication;

public class Circle extends Shape
{
	double radius;
	
	public Circle(String colour, double radius)
	{
		super(colour);
		this.radius = radius;
	}
	
	public double getArea()
	{
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public double getPerimeter()
	{
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
}

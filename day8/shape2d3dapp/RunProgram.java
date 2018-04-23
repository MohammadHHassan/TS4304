package day8.shape2d3dapp;

public class RunProgram
{
	public static void main(String[] args)
	{
		Shape2D[] shapes1 = new Shape2D[5];
		shapes1[0] = new Circle("Black", 5.5);
		shapes1[1] = new Rectangle("Blue", 6, 8);
		shapes1[2] = new Square("White", 2);
		shapes1[3] = new Circle("Green", 11);
		shapes1[4] = new Rectangle("Yellow", 7.7, 0.5);
		
		for(int i=0 ; i<shapes1.length ; i++)
		{
			System.out.println("--- Shape " + i + " ---");
			System.out.println(shapes1[i]);
			System.out.println("Area: " + shapes1[i].getArea());
			System.out.println("Perimeter: " + shapes1[i].getPerimeter());
			System.out.println("---------------");
		}
		
		int numberOfCircle = 0;
		int numberOfRectangle = 0;
		int numberOfSquare = 0;
		
		for (int j=0 ; j<shapes1.length ; j++)
		{
			if(shapes1[j] instanceof Circle)
			{
				numberOfCircle++;
			}
			
			if(shapes1[j] instanceof Rectangle)
			{
				numberOfRectangle++;
			}
			
			if(shapes1[j] instanceof Square)
			{
				numberOfSquare++;
			}
		}
		
		System.out.println("Number of Circle: " + numberOfCircle);
		System.out.println("Number of Rectangle: " + numberOfRectangle);
		System.out.println("Number of Square: " + numberOfSquare);
		
	}
}







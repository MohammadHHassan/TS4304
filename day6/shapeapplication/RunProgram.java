package day6.shapeapplication;

import java.util.Scanner;

public class RunProgram
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Shape [] shapes = new Shape[10];
		int shapeCounter = 0;
		
		while(true)
		{
			System.out.println("===================================");
			System.out.println("Area/Perimeter Calculator");
			System.out.println("Choose a shape below: ");
			System.out.println("(1) Triangle");
			System.out.println("(2) Square");
			System.out.println("(3) Rectangle");
			System.out.println("(4) Circle");
			System.out.println("(5) Show previous calculated shapes");
			System.out.println("(6) Quit");
			int userInput = scanner.nextInt();
			
			if (userInput == 1)
			{
				//Triangle
				System.out.println("Triangle: ");
				System.out.println("Please enter the base value: ");
				double baseValue = scanner.nextDouble();
				System.out.println("Please enter the height value: ");
				double heightValue = scanner.nextDouble();
				System.out.println("Please enter the colour: ");
				String colour = scanner.next();
				
				Triangle triangle = new Triangle(colour, baseValue, heightValue);
				
				System.out.println("Colour: " + triangle.colour);
				System.out.println("Area: " + triangle.getArea());
				System.out.println("Perimeter: " + triangle.getPerimeter());
				
				shapes[shapeCounter] = triangle;
				shapeCounter++;
				if (shapeCounter>9)
				{
					shapeCounter = 0;
				}
			}
			else if (userInput == 2)
			{
				//Square
				System.out.println("Square: ");
				System.out.println("Please enter the length value: ");
				double lengthValue = scanner.nextDouble();
				System.out.println("Please enter the colour: ");
				String colour = scanner.next();
				
				Square square = new Square(colour, lengthValue);
				
				System.out.println("Colour: " + square.colour);
				System.out.println("Area: " + square.getArea());
				System.out.println("Perimeter: " + square.getPerimeter());
				
				shapes[shapeCounter] = square;
				shapeCounter++;
				if (shapeCounter>9)
				{
					shapeCounter = 0;
				}
			}
			else if (userInput == 3)
			{
				//Rectangle
				System.out.println("Rectangle: ");
				System.out.println("Please enter the length value: ");
				double lengthValue = scanner.nextDouble();
				System.out.println("Please enter the base value: ");
				double baseValue = scanner.nextDouble();
				System.out.println("Please enter the colour: ");
				String colour = scanner.next();
				
				Rectangle rectangle = new Rectangle(colour, lengthValue, baseValue);
				
				System.out.println("Colour: " + rectangle.colour);
				System.out.println("Area: " + rectangle.getArea());
				System.out.println("Perimeter: " + rectangle.getPerimeter());
				
				shapes[shapeCounter] = rectangle;
				shapeCounter++;
				if (shapeCounter>9)
				{
					shapeCounter = 0;
				}
			}
			else if (userInput == 4)
			{
				//Circle
				System.out.println("Circle: ");
				System.out.println("Please enter the radius value: ");
				double radiusValue = scanner.nextDouble();
				System.out.println("Please enter the colour: ");
				String colour = scanner.next();
				
				Circle circle = new Circle(colour, radiusValue);
				
				System.out.println("Colour: " + circle.colour);
				System.out.println("Area: " + circle.getArea());
				System.out.println("Perimeter: " + circle.getPerimeter());
				
				shapes[shapeCounter] = circle;
				shapeCounter++;
				if (shapeCounter>9)
				{
					shapeCounter = 0;
				}
			}
			else if (userInput == 5)
			{
				//Show previous calculated shapes
				for(int i=0 ; i<shapes.length ; i++)
				{
					if (shapes[i] != null)
					{
						System.out.println(shapes[i]);
					}
				}
			}
			else if (userInput == 6)
			{
				//Quit
				System.out.println("Thank you");
				break;
			}
			else
			{
				//Invalid input
				System.out.println("Invalid input");
			}
			
		}
		scanner.close();
	}
}





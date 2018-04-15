package day4;

import java.util.Scanner;

public class ExampleFindHighest
{
	static int firstNumber, secondNumber;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		askInput();
		findAndPrintHighest();
		scanner.close();
	}
	
	public static void askInput()
	{
		System.out.println("Please enter the first number: ");
		firstNumber = scanner.nextInt();
		System.out.println("Please enter the second number: ");
		secondNumber = scanner.nextInt();
	}
	
	public static void findAndPrintHighest()
	{
		String text = "The highest number between the two is ";
		
		if (firstNumber>secondNumber)
		{
			System.out.println(text + firstNumber);
		}
		else
		{
			System.out.println(text + secondNumber);
		}
	}
}

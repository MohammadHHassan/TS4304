package day2;

import java.util.InputMismatchException;		//InputMismatchException API
import java.util.Scanner;		//Scanner API

public class LearningScanner
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String b = scanner.nextLine();
		System.out.println("Your name is " + b);
		
		System.out.println("Please enter your last name: ");
		String c = scanner.nextLine();
		System.out.println("Your last name is " + c);
		
		System.out.println(b + " " + c);
		
		System.out.println("Please enter an integer: ");
		int a = scanner.nextInt();
		System.out.println("User input: " + a);
		
		System.out.println("Please enter double value: ");
		double d = scanner.nextDouble();
		System.out.println("d = " + d);
		
		System.out.println("Please enter an integer: ");
		
		try
		{
			//Scanner scanner = new Scanner(System.in);
			int e = scanner.nextInt();
			System.out.println("User input = " + e);
			scanner.close();
		}
		catch (InputMismatchException e)
		{
			System.out.println("Wrong input");
		}
	}
}

package day2;

import java.util.Scanner;

public class LearningConditionalIfStatement
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a value within the range of 5-10:");
		int a = scanner.nextInt();
		
		if (a>=5 && a<=10)
		{
			System.out.println("The value " + a + " is within the range of 5-10.");
		}
		else
		{
			System.out.println("Input is out of range.");
		}
		scanner.close();
	}
}

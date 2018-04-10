package day2;

import java.util.Scanner;

public class LearningNestedIfStatement
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = scanner.nextInt();
		
		if (age<40 && age>=0)		//10
		{
			System.out.println("Muda");
			if (age<18 && age>=0)
			{
				System.out.println("Remaja");
			}
			else if (age>=18 && age<=35)
			{
				System.out.println("Dewasa");
			}
			else
			{
				System.out.println("Mature");
			}
		}
		
		else if (age>=40)
		{
			System.out.println("Tuha");
		}
		else
		{
			System.out.println("Invalid age");
		}
		scanner.close();
	}
}

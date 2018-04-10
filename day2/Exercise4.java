package day2;

import java.util.Scanner;

/* Implement a Scanner class
 * Prompt the user to enter their marks
 * If marks>=50, Pass
 * Else, Fail
 * Additionally, If marks>=90, Distinction
 * 				 If marks>=80 & marks<90, Merit
 * 				 If marks>=50 & marks<80, Pass
 */

public class Exercise4
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your marks: ");
		double marks = scanner.nextDouble();
		
		if(marks>=50)
		{
			System.out.println("Pass");
			if (marks>=90)
			{
				System.out.println("Distinction");
			}
			else if (marks>=80 && marks<90)
			{
				System.out.println("Merit");
			}
			else
			{
				System.out.println("Pass");
			}
		}
		else
		{
			System.out.println("Fail");
		}
		
		scanner.close();
	}
}

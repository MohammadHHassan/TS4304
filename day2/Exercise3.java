package day2;

import java.util.Scanner;

/* Implement a Scanner class
 * Prompt user for input of a and b
 * Store the value in a and b
 * If a>b, Print "a is greater than b"
 * Else, Print "a is not greater than b"
 */

public class Exercise3 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the value of a: ");
		int a = scanner.nextInt();
		
		System.out.println("Please enter the value of b: ");
		int b = scanner.nextInt();
		
		if (a>b)
		{
			System.out.println("a is greater than b");
		}
		else if (a==b)
		{
			System.out.println("a equals b");
		}
		else
		{
			System.out.println("a is not greater than b");
		}
		
		scanner.close();
	}
}

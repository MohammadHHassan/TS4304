package day3;

import java.util.Scanner;

/* Implement a Scanner class
 * Prompt the user for input (Integer)
 * Store the input in a variable
 * Sum the input 10 times using for loop
 * Print out the total
 */

public class Exercise1
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int input = scanner.nextInt();
		
		for (int i=0 ; i<10 ; i++)
		{
			sum = sum + input;
		}
		
		System.out.println("Total = " + sum);
	}
}

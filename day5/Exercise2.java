package day5;

import java.time.LocalDate;
import java.util.Scanner;

/* Implement a LocalDate class
 * Store the integer Year in a variable (Optional)
 * Implement a Scanner class
 * Prompt the user for your birth year
 * Store the input in a variable
 * Calculate your age for this year
 * Display your age for this year
 */

public class Exercise2
{
	public static void main(String[] args)
	{
		LocalDate now = LocalDate.now();
		int currentYear = now.getYear();		//Current year 2018
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your birth year: ");
		int birthYear = scanner.nextInt();		//User's input
		
		int age = currentYear - birthYear;
		System.out.println("My age is " + age);
	}
}

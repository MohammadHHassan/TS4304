package day2;

import java.util.Scanner;

/* Implement a Scanner class
 * Prompt user to input Name and Age
 * Store the user's input in two variables
 * Print out the Name and Age
 */

public class Exercise2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Please enter your age: ");
		int age = scanner.nextInt();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		
		scanner.close();
	}
}

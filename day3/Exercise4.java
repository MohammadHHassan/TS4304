package day3;

import java.util.Scanner;

/* Implement a Scanner class
 * Prompt the user for number of students in a class
 * Store the number of students as the size of an array
 * Prompt the user to enter each name of the student
 * Store each name of the student in the array
 * Print out each name
 * Hint: Use two for loops and make use of <arrayname>.length
 * 		 Loop 1: Store the names
 * 		 Loop 2: Display the names
 */

public class Exercise4
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number of students: ");
		int x = scanner.nextInt();
		
		String [] names = new String [x];
		
		for (int i=0 ; i<x ; i++)
		{
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Enter the name of Student " + (i+1) + ": ");
			String studentName = scanner2.nextLine();
			names [i] = studentName;
		}
		
		System.out.println("\n==================================================");
		
		for (int j=0 ; j<x ; j++)
		{
			System.out.println("Student " + (j+1) + " name is " + names[j]);
		}
		
		scanner.close();
	}
}

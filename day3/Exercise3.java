package day3;

import java.util.Scanner;

/* Implement a Scanner class
 * Use a while loop
 * Keep on prompting the user for input (Integer)
 * Until the integer input entered is 5.
 */

public class Exercise3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int input=0;
		int i=1;
		
		while(input!=5)
		{
			System.out.println("Cubaan yang ke-" + i);
			System.out.println("Sila tekan nombor 5: ");
			input = scanner.nextInt();
			i++;
			System.out.println("=====================");
		}
		
		System.out.println("Yay makan");
		
		scanner.close();
	}
}

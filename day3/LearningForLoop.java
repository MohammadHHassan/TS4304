package day3;

import java.util.Scanner;

public class LearningForLoop
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		
		for (int i=0 ; i<10 ; i++)
		{
			System.out.println(i + " " + a);
		}
		
		scanner.close();
	}
}

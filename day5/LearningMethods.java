package day5;

import java.util.Scanner;

public class LearningMethods
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the minimum value: ");
		int a = scanner.nextInt();
		
		System.out.println("Enter the maximum value: ");
		int b = scanner.nextInt();
		
		System.out.println("Total value: " + sumRangeValue(a,b));
	}
	
	public static int sumRangeValue(int min, int max)
	{
		int sum = 0;
		
		for (int i=min ; i<=max ; i++)
		{
			sum = sum+i;
		}
		
		return sum;
	}
}

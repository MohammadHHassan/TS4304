package day6;

import java.util.Scanner;

public class LearningParseInt
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		String a = scanner.nextLine();
		System.out.println(a);
		System.out.println(a+10);
		
		int b = Integer.parseInt(a);
		System.out.println(b+10);
		
	}
}

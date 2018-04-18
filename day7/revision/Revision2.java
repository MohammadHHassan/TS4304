package day7.revision;

import java.util.Scanner;

public class Revision2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your username: ");
		String name1 = scanner.nextLine();
		
		while(true)
		{
			System.out.println("Please enter your password: ");
			String pass1 = scanner.nextLine();
			
			if(pass1.equals("abc123"))
			{
				System.out.println("Welcome" + name1);
				break;
			}
			else
			{
				System.out.println("Invalid password");
				System.out.println("Please try again");
			}
		}
		scanner.close();
	}
}

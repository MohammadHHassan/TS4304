package day8.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessingApplication
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> guessedNumber = new ArrayList<Integer>();
		
		int randomNumber = (int)(1 + Math.random() * (11 - 1));
		
		while(true)
		{
			System.out.println("Please enter your guess (1-10): ");
			int guess = scanner.nextInt();
			
			if (guess == randomNumber)
			{
				System.out.println("Lurus");
				break;
			}
			else
			{
				for(int i=0 ; i<guessedNumber.size() ; i++)
				{
					if(guessedNumber.get(i) == guess)
					{
						System.out.println("Sudah teka");
						break;
					}
				}
				guessedNumber.add(guess);
				System.out.println("Salah");
			}
		}
		scanner.close();
	}
}








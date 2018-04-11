package day3;

public class LearningArrays
{
	public static void main(String[] args)
	{
		String [] names = new String [5];
		names [0] = "A";
		names [1] = "B";
		names [2] = "C";
		names [3] = "D";
		names [4] = "E";
		
		for (int i=0 ; i<5 ; i++)
		{
			System.out.print(i + ". " + names [i] + "\t");
		}
		
		System.out.println("\n=======================================");

		for (String nama : names)
		{
			System.out.print(nama + "\t");
		}
		
		System.out.println("\n=======================================");
		
		int [] number = new int [5];
		number [0] = 10;
		number [1] = 20;
		number [2] = 30;
		number [3] = 40;
		number [4] = 50;
		
		for (int j=0 ; j<number.length ; j++)
		{
			System.out.print(j + ". " + number [j] + "\t");
		}
		
		System.out.println("\n=======================================");
		
		for (int num : number)
		{
			System.out.print(num + "\t");
		}
	}
}

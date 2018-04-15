package day4;

public class LearningMethods
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for (int i=1 ; i<=5 ; i++)
		{
			System.out.println("sum = " + sum + " + " + i);
			sum = sum+i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		
		for (int i=10 ; i<=15 ; i++)
		{
			System.out.print("sum = " + sum2 + " + " + i);
			sum2 = sum2+i;
			System.out.print("\tNew sum = " + sum2);
			System.out.println();
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		
		for (int i=20 ; i<=25 ; i++)
		{
			System.out.print("sum = " + sum3 + " + " + i);
			sum3 = sum3+i;
			System.out.print("\tNew sum = " + sum3);
			System.out.println();
		}
		System.out.println(sum3);
		
	}
}

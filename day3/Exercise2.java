package day3;

/* Copy and paste the codes in LearningNestedForLoop.java
 * This time, sum i and j
 * And print out the total
 */

public class Exercise2
{
	public static void main(String[] args)
	{
		int sum2 = 0;
		int sum1;
		
		for (int i=0 ; i<5 ; i++)
		{	
			sum1 = 0;
			
			for (int j=0 ; j<5 ; j++)
			{
				System.out.print(i + "," + j + "\t");
				sum1 = sum1 + i + j;
			}
			System.out.print("\tTotal row " + i + " is: " + sum1);
			System.out.println();
			sum2 = sum2 + sum1;
		}
		System.out.println("Total = " + sum2);
	}
}

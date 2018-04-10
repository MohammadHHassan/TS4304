package day2;

/* Given x = 789
 * Take out every single digit in x 
 * and store each digit in a variable.
 * i.e. m1 = 7, m2 = 8, m3 = 9
 */

public class Exercise1
{
	public static void main(String[] args)
	{
		int x = 789;
		
		//m3
		int m3 = x%10;		// m3 = 9
		
		//m2
		int a = x%100;		// a = 89
		int m2 = a/10;		// m2 = 8
		
		//m1
		int m1 = x/100;
		
		System.out.println("m1 = " + m1);
		System.out.println("m2 = " + m2);
		System.out.println("m3 = " + m3);
	}
}

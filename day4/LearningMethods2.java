package day4;

public class LearningMethods2
{
	public static void main(String[] args)
	{
		//int a = sumRangeValue(1,5);
		System.out.println(sumRangeValue(1,5));
		//int b = sumRangeValue(10,15);
		System.out.println(sumRangeValue(10,15));
		//int c = sumRangeValue(20,25);
		System.out.println(sumRangeValue(20,25));
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
	
	//public static String displaySum()
	//{
		
	//}
}

package day4;

public class LearningStatic
{
	static int y = 10;
	
	public static void main(String[] args)
	{
		int x = 5;
		
		System.out.println("Old y = " + y);
		System.out.println("New y = " + incrementYBy20());
		System.out.println("New y = " + incrementYBy20());
		System.out.println("Old y = " + y);
		
		System.out.println("New x = " + incrementBy10(x));
		System.out.println("Old x = " + x);
	}
	
	public static int incrementYBy20()
	{
		return y = y+20;
	}
	
	public static int incrementBy10(int value)
	{
		return value = value+10;
	}
}

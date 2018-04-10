package day2;

public class LearningString
{
	public static void main(String[] args)
	{
		String a = "Password123";
		System.out.println(a);
		
		String b = "Password123";
		System.out.println(b);
		
		boolean c = a.equals(b);
		System.out.println(c);
		
		String d = "Champions League Liverpool";
		String e = "Liverpool";
		int f = d.indexOf(e);
		System.out.println(f);
		// If int f = -1, e is NOT a substring of d
		// else e is a substring of d
	}
}

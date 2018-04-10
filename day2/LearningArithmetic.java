package day2;

public class LearningArithmetic
{
	public static void main(String[] args)
	{
		int a = 9;
		int b = 4;
		int c = a/b;		// c = 9/4 - Integer
		System.out.println("c = " + c);
		
		double d = 9;
		double e = 4;
		double f = d/e;		// f = 9/4 - Double
		System.out.println("f = " + f);
		
		double g = 4;
		double h = 3;
		double i = Math.pow(g, h);
		System.out.println("i = " + i);
		
		double j = 16;
		double k = Math.sqrt(j);
		System.out.println("k = " + k);
		
		int l = 11;
		int m = 3;
		int n = l%m;		// Modulus
		System.out.println("n = " + n);
		
		double o = 50 + (Math.random() * (101 - 50));	// Range: 50-100 Inclusive
		System.out.println("o = " + o);
		
		//Range: 50-100 Inclusive Integer by Casting
		// min + (Math.random() * (max + 1 - min))
		int p = (int) (50 + (Math.random() * (101 - 50)));	
		System.out.println("p = " + p);
		
		double q = 7.9999;
		int r = (int) q;
		System.out.println("r = " + r);
		
		int s = 8;
		double t = (double) s;
		System.out.println("t = " + t);
	}
}

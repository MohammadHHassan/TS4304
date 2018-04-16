package day5.exercise1;

public class RunProgram
{
	public static void main(String[] args)
	{
		Children anakPertama = new Children();
		anakPertama.name = "Dr Strange";
		anakPertama.age = 18;
		anakPertama.dateOfBirth = "15th April 2000";
		anakPertama.gender = 'M';
		
		System.out.println(anakPertama);
		
		Children anakKedua = new Children();
		anakKedua.name = "Fadzilah";
		anakKedua.age = 31;
		anakKedua.dateOfBirth = "11th November 1986";
		anakKedua.gender = 'M';
		
		System.out.println(anakKedua);
	}
}

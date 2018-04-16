package day5.improvedemployeeapp;

import java.time.LocalDate;

public class Employee
{
	final int MIN_AGE_LIMIT = 20;
	final int MAX_AGE_LIMIT = 60;
	
	int id;
	String name;
	private int birthYear;
	private static int countEmployee=0;
	
	public Employee(String name, int birthYear)
	{
		this.name = name;
		this.editBirthYear(birthYear);
		countEmployee++;
		this.id = countEmployee;
	}
	
	public void editBirthYear(int birthYear)
	{
		LocalDate now = LocalDate.now();
		
		int minimumBirthYear = now.getYear() - MIN_AGE_LIMIT;
		int maximumBirthYear = now.getYear() - MAX_AGE_LIMIT;
		
		if (birthYear>=maximumBirthYear && birthYear<=minimumBirthYear)
		{
			this.birthYear = birthYear;
		}
		else
		{
			this.birthYear = 0;
		}
	}
	
	public int getAge()
	{
		LocalDate now = LocalDate.now();
		int age = now.getYear() - birthYear;
		return age;
	}
	
	public static int getNumberEmployee()
	{
		return countEmployee;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", birthYear=" + birthYear + "]";
	}
}

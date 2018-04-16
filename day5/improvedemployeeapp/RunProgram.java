package day5.improvedemployeeapp;

public class RunProgram
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Mohammad", 1980);
		System.out.println(employee1);
		
		Employee employee2 = new Employee("Hj Hassan", 1949);
		System.out.println(employee2);
		employee2.editBirthYear(1960);
		System.out.println(employee2);
		
		System.out.println("Total number of employee = " + employee2.getNumberEmployee());
		System.out.println("Employee 2 age is " + employee2.getAge());
	}
}

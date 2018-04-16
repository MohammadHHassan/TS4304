package day5.employeeapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Mohammad", 18);
		System.out.println("Employee 1:" + employee1);
		
		Employee employee2 = new Employee("Hj Hassan", 69);
		System.out.println("Employee 2:" + employee2);
		
		Employee employee3 = new Employee("abc", 65);
		System.out.println("Employee 3:" + employee3);
		
		System.out.println(employee2.id);
		System.out.println(employee2.getNumberEmployee());
		
		employee1.editAge(19);
		System.out.println("Employee 1:" + employee1);
		
		employee3.editAge(66);
		System.out.println("Employee 3:" + employee3);
	}
}

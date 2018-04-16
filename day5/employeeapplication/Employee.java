package day5.employeeapplication;

public class Employee
{
	int id;			//Instance variable
	private String name;
	private int age;
	
	private static int countEmployee=0;
	
	public Employee(String name, int age)		//Parameter variable
	{
		this.name = name;
		//this.age = age;
		this.editAge(age);
		countEmployee++;
		this.id = countEmployee;
	}
	
	public int getNumberEmployee()
	{
		return countEmployee;
	}
	
	public void editAge(int age)
	{
		if (age>=18 && age<=65)
		{
			this.age = age;			
		}
		else
		{
			this.age = 0;
		}
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}

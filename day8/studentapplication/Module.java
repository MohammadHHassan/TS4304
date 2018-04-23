package day8.studentapplication;

public class Module
{
	private String code;
	private String name;
	private Student[] students;
	private int currentNumberStudents = 0;
	
	public Module(String code, String name, int maxNumberStudents)
	{
		this.code = code;
		this.name = name;
		students = new Student[maxNumberStudents];
	}
	
	public String getCode()
	{
		return code;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Student[] getStudents()
	{
		return students;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public boolean addStudent(Student student)
	{
		if(currentNumberStudents>=students.length)
		{
			return false;
		}
		for(int i=0 ; i<students.length ; i++)
		{
			if(students[i] != null)
			{
				if(students[i].getId() == student.getId())
				{
					return false;
				}
			}
		}
		students[currentNumberStudents] = student;
		currentNumberStudents++;
		return true;
	}
}






package day8.studentapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Module napModule = new Module("TS4304", "Network Application Programming", 3);
		Student student1 = new Student("Abu", 20);
		Student student2 = new Student("Bakar", 30);
		Student student3 = new Student("Ahmad", 50);
		Student student4 = new Student("Sajat", 25);
		
		System.out.println("Module: " + napModule.getCode() + " " + napModule.getName());
		
		printAddingStudent(napModule, student1);
		printAddingStudent(napModule, student2);
		printAddingStudent(napModule, student3);
		printAddingStudent(napModule, student4);

		
		for(int i=0 ; i<napModule.getStudents().length ; i++)
		{
			System.out.println(napModule.getStudents()[i].getId() + " " + napModule.getStudents()[i].getName());
		}
	}
	
	public static void printAddingStudent(Module module, Student student)
	{
		System.out.println("Adding student: " + student.getId() + " " + student.getName());
		System.out.println("Successful? " + module.addStudent(student));
	}
}






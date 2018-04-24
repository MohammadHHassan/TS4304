package day9.learningthreads;

public class RunProgram
{
	public static void main(String[] args)
	{
		Message message1 = new Message("Mohammad");
		Message message2 = new Message("Hj");
		Message message3 = new Message("Hassan");
		
		new Thread(message1).start();
		new Thread(message2).start();
		new Thread(message3).start();
	}
}



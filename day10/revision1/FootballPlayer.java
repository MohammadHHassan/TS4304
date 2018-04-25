package day10.revision1;

public class FootballPlayer
{
	String name;
	int number;
	int duration;
	static int noOfPlayer=0;
	
	public FootballPlayer(String name, int number)
	{
		this.name = name;
		this.number = number;
		noOfPlayer++;
	}
	
	public void getDuration()
	{
		int yearNow = 2018;
		int yearJoined = 2017;
		duration = yearNow - yearJoined;
		System.out.println(duration);
	}
	
}




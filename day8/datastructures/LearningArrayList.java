package day8.datastructures;

import java.util.ArrayList;

public class LearningArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Mohammad");
		nameList.add("Haji Hassan");
		nameList.add("Abu");
		nameList.add("Bakar");
		
		for(String name : nameList)
		{
			System.out.print(name + " ");
		}
		
		nameList.add(0, "Awang");
		nameList.add(1, "Bin");
		System.out.println();
		
		for(String name : nameList)
		{
			System.out.print(name + " ");
		}
		
		nameList.remove(1);
		System.out.println();
		
		for(String name : nameList)
		{
			System.out.print(name + " ");
		}
		
		nameList.remove("Abu");
		nameList.remove("Bakar");
		System.out.println();
		
		for(String name : nameList)
		{
			System.out.print(name + " ");
		}
		System.out.println();
		System.out.println(nameList.get(1));
		
		System.out.println(nameList.size());
	}
}





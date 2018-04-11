package day3;

public class Learning2DArrays
{
	public static void main(String[] args)
	{
		String [][] names = new String [3][4];
		
		System.out.println("Row size = " + names.length);
		
		System.out.println("Column (Row=0) size = " + names[0].length);
		System.out.println("Column (Row=1) size = " + names[1].length);
		System.out.println("Column (Row=2) size = " + names[2].length);
		
		//Row = 0 Data
		names [0][0] = "A";
		names [0][1] = "B";
		names [0][2] = "C";
		names [0][3] = "D";
		
		//Row = 1 Data
		names [1][0] = "E";
		names [1][1] = "F";
		names [1][2] = "G";
		names [1][3] = "H";
		
		//Row = 2 Data
		names [2][0] = "I";
		names [2][1] = "J";
		names [2][2] = "K";
		names [2][3] = "L";
		
		for (int row=0 ; row<3 ; row++)
		{
			for (int column=0 ; column<4 ; column++)
			{
				System.out.print(names[row][column] + "\t");
			}
			System.out.println();
		}
	}
}

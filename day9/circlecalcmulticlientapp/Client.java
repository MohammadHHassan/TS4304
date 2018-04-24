package day9.circlecalcmulticlientapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("localhost", 9101);
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);
			
			while(true)
			{
				System.out.println("Please enter radius value: ");
				String radiusInput = scanner.nextLine();
				double radius = Double.parseDouble(radiusInput);
				
				toServer.writeDouble(radius);
				
				double area = fromServer.readDouble();
				
				System.out.println("Sent radius: " + radius);
				System.out.println("Received area: " + area);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

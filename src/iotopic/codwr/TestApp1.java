package iotopic.codwr;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		// String data --- file in file
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		try 
		{
			FileWriter  fw = new FileWriter("ctest.txt", true);
			fw.write(name);
			fw.close();
			System.out.println("Success");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}

package iotopic.bowr;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class TetsApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();

		byte b[] = name.getBytes();
		//Data --->name
		// Byte Oriented Way - Data---write ---file

		// OutputStream - writting purpose 
		// InputStream----readding purpose
		try 
		{
			FileOutputStream fout = new FileOutputStream("test1.txt");
			
			fout.write(b);
		
			fout.close();
			
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}

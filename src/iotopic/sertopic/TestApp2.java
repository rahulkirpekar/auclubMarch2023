package iotopic.sertopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new  FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\auocjp\\aubatch.txt");
			
			ObjectInputStream oin = new ObjectInputStream(fin);
			
//			Object obj = oin.readObject();
//			Student s = (Student)obj;
//			s.disp();
			
			Student sobj = 	(Student)oin.readObject();
			sobj.disp();
			
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}

package backup;

import java.util.Scanner;
public class Student 
{
	int rno;
	String name;
	int std;
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " " +name  + " " +std);
	}
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];// studentArrayObject---s[0],s[1],s[2],s[3],s[4]
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scan();
		}
		for (int i = 0; i < s.length; i++) 
		{
			s[i].disp();
		}
	}
}
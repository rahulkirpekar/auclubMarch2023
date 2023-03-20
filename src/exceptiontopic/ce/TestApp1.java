package exceptiontopic.ce;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		System.out.println("Statement----1");
		System.out.println("Statement----2");
		System.out.println("Statement----3");
		System.out.println("Statement----4");
		System.out.println("Statement----5");
		
		int ans = no1/no2;// raise --- ArithmeticException
		
		System.out.println("Ans : " + ans);
		
		System.out.println("Statement----6 ");
		System.out.println("Statement----7 ");
		System.out.println("Statement----8 ");
		System.out.println("Statement----9 ");
		System.out.println("Statement----10");
	}
}

package oops.polytopic.cp;

import java.util.Scanner;

public class TestApp1 
{
	// method overloadding
	// NR-NA
	static void addFun() 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		int ans = no1+no2;
		System.out.println("ZERo args---Additioon : " +ans); 
	}
	static void addFun(int no1,int no2) 
	{
		int ans = no1+no2;
		System.out.println("int---Two args --- Additioon : " +ans); 
	}
	static void addFun(float no1,float no2) 
	{
		float ans = no1+no2;
		System.out.println("float---Two args --- Additioon : " +ans); 
	}
	static void addFun(int no1,int no2,int no3) 
	{
		int ans = no1+no2+no3;
		System.out.println("Three args --- Additioon : " +ans); 
	}
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		// 50 lines ---2 values --- argument
		addFun(no1,no2);// Zero Args Method
		addFun();
		
		addFun(10,20,30);
		
		addFun(12.0f,324.45f);
	}
}

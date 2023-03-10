package oops.abstopics.interfacetopic;

public interface A 
{
//	1) Data Members---[public static final]
	public static final int NO1 = 10;
	public final int NO2 = 20;// static 
	public static int NO3 = 10;// final 
	static final int NO4 = 10;// public 
	int NO5 = 10;// public static final 
	
//	2) abstract method---[public abstract]
	public abstract void test1();
	void test2();// public abstract 
	public void test3();// abstract 
	abstract void test4();// public 

// JDK---8	
//	3) static method---non abstrac method
	public static void test5() 
	{
		System.out.println("A -- test5()");
	}
	
//	4) default method---non abstrac method
	public default void test6() 
	{
		System.out.println("A --default--- test6()");
		test7();
	}
// JDK---9	
//	5) private method---non abstrac method
	private void test7() 
	{
		System.out.println("A -- private--test6()");
	}
}
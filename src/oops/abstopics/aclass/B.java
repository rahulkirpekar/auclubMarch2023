package oops.abstopics.aclass;

public class B extends A
{
	public void test1() 
	{
		System.out.println("B - test1()");
	}
	public void test2() 
	{
		System.out.println("B - test2()");
	}
	public static void main(String[] args) 
	{
		B obj = new B();
		
		obj.test1();
		obj.test2();
		obj.test3();
	}
}

package oops.abstopics.interfacetopic;

public class TestApp1 implements A
{
	@Override
	public void test1() 
	{
		System.out.println("TestApp1 -- test1()");
	}
	@Override
	public void test2() 
	{
		System.out.println("TestApp1 -- test2()");
	}
	@Override
	public void test3() 
	{
		System.out.println("TestApp1 -- test3()");
	}
	@Override
	public void test4() 
	{
		System.out.println("TestApp1 -- test4()");
	}
	public static void main(String[] args) 
	{
		TestApp1 app1 = new TestApp1();
		app1.test1();
		app1.test2();
		app1.test3();
		app1.test4();
		app1.test6();

		A.test5();
		
	}
}

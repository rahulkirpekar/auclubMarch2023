package oops.polytopic.cp;

public class TestOverloading4 
{
	public static void main(String[] args) 
	{
		System.out.println("main with String[]");
		main("Rahul");
		main();
	}
	public static void main(String args) 
	{
		System.out.println("main with String");
	}
	public static void main() 
	{
		System.out.println("main without args");
	}
}
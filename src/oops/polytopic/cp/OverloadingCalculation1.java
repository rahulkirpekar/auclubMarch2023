package oops.polytopic.cp;

public class OverloadingCalculation1 
{
	void sum(int a, long b) 
	{
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

	public static void main(String args[]) 
	{
		OverloadingCalculation1 obj = new OverloadingCalculation1();
	
		obj.sum(20, 20);// now ambiguity
	}
}

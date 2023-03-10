package oops.polytopic.rp.methodoverrdding;

public class HmvUser extends Vehicle
{
	@Override
	public void getSpec() 
	{
		System.out.println("HmvUser - getSpec()");
	}
}

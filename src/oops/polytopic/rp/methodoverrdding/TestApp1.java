package oops.polytopic.rp.methodoverrdding;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below choice : ");
		System.out.println("1) for TwUser");
		System.out.println("2) for LmvUser");
		System.out.println("3) for HmvUser");
		int choice = sc.nextInt();

		Vehicle vehicle = null;
		
		switch(choice) 
		{
			case 1: vehicle = new TwUser();
					vehicle.getSpec();
					break;
					
			case 2: vehicle = new LmvUser();
					vehicle.getSpec();
					break;
					
			case 3: vehicle = new HmvUser();
					vehicle.getSpec();
					break;
		}
//		Vehicle vehicle = new TwUser();
//		vehicle.getSpec();
		
//		vehicle = new LmvUser();
//		vehicle.getSpec();
		
//		vehicle = new HmvUser();
//		vehicle.getSpec();
		
		
//		TwUser twUser = new TwUser();
//		twUser.getSpec();
		
	}
}

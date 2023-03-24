package exceptiontopic;
import java.util.Scanner;
public class TetsApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no1,no2,ans = 0;
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();
		int a[] = new int[5];
		try 
		{
			try 
			{
				ans = no1/no2;
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				a[5] = 10;
				
			} catch (Exception e) {
				// TODO: handle exception
			}

			try 
			{
				String name = null;
				System.out.println("name.length() - " + name.length());
			} catch (Exception e) 
			{
			}
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Addition : " + ans);
	}
}

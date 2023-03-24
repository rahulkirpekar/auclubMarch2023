package exceptiontopic.tt;

import java.io.IOException;

public class TestApp1 
{
	public static void isValidForVote(int age) throws InvalidAgeException  
	{
		if (age < 18) 
		{
			// raise exception 1) checked   2) Unchecked
//			2) Unchecked
//			throw new ArithmeticException("Invalid Age,\n\tPlease enter age greater than 18");

//			1) checked   
			throw new InvalidAgeException("Invalid Age,\n\tPlease enter age greater than 18");
			
		} else 
		{
			System.out.println("Welcom for vote");
		}
	}
	public static void main(String[] args) 
	{
		try 
		{
			isValidForVote(10);
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		System.out.println("success After try catch block");
	}
}

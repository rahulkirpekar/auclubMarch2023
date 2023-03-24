package exceptiontopic.tt;

// Checked Exception ---> Custom Exception
public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String errorMsg) 
	{
		super(errorMsg);
	}
}

package stringtopic.stringmethods;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		String name = "abc";
		
		byte b[] = name.getBytes();

		
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(name.charAt(i) + " " +b[i]);
			
		}
	}
}

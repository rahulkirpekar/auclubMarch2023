package stringtopic.stringmethods;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		String stmt = "This is Java Which is Developed by James Gosling";
		//             012345678901234567890
		System.out.println(stmt);

		String value1 = stmt.substring(8,12);
		String value2 = stmt.substring(14,18);
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		
		System.out.println(value1 + " "+value2);
//		char a[] = stmt.toCharArray();
//		
//		for (char c : a) 
//		{
//			System.out.println(c);
//		}
//		stmt = stmt.replace("is", "was");
		
//		String words[] = stmt.split("\\s");
		
//		System.out.println(stmt);
		
//		for (String value : words) 
//		{
//			System.out.println(value);
//		}
	}
}

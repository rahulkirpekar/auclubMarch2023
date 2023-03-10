package stringtopic.immutableway;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		String name1 = new String("royal");
		String name2 = new String("royal");
		
		System.out.println("name1==name2 : " + (name1==name2));// false
		System.out.println("name1.equals(name2) : " + name1.equals(name2));//true
	}
}

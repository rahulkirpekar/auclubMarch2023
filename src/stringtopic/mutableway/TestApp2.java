package stringtopic.mutableway;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// MutableWay---1) StringBuffer---synchronized--Threadsafe
		
		StringBuffer sb = new StringBuffer("royal");
		System.out.println(sb.hashCode() + " " +sb);
		sb.append(" Technosoft");
		System.out.println(sb.hashCode() + " " +sb);

	}
}

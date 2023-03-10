package stringtopic.mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// MutableWay---1) StringBuilder
		
		StringBuffer sb = new StringBuffer("royal");
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		
//		System.out.println(sb.hashCode() + " " +sb);
//		sb.append(" Technosoft");
//		System.out.println(sb.hashCode() + " " +sb);
	}
}

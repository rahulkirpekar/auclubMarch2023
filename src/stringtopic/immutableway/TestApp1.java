package stringtopic.immutableway;


//1) Immutable Way[String]:-
//-------------------------
public class TestApp1 
{
	public static void main(String[] args) 
	{
	//1) "By String Literals way" :- "HEAP"---->["String Constant Pool"]
	//-----------------------------
		String name1 = "royal";
		String name2 = "royal";
		
//		name1.reverse();
		
		
		name1 = name1.concat(" techno");// "royal techno"
		
		System.out.println("Name1 : " + name1);// royal
		
		
		
//		String name2 = "royal";
//		String name3 = "test";

//		System.out.println(name1==name2);// true
//		System.out.println(name1==name3);// false
//		System.out.println(name1.equals(name2));// true
//		System.out.println(name1.equals(name3));// false
		
	}
}

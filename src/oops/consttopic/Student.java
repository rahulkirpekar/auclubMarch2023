package oops.consttopic;

public class Student 
{
	private int rno;//0
	private String name;//null
	private int std;//0
	
	// 1) Default Constructor
	public Student() 
	{
		System.out.println("START :: Default Constructor --- " + this);
		rno=1;
		name="royal";
		std=12;
		System.out.println("EXIT :: Default Constructor");
	}
	// 2) para Const
	public Student(int r,String n, int s) 
	{
		System.out.println("START :: Para Constructor --- " + this);
		System.out.println("Para ===> "+rno + " " +name +  " " + std);
		rno=r;
		name=n;
		std=s;
		System.out.println("EXIT :: Para Constructor");
	}
	// 3) Copy Const
	public Student(Student s) 
	{
		System.out.println("START :: Copy Constructor --- " + this);
		System.out.println("Copy ===> "+rno + " " +name +  " " + std);
//       s2<-----s1
		rno  = s.rno;
		name = s.name;
		std  = s.std;
		System.out.println("EXIT :: Copy Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("START :: Main method");

		// s1--object create ----[JVM Default Constructor]---[Default Values]
		Student s1 = new Student(1, "rahul Kirpekar", 12);
		Student s2 = new Student(s1);
		
		s1.disp();
		s2.disp();
		// s2--object create ----[JVM Default Constructor]---[Default Values]
//		Student s2 = new Student();
		// s3--object create ----[JVM Default Constructor]---[Default Values]
//		Student s3 = new Student();

//		System.out.println("s1 ===> "+s1.rno + " "+ s1.name + " " +s1.std +  "---" + s1);
//		System.out.println("s2 ===> "+s2.rno + " "+ s2.name + " " +s2.std +  "---" + s2);
//		System.out.println("s3 ===> "+s3.rno + " "+ s3.name + " " +s3.std +  "---" + s3);
		System.out.println("EXIT :: Main method");
	}
	private void disp() 
	{
		System.out.println(rno + " "+name + " "+std + " - "+this);
	}
}
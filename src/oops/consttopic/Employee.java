package oops.consttopic;

public class Employee 
{
	// this--current class Properties
	// class Properties = 1) Dm's 2) Mf's
	private int id;
	private String name;
	private int salary;
	private String dsgn;
	
	public Employee() 
	{
		id=1;
		name="abc";
		salary=12;
		dsgn="SE";
	}
	public Employee(int id,String name,int salary) 
	{
		this();
		this.id = id;
		this.name = name;
		this.salary=salary;
	}
	public Employee(int id,String name,int salary,String dsgn) 
	{
		this(id,name,salary);
		this.dsgn=dsgn;
	}
	public void disp() 
	{
		System.out.println(id + " "+name + " "+salary+" "+dsgn);
	}
}

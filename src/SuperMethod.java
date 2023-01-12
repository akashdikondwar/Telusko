class SuperClass
{
	public SuperClass() 
	{
		System.out.println("this is normal super constructor");
	}
	//it is necessary to make default constructor while defining new constructor
	//because constructor of subclass will contain default constructor of super class
	
	
	public SuperClass(int a)
	{
		System.out.println("this is parameterized super constructor");
	}
}

class SubClass extends SuperClass
{
	public SubClass()
	{
		System.out.println("this is normal subclass constructor");
	}
	public SubClass(int a)
	{
		super(a);
		System.out.println("this is paramerterized subclass constructor");
	}
}

public class SuperMethod 
{
	public static void main(String args[])
	{
		SubClass obj=new SubClass(1);
	}
}

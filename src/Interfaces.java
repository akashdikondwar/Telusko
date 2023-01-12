interface Calculator
{
	int a=10;//this will automatically become final or constant
	default void add(int a, int b)
	{
			System.out.println(a+b);//we can give what we want to input
	}
	default void sub()
	{
		
	}
	
}

class A 
{
	public void add(int a, int b)
	{
		System.out.println("this is in class A");
	}
}
class Calci extends A implements Calculator 
{
//	public void add(int a,int b)
//	{
//		System.out.println(a+b);
//	}
//
}
public class Interfaces 
{
	public static void main(String args[])
	{
		Calculator Obj=new Calci();
		Obj.add(1,2);//even if ambiguity happening, still class A overriding
		
	}
}

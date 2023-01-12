class Outer
{
	int num1;
	
	static class Inner1
	{
		int num2;
		public void verify()
		{
			System.out.println("Static Inner class method");
		}
		
	}
	class Inner2
	{
		int num3;
		public void verify()
		{
			System.out.println("Non static Inner class method");
		}
		
	}
	
}
public class InnerClass 
{

	public static void main(String[] args) 
	{
		Outer obj1=new Outer();
		Outer.Inner1 obj2=new Outer.Inner1();
		obj2.num2=2;
		obj2.verify();
		
		Outer.Inner2 obj3=obj1.new Inner2();
		obj3.verify();
		
		
		// TODO Auto-generated method stub

	}

}

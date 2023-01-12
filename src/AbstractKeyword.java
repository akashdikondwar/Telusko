abstract class aka
{
	public void add(){
		System.out.println("this is add function in abstract class");
	}
	abstract void divide();//directly close the line without body brackets otherwise error.
	//abstract and public both cannot be used
}

class aka1 extends aka//The type aka1 must implement the inherited abstract method aka.divide()
{
	void divide()
	{
		System.out.println("divide method in aka1");
	}
}

class aka2 extends aka1//The type aka1 must implement the inherited abstract method aka.divide()
{
	void divide()
	{
		System.out.println("divide method in aka2");
	}
}
public class AbstractKeyword 
{
	public static void main(String Args[])
	{
		aka obj=new aka1();//we can give reference of abstract class
		obj.divide();
		obj.add();
	}
}

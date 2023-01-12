class One
{
	public void run()
	{
		System.out.println("run one");
	}
}

class Two extends One
{
	public void run()
	{
		System.out.println("run two");
	}
}

class Three extends Two
{
	public void run()
	{
		System.out.println("run three");
	}
}

public class DynamicMethodDispatch 
{
	public static void main(String Args[])
	{
		One obj=new Two();
		obj.run();
	}
}

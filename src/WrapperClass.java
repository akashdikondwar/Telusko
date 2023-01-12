
public class WrapperClass 
{
	public static void main(String Args[])
	{
		int i=10;
		Integer obj=new Integer(i); //Integer wrapped in Integer class Object
		int a=obj.intValue();
		System.out.println(a);
	}
}

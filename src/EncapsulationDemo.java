class Encapsulation
{
	private int num1;
	public int getNum1() 
	{
		return num1;
	}

	public void setNum1(int num1) 
	{
		this.num1 = num1;
	}

	
	
}
public class EncapsulationDemo
{
	public static void main(String args[])
	{
		int a;
		Encapsulation obj=new Encapsulation();
		a=obj.getNum1();
		System.out.println(a);
		obj.setNum1(5);
		System.out.println(obj.getNum1());
	}

}

class Adder
{
	int num1;
	float num2;
	float num3;
//	int plus float will give result in float  
//	so cannot store in int type variable
	public Adder(int a,int b)
	{
		num1=a;
		num2=b;
		System.out.println("int");
	}
	public Adder(int a, char b)
	{
		num1=a;
		num2=b;
		System.out.println("char");
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
}
public class Constructor 
{

	public static void main(String[] args) 
	{
		Adder obj=new Adder(1,2);
		obj.add();
		Adder obj1=new Adder('A','A');
		obj1.add();

	}

}

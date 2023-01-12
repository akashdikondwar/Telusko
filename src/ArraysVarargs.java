class ArrayAdder
{
	public void add(int...i)
	{
		int sum=0;
		for (int j=0;j<i.length;j++)
		{
			sum=sum+i[j];
		}
		System.out.println("addition is "+sum);
	}
}
public class ArraysVarargs {
	
	public static void main(String args[])
	{
		int nums[]= {1,2,3,4};
		ArrayAdder obj=new ArrayAdder();
		obj.add(nums);
	}

}

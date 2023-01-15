import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo 
{

	public static void main(String[] args)

	{
		List <Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		System.out.println(list1.size());//tells size
		list1.set(1,12);
		//to replace element at index one to twelve
		// with O(1) complexity
		
		System.out.println(list1.get(1));
		//whenever we print full list with sysout, then automatically ToString method gets executed
		
		list1.remove(0);
		
		System.out.println(list1);

		list1.remove(1);
		
		System.out.println(list1);
		
	}
}

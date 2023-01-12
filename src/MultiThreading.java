class Aa extends Thread
{
	int sum=0;
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
			sum=sum+1;
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading 
{

	public static void main(String[] args) 
	{
		Aa obj=new Aa();
		
		obj.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(obj.sum);
	}

}

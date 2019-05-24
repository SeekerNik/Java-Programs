/*you can Synchronize your code by just adding the keyword Synchronize and in parenthesis you can add the object name through 
 * which your code is running */


class Thread1 implements Runnable
{
	public void run()
	{
		
		for(int i=0;;i++)
		{
			System.out.println("this Thread 1 : hello World!");
		}
	}
}

class Thread2 implements Runnable
{
	public void run()
	{
		
		for(int i=0;;i++)
		{
			System.out.println("this Thread 2 : hello JAVA!");
		}
	
	}
}
public class ThreadInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new Thread1());
		Thread t2=new Thread(new Thread2());
		t1.start();
	
		t2.start();
	
	}

}

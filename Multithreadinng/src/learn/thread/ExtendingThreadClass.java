package learn.thread;

 class ThreadClass extends Thread{
	
	public void run()
	{	
		try {
			System.out.println("Thread" +Thread.currentThread().getId() + "is running");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class ExtendingThreadClass
{
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			ThreadClass tc = new ThreadClass();
			tc.start();
		}
	}
}

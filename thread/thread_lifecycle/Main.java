public class Main
 {
	
	public static void main(String[] args) 
    {
		
		// Thread's New State
		A threadA = new A();
		B threadB = new B();
		// Both the above threads are in runnable state
		
		//Running state of thread A & B		
		threadA.start();
		
		//Move control to another thread
		threadA.yield();
		//Bolcked State of thread B
		try
         {			
			threadA.sleep(1000);
		 }
         catch (InterruptedException e)
          {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
          
		threadB.start();		
		System.out.println("Main Thread End");
	}
}

class A extends Thread 
{
    public void run()
    {
    System.out.println("Thread A");
    System.out.println("i in Thread A ");
    for(int i=1;i<=5;i++)
    {
        System.out.println("i = " + i);
        try 
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
        System.out.println("Thread A Completed."); 
    }
}
 class B extends Thread 
{
    public void run()
    {
        System.out.println("Thread B");
        System.out.println("i in Thread B ");
        for(int i=1;i<=5;i++)
        {
            System.out.println("i = " + i); 
        }
        System.out.println("Thread B Completed.");
    }
}
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
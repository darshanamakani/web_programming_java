//implementing Runnable interface
class thread2 implements Runnable
{  
    public void run()
    {  
    System.out.println("thread is running...");  
    }  
  
    public static void main(String args[])
    {  
    thread2 m1=new thread2();  
    Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
    t1.start();  
 }  
}  
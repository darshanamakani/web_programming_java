import java.lang.*;

public class thread_priority extends Thread {

    public void run() {
        System.out.println("Inside the run() method");
    }

    public static void main(String argvs[]) {

        thread_priority th1 = new thread_priority();
        thread_priority th2 = new thread_priority();
        thread_priority th3 = new thread_priority();

        System.out.println("Priority of the thread_1 is : "
                + th1.getPriority());

        // 2nd Thread
        // Display the priority of the thread
        System.out.println("Priority of the thread_2 is : "
                + th2.getPriority());

        // 3rd Thread
        // // Display the priority of the thread
        System.out.println("Priority of the thread_3 is : "
                + th3.getPriority());

        // Setting priorities of above threads by
        // passing integer arguments
        th1.setPriority(6);
        th2.setPriority(3);
        th3.setPriority(9);

        // 6
        System.out.println("Priority of the thread_1 is : "
                + th1.getPriority());

        // 3
        System.out.println("Priority of the thread_2 is : " + th2.getPriority());

        // 9
        System.out.println("Priority of the thread_3 is : " + th3.getPriority());

        // Main thread

        // Displaying name of the currently executing thread
        System.out.println("Currently Executing The Thread : "
                + Thread.currentThread().getName());

        System.out.println("Priority of the main thread is : "
                + Thread.currentThread().getPriority());

        // Priority of the main thread is 10 now
        Thread.currentThread().setPriority(10);

        System.out.println("Priority of the main thread is : "
                + Thread.currentThread().getPriority());
    }
}
/*-->It provides services to user threads 
for background supporting tasks. 
-->It has no role in life than to serve user threads.
-->Its life depends on user threads.
-->low priority thread
*/

public class daemon_thread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {// checking for daemon thread
            System.out.println("daemon thread work");
        } else {
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        daemon_thread t1 = new daemon_thread();// creating thread
        daemon_thread t2 = new daemon_thread();
        daemon_thread t3 = new daemon_thread();

        t1.setDaemon(true);// now t1 is daemon thread

        t1.start();// starting threads

        t2.start();
        t3.start();
    }
}
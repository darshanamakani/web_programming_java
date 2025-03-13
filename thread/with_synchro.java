public class with_synchro {
    public static void main(String args[]) {
        table obj = new table();
        thread1 t1 = new thread1(obj);
        thread2 t2 = new thread2(obj);
        t1.start();
        t2.start();
    }
}

class table {

    synchronized void printTable(int n) {// synchronized method
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class thread1 extends Thread {
    table t;

    thread1(table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }

}

class thread2 extends Thread {
    table t;

    thread2(table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }
}

public class without_synchro {
    public static void main(String args[]) {
        Table obj = new Table();// only one object
        thread1 t1 = new thread1(obj);
        thread2 t2 = new thread2(obj);
        t1.start();
        t2.start();
    }
}

class Table {
    void printTable(int n) {// method not synchronized
        for (int i = 1; i <= 5; i++) {
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
    Table t;

    thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }

}

class thread2 extends Thread {
    Table t;

    thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class single_inherit {
    public static void main(String args[]) {
        b b1 = new b();
        b1.i = 10;
        b1.j = 20;
        b1.k = 30;

        b1.show();
        b1.display();
    }
}

class a {
    int i, j;

    void show() {
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }
}

class b extends a {
    int k;

    void display() {
        System.out.println("k=" + k);
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }
}

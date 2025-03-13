
public class area1 {
    public static void main(String args[]) {
        int a1;
        rect1 r1 = new rect1();

        a1 = r1.area(10, 20);
        System.out.println("area=" + a1);

    }
}

class rect1 {

    int area(int l, int w) {
        return l * w;
    }
}

/*
 * class classname1
 * {
 * retuntype same_metho_name()
 * {
 * //block of code;
 * }
 * }
 */
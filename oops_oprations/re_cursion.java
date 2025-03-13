public class re_cursion {
    static int fact(int n) {
        if (n == 1)
            // base condition
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int result = fact(5);

        System.out.println("5! = " + result);
    }
}
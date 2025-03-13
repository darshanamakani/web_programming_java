public class me_overload {
  static int add1(int a, int b) {
    return a + b;
  }

  static double add1(double x, double y) {
    return x + y;
  }

  public static void main(String[] args) {
    int a = add1(1, 5);
    double d = add1(2.5, 3.5);
    System.out.println("integer addition=" + a);
    System.out.println("double addition=" + d);
  }
}

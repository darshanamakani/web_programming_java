public class my_oops1
{
  int x = 5;

  public static void main(String[] args)
   {
    my_oops1 m1 = new my_oops1();
    my_oops1 m2=new my_oops1();
    System.out.println(m1.x);
    m2.x=25;
    System.out.println(m2.x);
  }
}
 class abc
{
    public void a1()
    {
        System.out.println("hello");
    }
}

public class abc1 extends abc
{
    public static void main(String args[])
    {
        abc aa=new abc();
        aa.a1();
    }
}
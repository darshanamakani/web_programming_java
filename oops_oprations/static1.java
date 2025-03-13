public class static1
{
    public static void main(String args[])
    {
        float a,b;
        operation o1=new operation();
        a=o1.mul(10.0f,2.0f);
        b=o1.div(a,2.0f);
        System.out.println("multiplication="+a);
        System.out.println("division="+b);
    }
}
class operation
{
    static float mul(float x,float y)
    {
            return(x*y);
    }
    static float div(float x, float y)
    {
        return (x/y);

    }
}
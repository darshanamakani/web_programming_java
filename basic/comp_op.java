public class comp_op
{
    public static void main(String args[])
    {
        System.out.println("");
        System.out.println("comparision operator");

        int a=20,b=10,c=20;
        if(a>b)
            System.out.println("a is greater than b");
        if(a==c)
            System.out.println("both variable r same");
        if(a!=b)
            System.out.println("a is not equal to b");

    //..................................................................................
        System.out.println("logical operator");
        if(a>=b && a>=c)
            System.out.println("a is greter");
       else if(b>=c && b>=a)
            System.out.println("b is greter");
       else
            System.out.println("c is greater");

    }
}

/*
Rules for Java Method Overriding
it is a runtime polymorphisam
The method must have the same name as in the parent class
The method must have the same parameter as in
 the parent class.
*/
public class method_override
{
    public static void main(String args[])
    {
        b1 bobj=new b1();
        bobj.disp();
    }
}
class a1
{
    
    void disp()
    {
        System.out.println("base method call");
    }
}
class b1 extends a1
{
    
        void disp()
        {
            System.out.println("child method call");

        }
}

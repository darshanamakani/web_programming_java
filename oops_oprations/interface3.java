//interface inheritance
public class interface3
{
    public static void main(String args[])
    {  
        testing obj = new testing();  
        obj.print();  
        obj.show();  
    }
}  
interface printable
{  
    void print();  
}  
interface showable extends printable
{  
    void show();  
}  
class testing implements showable
{  
    public void print()
    {
        System.out.println("Hello");
    }  
    public void show()
    {
        System.out.println("Welcome");
    }  
}  
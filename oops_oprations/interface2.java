//multiple inheritance with interface
public class interface2
{
    public static void main(String args[])
    {  
        drawing obj = new drawing();  
        obj.print();  
        obj.show();  
    }
}  
interface printable
{  
    void print();  
}  
interface showable
{  
    void show();  
}  
class drawing implements printable,showable
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
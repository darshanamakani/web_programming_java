public class multilevel_inherit
{  
    public static void main(String args[])
    {  
        subject s=new subject();  
        s.stream();  
        s.theame();  
        s.sub();  
    
    }
}  

class college
{  
    void stream()
    {
        System.out.println("m.c.a");
    }  
}     
class group extends college
{  
    void theame()
    {
        System.out.println("information technology");
    }  
}  
class subject extends group
{  
    void sub()
    {   
        System.out.println("java...");
    }  
}  

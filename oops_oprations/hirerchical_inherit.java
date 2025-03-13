public class hirerchical_inherit
{  
    public static void main(String args[])
    {  
        subject s=new subject();  
        group g=new group();
        s.stream();  
       g.theame();  
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
class subject extends college
{  
    void sub()
    {   
        System.out.println("java...");
    }  
}  

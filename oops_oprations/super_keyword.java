/*
--super keyword always use in sub class constructor
--it must be first statement in derived class 
--derived class constructor call the base class constructor 

*/
public class super_keyword
{
    public static void main(String args[])
    {
        mybox m=new mybox(2,5,3);
        int a=m.area();
        int v=m.volume();
        System.out.println("area="+a);
        System.out.println("volume="+v);
    }
}
class box
{
        int height,width;
        box(int h,int w)
        {
            height=h;
            width=w;
        }
        int area()
        {
            return(height * width);
        }
}
class mybox extends box
{
    int depth;
    mybox(int h,int w,int d)
    {
        super(h,w);
        depth=d;
   }
   int volume()
   {
    return(height*width*depth);
   }
}
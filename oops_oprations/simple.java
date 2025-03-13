class simple
{
    int i,j;
    void getdata(int x,int y)
    {
        i=x;
        j=y;
    }
    public static void main(String args[])
    {
        simple s1=new simple();
        s1.getdata(10,20);
        System.out.println(s1.i);
        System.out.println(s1.j);
        
    }
}
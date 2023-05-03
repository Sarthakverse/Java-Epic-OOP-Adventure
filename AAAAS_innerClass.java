class outer
{
    int x = 10;

    class inner
    {
        int y = 20 ;
        public void innerdisplay()
        {
            System.out.println(x+" "+y);
           
        }
       
    }
    public void outerdisplay()
    {
        inner i=new inner();
        i.innerdisplay();
        System.out.println(i.y);
    }

   
}

public class AAAAS_innerClass {
    public static void main(String arg[])
    {
        outer o = new outer();

        o.outerdisplay();

        outer.inner oi = new outer().new inner();
       oi.innerdisplay();
    }
    
}

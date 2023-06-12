// passing objects as parameter 
// in functions
class senior
{
    private int x ;
    private float y ;

    public void setmeth(int i , float j)
    {
        x=i;
        y=j;
    }

    public void showdata()
    {
        System.out.println(x+" "+y);
    }
}

public class passingobjectsasdata {
    public static void main(String arg[])
    {
        senior obj = new senior();

        obj.setmeth(10,1.50f);
        obj.showdata();

        fun(obj); //object passed as a parameter
        obj.showdata();

    
    }
    static void fun(senior l) //when we manipulate the obj...original object gets modified
    {
       l.setmeth(13,3.50f);
    }
}

class outer
{
    static int x = 10 ;
           int y = 20 ;

    public void display()
    {
        class inner
        {
            public void show()
            {
                System.out.println("hello there !! ");

            }
        }
        inner i = new inner();
        i.show();

        /*OR
             new inner().show().....this will create an object and directly call the method show() , 
                                     object has no refrence so only this line will get executed
         */
    }
}
public class AAAAT_staticInnerClass {

    public static void main(String arg[])
    {
        outer o = new outer();
        o.display();
    }
}

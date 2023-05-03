

class test
{
    static int x = 10 ;
    int y = 20 ;
    
    public void show()
    {
        System.out.println(x+" "+y);
    }

    static void showw()
    {
       /*System.out.println(x+" "+y); // u will not be able to acces y because stauc methods can 
                                    // access only static members of the outer class. */ 
        System.out.println(x);
    }
}

public class AAAAW_anotherExampleOfstatic {
    public static void main(String arg[])
    {
        test t = new test();

        t.show();

        t.showw(); // this is not right way of calling static method.

        test.showw(); //static method are called by using class name diectly.
    }
}

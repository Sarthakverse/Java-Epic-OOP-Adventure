//this as parameter
class test{
    private int a;
    private int b;

    //default constructor
    public test()
    {
       a=10;
       b=20;
    }

    void display(test obj)
    {
        System.out.println("a="+a+" b="+b);
    }

    void get()
    {
        display(this); //parameter
    }
}

public class UsingThisAsMethodParameter {
    public static void main(String arg[])
    {
       test object = new test();
       object.get();
    }
}

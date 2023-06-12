//return this
class test
{
    private int a;
    private int b;

    public test()
    {
        a=10;
        b=20;
    }

    test get() { return this; }

    void display()
    {
        System.out.println("a="+a+" b="+b);
    }

}
public class ThisKeywordToReturnCurrentClassInstance {
    public static void main(String arg[])
    {
        test object = new test();
        object.get().display();
    }
}

class test
{
    private int a;
    private int b;

    public test()
    {
        this(10,20);// calling of constructor using this
        System.out.println("inside non parametrized constructor");
    }

    public test(int a , int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("inside parametrized constructor");
    }
}
public class thisToInvokeCurrentClassConstructor {
    public static void main(String arg [])
{
    test t = new test();
    
}

}

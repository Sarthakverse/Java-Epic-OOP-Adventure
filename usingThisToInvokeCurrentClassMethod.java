//invoking current calss method 

class test
{
    void display()
    {
        this.show(); // invoking current class method
        System.out.println("inside display function");
    }

    void show()
    {
        System.out.println("inside show function");
    }
}
public class usingThisToInvokeCurrentClassMethod {
    public static void main(String arg[])
    {
        test object = new test();
        object.display();
    }

}

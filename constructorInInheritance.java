class A
{
   int a;
   
   public A()
   {
    System.out.println("parent constructor");
   }
}

class B extends A
{
    int b;

    public B()
    {
        super(); // will call parent constructor
                 // even if u dont write [ super() ] then compiler automatically calls
        System.out.println("child constructor");
    }
}

public class constructorInInheritance {
    public static void main(String arg[])
    {
        B obj = new B();
    }
}

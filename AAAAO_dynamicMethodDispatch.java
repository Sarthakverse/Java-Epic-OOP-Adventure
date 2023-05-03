class A
{
    // this is a super class

    public void meth1()
    {
        System.out.println("method1");
    }

    public void meth2()
    {
        System.out.println("method2");

    }
}

class B extends A 
{
    public void meth2() //Overriding
    {
        System.out.println("submeth3");
    }
    
    public void meth3()
    {
        System.out.println("meth4");
    }
}
public class AAAAO_dynamicMethodDispatch
{
    public static void main(String arg[])
    {
        A s= new B(); //THis is dynamic method dispatch
        /*since the object is of sub class B therefore methods of this class will only be called */ 

        s.meth1();
        s.meth2();
    }
}

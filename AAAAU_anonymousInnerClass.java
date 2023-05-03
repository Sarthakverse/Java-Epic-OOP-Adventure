//ANONYMOUS inner class

abstract class my  //OR interface my
{
    abstract public void show();
}

class outer
{
    public void method()
    {
        //creating anonymous class 👇
        my m = new my(){ public void show() { System.out.println("Hello world "); } };
        m.show();

        //or
        // new my(){ public void show() { System.out.println("Hello world "); }}.show() ;
        // no refrence will be created but yes show will be called..
    }
    
}

public class AAAAU_anonymousInnerClass {
    public static void main(String arg[])
    {
        outer o = new outer();
        o.method();
        
    }
}

//finalize function is called when an object is destroyed
//garbage collector is the (caller)
//jvm has facility of  garbage collector

class example
{
    private int data;

    public example()
    {
       System.out.println("inside the constructor"); 
    }

    protected void finalize() throws Throwable{
        super.finalize();
    }
}

public class finalizefunction {
    public static void main(String arg[])
    {
        example e = new example();

    }
}

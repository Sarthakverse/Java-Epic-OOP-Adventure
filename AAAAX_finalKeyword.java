class A
{
    public int X= 10 ; //1st way of intializing final variable
    final int Y = 20 ;  
    static final int Z; 
    final int W;

    static 
    {
        Z=20; //2nd way , static can access only static members
    }

    public A()
    {
        W = 30; //3rd way , inside a constructor;
        System.out.println(X+" "+Y+" "+Z+" "+W);
    }

    
}

public class AAAAX_finalKeyword {
    public static void main(String [] arg)
    {
        A a = new A();
        
    }
}

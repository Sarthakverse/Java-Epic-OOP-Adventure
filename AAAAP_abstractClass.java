abstract class a
{
    //super class
    public a()
    {
        System.out.println("super class");
    }

    public void meth1()
    {
        System.out.println("meth1");
    } 

    abstract void meth2();
}

class sub extends a{

    void meth2()
    {
        System.out.println("meth2...sub class");
    }

}
public class AAAAP_abstractClass {
    public static void main(String [] arg)
    {
        a s1;//refrencing can be done but object cant be instantiate

       // s1 = new a(); 

       sub s2 = new sub();
       s2.meth1();
        s2.meth2();
    }
}

class test
{   
    private int a;
    private int b;

    public test(int a , int b)
    {
        this.a=a;
        this.b=b;
    }

    void display()
    {
        System.out.println("a="+a+" b= "+b);
    }

}


public class thistoRferrCurrentClass {
    public static void main(String arg [])
    {
        test t=new test(10,20);
        t.display();
    }

}

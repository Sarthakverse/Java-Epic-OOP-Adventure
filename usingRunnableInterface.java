class mythread1 implements Runnable
{
    public void run()
    {
        System.out.println("i am a thread");
    }
}
class mythread2 implements Runnable
{
    public void run()
    {
        System.out.println("i am a thread 2");
    }
}

public class usingRunnableInterface {
  public static void main(String arg [])
  {
        mythread1 mt1 =new mythread1();
        Thread t1 = new Thread(mt1);
    
        mythread2 mt2 =new mythread2();
        Thread t2 = new Thread(mt2);

        t1.start();
        t2.start();

        


  }  
}

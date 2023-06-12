class mythread extends Thread
{
    public mythread(String name)
    {
        super(name);
    }

    public void run()
    {
       
        System.out.println("i am a thread");
    }
}

public class ConstructorsInThread {
  public static void main(String arg [])
  {
    mythread mt = new mythread("Sarthak Rastogi");
    mythread mt2 = new mythread("Sarthak Rastogi");
    mt.start();
    mt2.start();
    System.out.println("the id of thread is : " + mt.threadId());
    System.out.println("the name of thread is : " + mt.getName());
    
    System.out.println("the id of thread is : " + mt2.threadId());
    System.out.println("the name of thread is : " + mt2.getName());

  }   
}

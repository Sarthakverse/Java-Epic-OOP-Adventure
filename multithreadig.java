class mythread extends Thread 
{
  @Override
  public void run()
  {
    int i=0;
     while(i<400)
     {
        System.out.println("hello thread 1");
        i++;
     }
   
  }

}

class mythread2 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<400)
        {
            System.out.println("hello thread 2");
            i++;
        }
    }
}

public class multithreadig {
    public static void main(String arg []) throws Exception
    {
        mythread obj1 = new mythread();
        mythread2 obj2 = new mythread2();
        obj1.start();
        obj2.start();
    }
}

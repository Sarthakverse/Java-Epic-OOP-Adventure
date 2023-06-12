import java.io.*;
class mythread extends Thread
{
    
    public mythread(String name)
    {
        super(name);
    }
    
    
    
    
    public void run()
    {
        int count = 1 ;
        while (true)
        {
            System.out.println(count++);
       try{ Thread.sleep(1000 ) ; } catch(Exception e){ System.out.println(e); } //this line will slow down the
                                                                                        //    process of printing 
                                                                                       //becuse cpu will sleep for some time
        }
    }


}




public class interrupt {
    public static void main(String arg []) throws Exception
    {
        mythread mt = new mythread("my thread 1");
        mt.start();
        mt.interrupt(); //interrupts the mt.start() for some time...
       
        
    }
}

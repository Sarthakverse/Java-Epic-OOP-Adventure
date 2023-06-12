class mythread extends Thread
{
   public void run()
   {
     int i =0 ; 
     while(i<40)
     {
        System.out.println("hello there");
        try{ Thread.sleep(40); }
        catch(Exception e) {System.out.println(e);}
        i++;
     }
   }
}

class mythread2 extends Thread
{
   public void run()
   {
     int i =0 ; 
     while(i<40)
     {
        System.out.println("huihuihui");
       i++;
    
    }
   }
}
public class multithreadingmethods {
    public static void main(String arg[])
    {
        mythread mt = new mythread();
        mythread2 mt2 = new mythread2();
        mt.start();
        try { mt.join();} //mt.join will wait before showing msg  
        catch(Exception e) { System.out.println(e); }  
        mt2.start();
    }
}

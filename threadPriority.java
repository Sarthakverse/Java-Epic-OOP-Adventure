
class mythread extends Thread
{
    public mythread(String name)
    {
        super(name);
    } 
    public void run()
    {
        int i=0;
        while(i<400)
        {
            System.out.println("thank you "+ this.getName());
            i++;
        }
    }
}
public class threadPriority {
    public static void main(String arg[])
    {
        mythread mt1 = new mythread("lamar");
        mythread mt2 = new mythread("dan");
        mythread mt3 = new mythread("kira");
        mythread mt4 = new mythread("michael");
        mythread mt5 = new mythread("nick");

        mt1.setPriority(Thread.MAX_PRIORITY);  
        mt2.setPriority(Thread.MIN_PRIORITY);  
        mt3.setPriority(Thread.MIN_PRIORITY);  
        mt4.setPriority(Thread.MIN_PRIORITY);  
        mt5.setPriority(Thread.MIN_PRIORITY);  
        
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
    }
}

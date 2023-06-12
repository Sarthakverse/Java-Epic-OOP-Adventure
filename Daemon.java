class mythread extends Thread
{
    public mythread(String name)
    {
        super(name);
    }

    public void run()
    {
        int count = 1;
        while(true)
        {
            System.out.println(count++);
        }
    }
}


public class Daemon
{
    public static void main(String arg []) throws Exception
    {

        mythread mt = new mythread("my thread 2");
        mt.setDaemon(true) ; // if the main method is terminating then daemon thread will also terminate
                                // t.start() will not work
                                // here u will see that nothing is printed...as a consequence of daemon thread termination
        mt.start(); 

      // try {Thread.sleep(1);} catch(Exception e){System.out.println(e);} //THIS LINE WILL MAKE THREAD SLEEP FOR 1MS
                                                                           // THUS DAEMON THREAD WILL NOT TERMINATE FOR 1MS
                                                                           // AND WE WILL SE THE NUMBERS PRINTED
        
      Thread mainThread = Thread.currentThread();
      mainThread.join(); //this will help join main thread to join other curently running thread
                        //so main thread will wait for other thread to terminate together.
      
    }
}
class my implements Runnable  // Runnable is an interface containing only one abstract method called "run"
{
    public void run() // the method must be overrided
    {
         int i =1 ;
         while(true)
         {
            System.out.println(i+"hello");
            i++ ;
         }
    }
}  
public class mutiprogramminUsingInterface {
    public static void main(String arg [])
    {
        my m = new my ();
        Thread  t = new Thread(m);// object of thread being atttached to object of class ' my ' 

        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"world");
            i++ ;
        }

    }
}

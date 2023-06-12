// thread class helps in multiprogramming
// multiprograming(multitasking) = running more than one program at one time.
class my extends Thread
{
    
    // we must override the run method now

    public void run()
    {
        int i = 1;
        while(true)
        {
            System.out.println(i+"hello");
            i++;
        }
   
     } 
}



public class Thhread {
    public static void main(String arg [])
    {
         // creating the object of thread class
         
         my t = new my();
         t.start(); //call start to stimulate 2 control flows...
                    // one control flow prints  "i+hello"...other prints "i+world"

        int i = 1;
        while(true)
        {
            System.out.println(i+"world");
            i++ ;
        }
            
    }
}


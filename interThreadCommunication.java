class Mydata
{
    int value=0; // we will change the value of this property
    boolean flag  = true ;
    synchronized public void set(int v) //set is for the producer
    {
      while(flag!=true) 
      try{wait();} catch(Exception e){}
        value = v;
        flag = false;
        notify();
    }

    synchronized public int get()//get is for consumer
    {
        int x = 0;
        while(flag!=false) 
      try{wait();} catch(Exception e){}
        x =value;
        flag = true;
        notify();
        return x;
    }

}

class producer extends Thread
{
   Mydata d;
   producer(Mydata dat)
   {
      d = dat;
   } 

   public void run()
   {
      int i =1;
      while(true)
      {
        d.set(i);
        System.out.println("producer : "+i);
        i++;
      }
   }
}

class consumer extends Thread
{
   Mydata d;
   consumer(Mydata dat)
   {
      d = dat;
   } 

   public void run() 
   {
      int value;
      
      while(true)
      {
        value = d.get();
        System.out.println("consumer : "+value);
       
        
      }
   }
}

public class interThreadCommunication {
   public static void main(String arg [])
   {
      Mydata d = new Mydata();
      producer p = new producer(d);
      consumer c =new consumer(d);

      p.start();
      c.start();
   }
}

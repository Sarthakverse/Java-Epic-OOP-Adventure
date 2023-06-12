class mydata
{
   synchronized public void display(String str)
    {
       /* OR  synchronized(this)
        {
            for(int i=0 ; i<str.length() ; i++)
         {
           System.out.print(str.charAt(i));
         }
        }*/ 
       
        

        for(int i=0 ; i<str.length() ; i++)
        {
            System.out.print(str.charAt(i));
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }

}

class mythread1 extends Thread
{
    mydata d; //refrence of mydata.

    public mythread1(mydata d) //constructor
    {
        this.d = d;
    }

    public void run()
    {
        d.display("Hello_World");
    }
}

class mythread2 extends Thread
{
    mydata d; //refrence of mydata.

    public mythread2(mydata d )//constructor
    {
        this.d = d;
    }

    public void run()
    {
        d.display(" welcome");
    }
}

public class Synchronizationdemo {
    public static void main(String arg[])
    {
        mydata d = new mydata();

        mythread1 t1 = new mythread1(d);
        mythread2 t2 = new mythread2(d);

        t1.start();  // run method has to be overrided
        t2.start();
    }
}

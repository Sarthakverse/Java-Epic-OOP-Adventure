class myt extends Thread
{
    public myt (String name)
    {
        super(name); // since super class is thread and we wnat to give name to it so we have upassed super(name);
        setPriority(MAX_PRIORITY);
    }
}

/*

class mythread implements Runnable
{
  public void run(){ }
}

*/

public class threadclass {
    public static void main(String [] arg) throws Exception
    {
        //Thread t =new Thread(new mythread(),"my thread 1"); // in case of implement
        myt t1 = new myt("helllo extends");             //in case of extending

        System.out.println(t1.getName());
        System.out.println(t1.getId());
        System.out.println(t1.getPriority()); //MAX_PRIORITY = 10 as per line 6
        System.out.println(t1.getState());
        t1.start(); 
       System.out.println(t1.getState());
        System.out.println(t1.isAlive());
    } 
}

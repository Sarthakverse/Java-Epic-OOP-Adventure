

class ATM
{
   synchronized public void checkbalance(String name)
    {
        System.out.print(name+" Checking");// prints name checking
        try{Thread.sleep(1000);} catch(Exception e){} //sleeps for 1000millisec
        System.out.println("balance"); //and then prints the balance
    }       
    

   synchronized public void withdraw(String name, int amount)
    {
        System.out.print(name + "withdrawing");
        try{Thread.sleep(1000);} catch(Exception e){}
        System.out.println(" "+amount);
    }
}

class customer extends Thread
{
    String name;
    int amount;
    ATM atm; //reference to ATM 

    customer(String n,ATM a,int amt)
    {
        name = n;
        atm = a;
        amount = amt;
    }

    public void useATM()
    {
        atm.checkbalance(name);
        atm.withdraw(name, amount);
    }
    public void run() //must be overrided
    {
        useATM();
    }
}
public class atmMachine {
    public static void main(String arg [])
    {
         ATM atm=new ATM();
         customer c1 = new customer("Sarthak",atm,500000000);
         customer c2 = new customer("Ayush",atm,900000000);
       //  c1.useATM();
 
         c1.start();
         c2.start();
    }
}


